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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.auth.CCPMemberRequirementsReportV01;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.entity.MarginAmountRequirement;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Obligations of a clearing member with respect to a central counterparty that
 * are calculated based on intraday positions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraDayRequirement1#mmIntraDayMarginCall
 * IntraDayRequirement1.mmIntraDayMarginCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraDayRequirement1#mmPeakInitialMarginLiability
 * IntraDayRequirement1.mmPeakInitialMarginLiability}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraDayRequirement1#mmPeakVariationMarginLiability
 * IntraDayRequirement1.mmPeakVariationMarginLiability}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraDayRequirement1#mmAggregatePeakLiability
 * IntraDayRequirement1.mmAggregatePeakLiability}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraDayRequirement1#mmMarginAccountIdentification
 * IntraDayRequirement1.mmMarginAccountIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.MarginAmountRequirement
 * MarginAmountRequirement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CCPMemberRequirementsReportV01#mmIntraDayRequirementAmount
 * CCPMemberRequirementsReportV01.mmIntraDayRequirementAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IntraDayRequirement1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Obligations of a clearing member with respect to a central counterparty that are calculated based on intraday positions."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IntraDayRequirement1", propOrder = {"intraDayMarginCall", "peakInitialMarginLiability", "peakVariationMarginLiability", "aggregatePeakLiability", "marginAccountIdentification"})
public class IntraDayRequirement1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "IntraDayMrgnCall", required = true)
	protected ActiveCurrencyAndAmount intraDayMarginCall;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraDayRequirement1
	 * IntraDayRequirement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntraDayMrgnCall"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntraDayMarginCall"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total aggregate value of collateral called intraday, excluding repayments.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIntraDayMarginCall = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraDayRequirement1.mmObject();
			isDerived = false;
			xmlTag = "IntraDayMrgnCall";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntraDayMarginCall";
			definition = "Total aggregate value of collateral called intraday, excluding repayments.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "PeakInitlMrgnLblty", required = true)
	protected ActiveCurrencyAndAmount peakInitialMarginLiability;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraDayRequirement1
	 * IntraDayRequirement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PeakInitlMrgnLblty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PeakInitialMarginLiability"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Peak increase in initial margin liability for the account during the day."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPeakInitialMarginLiability = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraDayRequirement1.mmObject();
			isDerived = false;
			xmlTag = "PeakInitlMrgnLblty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PeakInitialMarginLiability";
			definition = "Peak increase in initial margin liability for the account during the day.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "PeakVartnMrgnLblty", required = true)
	protected ActiveCurrencyAndAmount peakVariationMarginLiability;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraDayRequirement1
	 * IntraDayRequirement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PeakVartnMrgnLblty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PeakVariationMarginLiability"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Peak loss uncollateralised variation margin liability on the margin account during the day.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPeakVariationMarginLiability = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraDayRequirement1.mmObject();
			isDerived = false;
			xmlTag = "PeakVartnMrgnLblty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PeakVariationMarginLiability";
			definition = "Peak loss uncollateralised variation margin liability on the margin account during the day.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "AggtPeakLblty", required = true)
	protected ActiveCurrencyAndAmount aggregatePeakLiability;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraDayRequirement1
	 * IntraDayRequirement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AggtPeakLblty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AggregatePeakLiability"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Peak intraday liability (sum of increase in initial margin relative to end of day plus sum of decrease in variation margin relative to end of day) for a margin account during the day. Liabilities are shown as positive integers.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAggregatePeakLiability = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraDayRequirement1.mmObject();
			isDerived = false;
			xmlTag = "AggtPeakLblty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregatePeakLiability";
			definition = "Peak intraday liability (sum of increase in initial margin relative to end of day plus sum of decrease in variation margin relative to end of day) for a margin account during the day. Liabilities are shown as positive integers.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "MrgnAcctId", required = true)
	protected GenericIdentification165 marginAccountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification165
	 * GenericIdentification165}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraDayRequirement1
	 * IntraDayRequirement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrgnAcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginAccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the account used to calculate margin requirements and determine intraday calls.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMarginAccountIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraDayRequirement1.mmObject();
			isDerived = false;
			xmlTag = "MrgnAcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginAccountIdentification";
			definition = "Identification of the account used to calculate margin requirements and determine intraday calls.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification165.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IntraDayRequirement1.mmIntraDayMarginCall, com.tools20022.repository.msg.IntraDayRequirement1.mmPeakInitialMarginLiability,
						com.tools20022.repository.msg.IntraDayRequirement1.mmPeakVariationMarginLiability, com.tools20022.repository.msg.IntraDayRequirement1.mmAggregatePeakLiability,
						com.tools20022.repository.msg.IntraDayRequirement1.mmMarginAccountIdentification);
				messageBuildingBlock_lazy = () -> Arrays.asList(CCPMemberRequirementsReportV01.mmIntraDayRequirementAmount);
				trace_lazy = () -> MarginAmountRequirement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IntraDayRequirement1";
				definition = "Obligations of a clearing member with respect to a central counterparty that are calculated based on intraday positions.";
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveCurrencyAndAmount getIntraDayMarginCall() {
		return intraDayMarginCall;
	}

	public IntraDayRequirement1 setIntraDayMarginCall(ActiveCurrencyAndAmount intraDayMarginCall) {
		this.intraDayMarginCall = Objects.requireNonNull(intraDayMarginCall);
		return this;
	}

	public ActiveCurrencyAndAmount getPeakInitialMarginLiability() {
		return peakInitialMarginLiability;
	}

	public IntraDayRequirement1 setPeakInitialMarginLiability(ActiveCurrencyAndAmount peakInitialMarginLiability) {
		this.peakInitialMarginLiability = Objects.requireNonNull(peakInitialMarginLiability);
		return this;
	}

	public ActiveCurrencyAndAmount getPeakVariationMarginLiability() {
		return peakVariationMarginLiability;
	}

	public IntraDayRequirement1 setPeakVariationMarginLiability(ActiveCurrencyAndAmount peakVariationMarginLiability) {
		this.peakVariationMarginLiability = Objects.requireNonNull(peakVariationMarginLiability);
		return this;
	}

	public ActiveCurrencyAndAmount getAggregatePeakLiability() {
		return aggregatePeakLiability;
	}

	public IntraDayRequirement1 setAggregatePeakLiability(ActiveCurrencyAndAmount aggregatePeakLiability) {
		this.aggregatePeakLiability = Objects.requireNonNull(aggregatePeakLiability);
		return this;
	}

	public GenericIdentification165 getMarginAccountIdentification() {
		return marginAccountIdentification;
	}

	public IntraDayRequirement1 setMarginAccountIdentification(com.tools20022.repository.msg.GenericIdentification165 marginAccountIdentification) {
		this.marginAccountIdentification = Objects.requireNonNull(marginAccountIdentification);
		return this;
	}
}