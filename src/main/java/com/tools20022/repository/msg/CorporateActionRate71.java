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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.RateAndAmountFormat39Choice;
import com.tools20022.repository.choice.RateAndAmountFormat40Choice;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.BiddingConditions;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.entity.Tax;
import com.tools20022.repository.entity.TaxVoucher;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies rates related to a corporate action option.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate71#mmProposedRate
 * CorporateActionRate71.mmProposedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate71#mmOversubscriptionRate
 * CorporateActionRate71.mmOversubscriptionRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate71#mmRequestedWithholdingTaxRate
 * CorporateActionRate71.mmRequestedWithholdingTaxRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate71#mmRequestedSecondLevelTaxRate
 * CorporateActionRate71.mmRequestedSecondLevelTaxRate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionEvent
 * CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionRate71"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies rates related to a corporate action option."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate47
 * CorporateActionRate47}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionRate71", propOrder = {"proposedRate", "oversubscriptionRate", "requestedWithholdingTaxRate", "requestedSecondLevelTaxRate"})
public class CorporateActionRate71 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PropsdRate")
	protected PercentageRate proposedRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmProposedRate
	 * BiddingConditions.mmProposedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate71
	 * CorporateActionRate71}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PropsdRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProposedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate proposed in a remarketing of variable rate notes."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92A::OFFR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate47#mmProposedRate
	 * CorporateActionRate47.mmProposedRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionRate71, Optional<PercentageRate>> mmProposedRate = new MMMessageAttribute<CorporateActionRate71, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmProposedRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate71.mmObject();
			isDerived = false;
			xmlTag = "PropsdRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92A::OFFR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProposedRate";
			definition = "Rate proposed in a remarketing of variable rate notes.";
			previousVersion_lazy = () -> CorporateActionRate47.mmProposedRate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(CorporateActionRate71 obj) {
			return obj.getProposedRate();
		}

		@Override
		public void setValue(CorporateActionRate71 obj, Optional<PercentageRate> value) {
			obj.setProposedRate(value.orElse(null));
		}
	};
	@XmlElement(name = "OvrsbcptRate")
	protected RateAndAmountFormat39Choice oversubscriptionRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat39Choice
	 * RateAndAmountFormat39Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmOversubscriptionRate
	 * BiddingConditions.mmOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate71
	 * CorporateActionRate71}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OvrsbcptRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OversubscriptionRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate of allowed over-subscription."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::OSUB</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate47#mmOversubscriptionRate
	 * CorporateActionRate47.mmOversubscriptionRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionRate71, Optional<RateAndAmountFormat39Choice>> mmOversubscriptionRate = new MMMessageAttribute<CorporateActionRate71, Optional<RateAndAmountFormat39Choice>>() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmOversubscriptionRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate71.mmObject();
			isDerived = false;
			xmlTag = "OvrsbcptRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::OSUB"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OversubscriptionRate";
			definition = "Rate of allowed over-subscription.";
			previousVersion_lazy = () -> CorporateActionRate47.mmOversubscriptionRate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat39Choice.mmObject();
		}

		@Override
		public Optional<RateAndAmountFormat39Choice> getValue(CorporateActionRate71 obj) {
			return obj.getOversubscriptionRate();
		}

		@Override
		public void setValue(CorporateActionRate71 obj, Optional<RateAndAmountFormat39Choice> value) {
			obj.setOversubscriptionRate(value.orElse(null));
		}
	};
	@XmlElement(name = "ReqdWhldgTaxRate")
	protected List<RateAndAmountFormat40Choice> requestedWithholdingTaxRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat40Choice
	 * RateAndAmountFormat40Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmRequestedTaxationRate
	 * TaxVoucher.mmRequestedTaxationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate71
	 * CorporateActionRate71}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdWhldgTaxRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedWithholdingTaxRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Requested tax rate that will be withheld by the tax authorities of the jurisdiction of the issuer, for which a relief at source and/or reclaim may be possible."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92A::TAXB</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate47#mmRequestedTaxationRate
	 * CorporateActionRate47.mmRequestedTaxationRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionRate71, List<RateAndAmountFormat40Choice>> mmRequestedWithholdingTaxRate = new MMMessageAttribute<CorporateActionRate71, List<RateAndAmountFormat40Choice>>() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmRequestedTaxationRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate71.mmObject();
			isDerived = false;
			xmlTag = "ReqdWhldgTaxRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92A::TAXB"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedWithholdingTaxRate";
			definition = "Requested tax rate that will be withheld by the tax authorities of the jurisdiction of the issuer, for which a relief at source and/or reclaim may be possible.";
			previousVersion_lazy = () -> CorporateActionRate47.mmRequestedTaxationRate;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat40Choice.mmObject();
		}

		@Override
		public List<RateAndAmountFormat40Choice> getValue(CorporateActionRate71 obj) {
			return obj.getRequestedWithholdingTaxRate();
		}

		@Override
		public void setValue(CorporateActionRate71 obj, List<RateAndAmountFormat40Choice> value) {
			obj.setRequestedWithholdingTaxRate(value);
		}
	};
	@XmlElement(name = "ReqdScndLvlTaxRate")
	protected List<RateAndAmountFormat40Choice> requestedSecondLevelTaxRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat40Choice
	 * RateAndAmountFormat40Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate71
	 * CorporateActionRate71}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdScndLvlTaxRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSecondLevelTaxRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Requested rate at which the income will be withheld by the jurisdiction other than the jurisdiction of the issuer’s country of tax incorporation, for which a relief at source and/or reclaim may be possible."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate47#mmRequestedWithholdingOfLocalTax
	 * CorporateActionRate47.mmRequestedWithholdingOfLocalTax}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionRate71, List<RateAndAmountFormat40Choice>> mmRequestedSecondLevelTaxRate = new MMMessageAssociationEnd<CorporateActionRate71, List<RateAndAmountFormat40Choice>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate71.mmObject();
			isDerived = false;
			xmlTag = "ReqdScndLvlTaxRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSecondLevelTaxRate";
			definition = "Requested rate at which the income will be withheld by the jurisdiction other than the jurisdiction of the issuer’s country of tax incorporation, for which a relief at source and/or reclaim may be possible.";
			previousVersion_lazy = () -> CorporateActionRate47.mmRequestedWithholdingOfLocalTax;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateAndAmountFormat40Choice.mmObject();
		}

		@Override
		public List<RateAndAmountFormat40Choice> getValue(CorporateActionRate71 obj) {
			return obj.getRequestedSecondLevelTaxRate();
		}

		@Override
		public void setValue(CorporateActionRate71 obj, List<RateAndAmountFormat40Choice> value) {
			obj.setRequestedSecondLevelTaxRate(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRate71.mmProposedRate, com.tools20022.repository.msg.CorporateActionRate71.mmOversubscriptionRate,
						com.tools20022.repository.msg.CorporateActionRate71.mmRequestedWithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate71.mmRequestedSecondLevelTaxRate);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionRate71";
				definition = "Specifies rates related to a corporate action option.";
				previousVersion_lazy = () -> CorporateActionRate47.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PercentageRate> getProposedRate() {
		return proposedRate == null ? Optional.empty() : Optional.of(proposedRate);
	}

	public CorporateActionRate71 setProposedRate(PercentageRate proposedRate) {
		this.proposedRate = proposedRate;
		return this;
	}

	public Optional<RateAndAmountFormat39Choice> getOversubscriptionRate() {
		return oversubscriptionRate == null ? Optional.empty() : Optional.of(oversubscriptionRate);
	}

	public CorporateActionRate71 setOversubscriptionRate(RateAndAmountFormat39Choice oversubscriptionRate) {
		this.oversubscriptionRate = oversubscriptionRate;
		return this;
	}

	public List<RateAndAmountFormat40Choice> getRequestedWithholdingTaxRate() {
		return requestedWithholdingTaxRate == null ? requestedWithholdingTaxRate = new ArrayList<>() : requestedWithholdingTaxRate;
	}

	public CorporateActionRate71 setRequestedWithholdingTaxRate(List<RateAndAmountFormat40Choice> requestedWithholdingTaxRate) {
		this.requestedWithholdingTaxRate = Objects.requireNonNull(requestedWithholdingTaxRate);
		return this;
	}

	public List<RateAndAmountFormat40Choice> getRequestedSecondLevelTaxRate() {
		return requestedSecondLevelTaxRate == null ? requestedSecondLevelTaxRate = new ArrayList<>() : requestedSecondLevelTaxRate;
	}

	public CorporateActionRate71 setRequestedSecondLevelTaxRate(List<RateAndAmountFormat40Choice> requestedSecondLevelTaxRate) {
		this.requestedSecondLevelTaxRate = Objects.requireNonNull(requestedSecondLevelTaxRate);
		return this;
	}
}