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

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.ISAType1Code;
import com.tools20022.repository.datatype.Extended350Code;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.PortfolioTransfer;
import com.tools20022.repository.entity.SubscriptionExecution;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Year in which the ISA plan is issued.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue1#CurrentYearTypeOrExtendedCurrentYearTypeRule
 * ISAYearsOfIssue1.CurrentYearTypeOrExtendedCurrentYearTypeRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue1#mmCurrentYearType
 * ISAYearsOfIssue1.mmCurrentYearType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue1#mmExtendedCurrentYearType
 * ISAYearsOfIssue1.mmExtendedCurrentYearType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue1#mmCashComponentIndicator
 * ISAYearsOfIssue1.mmCashComponentIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue1#mmPreviousYears
 * ISAYearsOfIssue1.mmPreviousYears}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue1#mmCurrentYearSubscriptionDetails
 * ISAYearsOfIssue1.mmCurrentYearSubscriptionDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PortfolioTransfer
 * PortfolioTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCurrentYearRule#forISAYearsOfIssue1
 * ConstraintCurrentYearRule.forISAYearsOfIssue1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ISAYearsOfIssue1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Year in which the ISA plan is issued."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ISAYearsOfIssue1", propOrder = {"currentYearType", "extendedCurrentYearType", "cashComponentIndicator", "previousYears", "currentYearSubscriptionDetails"})
public class ISAYearsOfIssue1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CurYrTp")
	protected ISAType1Code currentYearType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue1
	 * ISAYearsOfIssue1}</li>
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
	 * definition} =
	 * "Current year ISA is an ISA that was issued during the current fiscal year."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrentYearType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PortfolioTransfer.mmCurrentYearISAType;
			componentContext_lazy = () -> com.tools20022.repository.msg.ISAYearsOfIssue1.mmObject();
			isDerived = false;
			xmlTag = "CurYrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentYearType";
			definition = "Current year ISA is an ISA that was issued during the current fiscal year.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISAType1Code.mmObject();
		}
	};
	@XmlElement(name = "XtndedCurYrTp")
	protected Extended350Code extendedCurrentYearType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue1
	 * ISAYearsOfIssue1}</li>
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
			businessElementTrace_lazy = () -> PortfolioTransfer.mmCurrentYearISAType;
			componentContext_lazy = () -> com.tools20022.repository.msg.ISAYearsOfIssue1.mmObject();
			isDerived = false;
			xmlTag = "XtndedCurYrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedCurrentYearType";
			definition = "Current year ISA is an ISA that was issued during the current fiscal year.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}
	};
	@XmlElement(name = "CshCmpntInd", required = true)
	protected YesNoIndicator cashComponentIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue1
	 * ISAYearsOfIssue1}</li>
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
			businessElementTrace_lazy = () -> PortfolioTransfer.mmCashComponentIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.ISAYearsOfIssue1.mmObject();
			isDerived = false;
			xmlTag = "CshCmpntInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashComponentIndicator";
			definition = "Indicates whether the ISA contains a cash component asset for transfer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "PrvsYrs")
	protected PreviousYear1 previousYears;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue1
	 * ISAYearsOfIssue1}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.ISAYearsOfIssue1.mmObject();
			isDerived = false;
			xmlTag = "PrvsYrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousYears";
			definition = "Selection of investment plans issued during previous years.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PreviousYear1.mmObject();
		}
	};
	@XmlElement(name = "CurYrSbcptDtls")
	protected SubscriptionInformation1 currentYearSubscriptionDetails;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue1
	 * ISAYearsOfIssue1}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.ISAYearsOfIssue1.mmObject();
			isDerived = false;
			xmlTag = "CurYrSbcptDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentYearSubscriptionDetails";
			definition = "Specifies the amounts already subscribed for the current year.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SubscriptionInformation1.mmObject();
		}
	};
	/**
	 * Either CurrentYearType or ExtendedCurrentYearType may be present, but not
	 * both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue1
	 * ISAYearsOfIssue1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue1#mmCurrentYearType
	 * ISAYearsOfIssue1.mmCurrentYearType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue1#mmExtendedCurrentYearType
	 * ISAYearsOfIssue1.mmExtendedCurrentYearType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentYearTypeOrExtendedCurrentYearTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either CurrentYearType  or ExtendedCurrentYearType  may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor CurrentYearTypeOrExtendedCurrentYearTypeRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentYearTypeOrExtendedCurrentYearTypeRule";
			definition = "Either CurrentYearType  or ExtendedCurrentYearType  may be present, but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.ISAYearsOfIssue1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ISAYearsOfIssue1.mmCurrentYearType, com.tools20022.repository.msg.ISAYearsOfIssue1.mmExtendedCurrentYearType);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ISAYearsOfIssue1.mmCurrentYearType, com.tools20022.repository.msg.ISAYearsOfIssue1.mmExtendedCurrentYearType,
						com.tools20022.repository.msg.ISAYearsOfIssue1.mmCashComponentIndicator, com.tools20022.repository.msg.ISAYearsOfIssue1.mmPreviousYears,
						com.tools20022.repository.msg.ISAYearsOfIssue1.mmCurrentYearSubscriptionDetails);
				trace_lazy = () -> PortfolioTransfer.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCurrentYearRule.forISAYearsOfIssue1);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "ISAYearsOfIssue1";
				definition = "Year in which the ISA plan is issued.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ISAYearsOfIssue1.CurrentYearTypeOrExtendedCurrentYearTypeRule);
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ISAType1Code> getCurrentYearType() {
		return currentYearType == null ? Optional.empty() : Optional.of(currentYearType);
	}

	public ISAYearsOfIssue1 setCurrentYearType(ISAType1Code currentYearType) {
		this.currentYearType = currentYearType;
		return this;
	}

	public Optional<Extended350Code> getExtendedCurrentYearType() {
		return extendedCurrentYearType == null ? Optional.empty() : Optional.of(extendedCurrentYearType);
	}

	public ISAYearsOfIssue1 setExtendedCurrentYearType(Extended350Code extendedCurrentYearType) {
		this.extendedCurrentYearType = extendedCurrentYearType;
		return this;
	}

	public YesNoIndicator getCashComponentIndicator() {
		return cashComponentIndicator;
	}

	public ISAYearsOfIssue1 setCashComponentIndicator(YesNoIndicator cashComponentIndicator) {
		this.cashComponentIndicator = Objects.requireNonNull(cashComponentIndicator);
		return this;
	}

	public Optional<PreviousYear1> getPreviousYears() {
		return previousYears == null ? Optional.empty() : Optional.of(previousYears);
	}

	public ISAYearsOfIssue1 setPreviousYears(com.tools20022.repository.msg.PreviousYear1 previousYears) {
		this.previousYears = previousYears;
		return this;
	}

	public Optional<SubscriptionInformation1> getCurrentYearSubscriptionDetails() {
		return currentYearSubscriptionDetails == null ? Optional.empty() : Optional.of(currentYearSubscriptionDetails);
	}

	public ISAYearsOfIssue1 setCurrentYearSubscriptionDetails(com.tools20022.repository.msg.SubscriptionInformation1 currentYearSubscriptionDetails) {
		this.currentYearSubscriptionDetails = currentYearSubscriptionDetails;
		return this;
	}
}