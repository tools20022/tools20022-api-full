/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMXor;
import com.tools20022.repository.codeset.ISAType1Code;
import com.tools20022.repository.datatype.Extended350Code;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.PortfolioTransfer;
import com.tools20022.repository.entity.SubscriptionExecution;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;

/**
 * Year in which the ISA plan is issued.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue3#mmCurrentYearTypeOrExtendedCurrentYearTypeRule
 * ISAYearsOfIssue3.mmCurrentYearTypeOrExtendedCurrentYearTypeRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue3#mmCurrentYearType
 * ISAYearsOfIssue3.mmCurrentYearType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue3#mmExtendedCurrentYearType
 * ISAYearsOfIssue3.mmExtendedCurrentYearType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue3#mmCashComponentIndicator
 * ISAYearsOfIssue3.mmCashComponentIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue3#mmCurrentYearSubscriptionDetails
 * ISAYearsOfIssue3.mmCurrentYearSubscriptionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue3#mmPreviousYears
 * ISAYearsOfIssue3.mmPreviousYears}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PortfolioTransfer
 * PortfolioTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ISAYearsOfIssue3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Year in which the ISA plan is issued."</li>
 * </ul>
 */
public class ISAYearsOfIssue3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ISAType1Code currentYearType;
	/**
	 * ISA that was issued during the current fiscal year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.ISAType1Code
	 * ISAType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmCurrentYearISAType
	 * PortfolioTransfer.mmCurrentYearISAType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue3
	 * ISAYearsOfIssue3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurYrTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentYearType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ISA that was issued during the current fiscal year."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrentYearType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.mmCurrentYearISAType;
			componentContext_lazy = () -> ISAYearsOfIssue3.mmObject();
			isDerived = false;
			xmlTag = "CurYrTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentYearType";
			definition = "ISA that was issued during the current fiscal year.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISAType1Code.mmObject();
		}
	};
	protected Extended350Code extendedCurrentYearType;
	/**
	 * Current year ISA is an ISA that was issued during the current fiscal
	 * year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Extended350Code
	 * Extended350Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmCurrentYearISAType
	 * PortfolioTransfer.mmCurrentYearISAType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue3
	 * ISAYearsOfIssue3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedCurYrTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedCurrentYearType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Current year ISA is an ISA that was issued during the current fiscal year."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExtendedCurrentYearType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.mmCurrentYearISAType;
			componentContext_lazy = () -> ISAYearsOfIssue3.mmObject();
			isDerived = false;
			xmlTag = "XtndedCurYrTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedCurrentYearType";
			definition = "Current year ISA is an ISA that was issued during the current fiscal year.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}
	};
	protected YesNoIndicator cashComponentIndicator;
	/**
	 * Indicates whether the ISA contains a cash component asset for transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmCashComponentIndicator
	 * PortfolioTransfer.mmCashComponentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue3
	 * ISAYearsOfIssue3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshCmpntInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashComponentIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the ISA contains a cash component asset for transfer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCashComponentIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.mmCashComponentIndicator;
			componentContext_lazy = () -> ISAYearsOfIssue3.mmObject();
			isDerived = false;
			xmlTag = "CshCmpntInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashComponentIndicator";
			definition = "Indicates whether the ISA contains a cash component asset for transfer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected SubscriptionInformation1 currentYearSubscriptionDetails;
	/**
	 * Specifies the amounts already subscribed for the current year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionInformation1
	 * SubscriptionInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SubscriptionExecution
	 * SubscriptionExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue3
	 * ISAYearsOfIssue3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurYrSbcptDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentYearSubscriptionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the amounts already subscribed for the current year."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCurrentYearSubscriptionDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SubscriptionExecution.mmObject();
			componentContext_lazy = () -> ISAYearsOfIssue3.mmObject();
			isDerived = false;
			xmlTag = "CurYrSbcptDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentYearSubscriptionDetails";
			definition = "Specifies the amounts already subscribed for the current year.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SubscriptionInformation1.mmObject();
		}
	};
	protected PreviousYear1 previousYears;
	/**
	 * Selection of investment plans issued during previous years.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PreviousYear1
	 * PreviousYear1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue3
	 * ISAYearsOfIssue3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsYrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousYears"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Selection of investment plans issued during previous years."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPreviousYears = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PortfolioTransfer.mmObject();
			componentContext_lazy = () -> ISAYearsOfIssue3.mmObject();
			isDerived = false;
			xmlTag = "PrvsYrs";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousYears";
			definition = "Selection of investment plans issued during previous years.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PreviousYear1.mmObject();
		}
	};
	/**
	 * Either CurrentYearType or ExtendedCurrentYearType may be present, but not
	 * both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue3#mmCurrentYearType
	 * ISAYearsOfIssue3.mmCurrentYearType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue3#mmExtendedCurrentYearType
	 * ISAYearsOfIssue3.mmExtendedCurrentYearType}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue3
	 * ISAYearsOfIssue3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentYearTypeOrExtendedCurrentYearTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either CurrentYearType or ExtendedCurrentYearType may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor mmCurrentYearTypeOrExtendedCurrentYearTypeRule = new MMXor() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentYearTypeOrExtendedCurrentYearTypeRule";
			definition = "Either CurrentYearType or ExtendedCurrentYearType may be present, but not both.";
			messageComponent_lazy = () -> ISAYearsOfIssue3.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ISAYearsOfIssue3.mmCurrentYearType, com.tools20022.repository.msg.ISAYearsOfIssue3.mmExtendedCurrentYearType);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ISAYearsOfIssue3.mmCurrentYearType, com.tools20022.repository.msg.ISAYearsOfIssue3.mmExtendedCurrentYearType,
						com.tools20022.repository.msg.ISAYearsOfIssue3.mmCashComponentIndicator, com.tools20022.repository.msg.ISAYearsOfIssue3.mmCurrentYearSubscriptionDetails,
						com.tools20022.repository.msg.ISAYearsOfIssue3.mmPreviousYears);
				trace_lazy = () -> PortfolioTransfer.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "ISAYearsOfIssue3";
				definition = "Year in which the ISA plan is issued.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ISAYearsOfIssue3.mmCurrentYearTypeOrExtendedCurrentYearTypeRule);
			}
		});
		return mmObject_lazy.get();
	}

	public ISAType1Code getCurrentYearType() {
		return currentYearType;
	}

	public void setCurrentYearType(ISAType1Code currentYearType) {
		this.currentYearType = currentYearType;
	}

	public Extended350Code getExtendedCurrentYearType() {
		return extendedCurrentYearType;
	}

	public void setExtendedCurrentYearType(Extended350Code extendedCurrentYearType) {
		this.extendedCurrentYearType = extendedCurrentYearType;
	}

	public YesNoIndicator getCashComponentIndicator() {
		return cashComponentIndicator;
	}

	public void setCashComponentIndicator(YesNoIndicator cashComponentIndicator) {
		this.cashComponentIndicator = cashComponentIndicator;
	}

	public SubscriptionInformation1 getCurrentYearSubscriptionDetails() {
		return currentYearSubscriptionDetails;
	}

	public void setCurrentYearSubscriptionDetails(com.tools20022.repository.msg.SubscriptionInformation1 currentYearSubscriptionDetails) {
		this.currentYearSubscriptionDetails = currentYearSubscriptionDetails;
	}

	public PreviousYear1 getPreviousYears() {
		return previousYears;
	}

	public void setPreviousYears(com.tools20022.repository.msg.PreviousYear1 previousYears) {
		this.previousYears = previousYears;
	}
}