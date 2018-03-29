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
import com.tools20022.repository.choice.RateAndAmountFormat21Choice;
import com.tools20022.repository.choice.RateAndAmountFormat5Choice;
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
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate47#mmProposedRate
 * CorporateActionRate47.mmProposedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate47#mmOversubscriptionRate
 * CorporateActionRate47.mmOversubscriptionRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate47#mmRequestedTaxationRate
 * CorporateActionRate47.mmRequestedTaxationRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate47#mmRequestedWithholdingOfForeignTax
 * CorporateActionRate47.mmRequestedWithholdingOfForeignTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate47#mmRequestedWithholdingOfLocalTax
 * CorporateActionRate47.mmRequestedWithholdingOfLocalTax}</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionRate47"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies rates related to a corporate action option."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionRate71
 * CorporateActionRate71}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate8
 * CorporateActionRate8}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionRate47", propOrder = {"proposedRate", "oversubscriptionRate", "requestedTaxationRate", "requestedWithholdingOfForeignTax", "requestedWithholdingOfLocalTax"})
public class CorporateActionRate47 {

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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate47
	 * CorporateActionRate47}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PropsdRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92A::OFFR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProposedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate proposed in a remarketing of variable rate notes."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate71#mmProposedRate
	 * CorporateActionRate71.mmProposedRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate8#mmProposedRate
	 * CorporateActionRate8.mmProposedRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionRate47, Optional<PercentageRate>> mmProposedRate = new MMMessageAttribute<CorporateActionRate47, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmProposedRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate47.mmObject();
			isDerived = false;
			xmlTag = "PropsdRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92A::OFFR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProposedRate";
			definition = "Rate proposed in a remarketing of variable rate notes.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionRate71.mmProposedRate);
			previousVersion_lazy = () -> CorporateActionRate8.mmProposedRate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(CorporateActionRate47 obj) {
			return obj.getProposedRate();
		}

		@Override
		public void setValue(CorporateActionRate47 obj, Optional<PercentageRate> value) {
			obj.setProposedRate(value.orElse(null));
		}
	};
	@XmlElement(name = "OvrsbcptRate")
	protected RateAndAmountFormat5Choice oversubscriptionRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat5Choice
	 * RateAndAmountFormat5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmOversubscriptionRate
	 * BiddingConditions.mmOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate47
	 * CorporateActionRate47}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OvrsbcptRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::OSUB</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OversubscriptionRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate of allowed over-subscription."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate71#mmOversubscriptionRate
	 * CorporateActionRate71.mmOversubscriptionRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate8#mmOversubscriptionRate
	 * CorporateActionRate8.mmOversubscriptionRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionRate47, Optional<RateAndAmountFormat5Choice>> mmOversubscriptionRate = new MMMessageAttribute<CorporateActionRate47, Optional<RateAndAmountFormat5Choice>>() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmOversubscriptionRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate47.mmObject();
			isDerived = false;
			xmlTag = "OvrsbcptRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::OSUB"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OversubscriptionRate";
			definition = "Rate of allowed over-subscription.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionRate71.mmOversubscriptionRate);
			previousVersion_lazy = () -> CorporateActionRate8.mmOversubscriptionRate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat5Choice.mmObject();
		}

		@Override
		public Optional<RateAndAmountFormat5Choice> getValue(CorporateActionRate47 obj) {
			return obj.getOversubscriptionRate();
		}

		@Override
		public void setValue(CorporateActionRate47 obj, Optional<RateAndAmountFormat5Choice> value) {
			obj.setOversubscriptionRate(value.orElse(null));
		}
	};
	@XmlElement(name = "ReqdTaxtnRate")
	protected List<RateAndAmountFormat21Choice> requestedTaxationRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat21Choice
	 * RateAndAmountFormat21Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmRequestedTaxationRate
	 * TaxVoucher.mmRequestedTaxationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate47
	 * CorporateActionRate47}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdTaxtnRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92A::TAXB</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedTaxationRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Requested tax rate in case of breakdown of tax rate, for example, used for adjustment of tax rate. This is the new requested applicable rate."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate71#mmRequestedWithholdingTaxRate
	 * CorporateActionRate71.mmRequestedWithholdingTaxRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate8#mmRequestedTaxationRate
	 * CorporateActionRate8.mmRequestedTaxationRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionRate47, List<RateAndAmountFormat21Choice>> mmRequestedTaxationRate = new MMMessageAttribute<CorporateActionRate47, List<RateAndAmountFormat21Choice>>() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmRequestedTaxationRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate47.mmObject();
			isDerived = false;
			xmlTag = "ReqdTaxtnRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92A::TAXB"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedTaxationRate";
			definition = "Requested tax rate in case of breakdown of tax rate, for example, used for adjustment of tax rate. This is the new requested applicable rate.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionRate71.mmRequestedWithholdingTaxRate);
			previousVersion_lazy = () -> CorporateActionRate8.mmRequestedTaxationRate;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat21Choice.mmObject();
		}

		@Override
		public List<RateAndAmountFormat21Choice> getValue(CorporateActionRate47 obj) {
			return obj.getRequestedTaxationRate();
		}

		@Override
		public void setValue(CorporateActionRate47 obj, List<RateAndAmountFormat21Choice> value) {
			obj.setRequestedTaxationRate(value);
		}
	};
	@XmlElement(name = "ReqdWhldgOfFrgnTax")
	protected List<RateAndAmountFormat21Choice> requestedWithholdingOfForeignTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat21Choice
	 * RateAndAmountFormat21Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate47
	 * CorporateActionRate47}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdWhldgOfFrgnTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedWithholdingOfForeignTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Requested rate at which the income will be withheld by the jurisdiction in which the income was originally paid, for which relief at source and/or reclaim may be possible."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionRate47, List<RateAndAmountFormat21Choice>> mmRequestedWithholdingOfForeignTax = new MMMessageAssociationEnd<CorporateActionRate47, List<RateAndAmountFormat21Choice>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate47.mmObject();
			isDerived = false;
			xmlTag = "ReqdWhldgOfFrgnTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedWithholdingOfForeignTax";
			definition = "Requested rate at which the income will be withheld by the jurisdiction in which the income was originally paid, for which relief at source and/or reclaim may be possible.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateAndAmountFormat21Choice.mmObject();
		}

		@Override
		public List<RateAndAmountFormat21Choice> getValue(CorporateActionRate47 obj) {
			return obj.getRequestedWithholdingOfForeignTax();
		}

		@Override
		public void setValue(CorporateActionRate47 obj, List<RateAndAmountFormat21Choice> value) {
			obj.setRequestedWithholdingOfForeignTax(value);
		}
	};
	@XmlElement(name = "ReqdWhldgOfLclTax")
	protected List<RateAndAmountFormat21Choice> requestedWithholdingOfLocalTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat21Choice
	 * RateAndAmountFormat21Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate47
	 * CorporateActionRate47}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdWhldgOfLclTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedWithholdingOfLocalTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Requested rate at which the income will be withheld by the jurisdiction in which the account owner is located, for which relief at source and/or reclaim may be possible."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate71#mmRequestedSecondLevelTaxRate
	 * CorporateActionRate71.mmRequestedSecondLevelTaxRate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionRate47, List<RateAndAmountFormat21Choice>> mmRequestedWithholdingOfLocalTax = new MMMessageAssociationEnd<CorporateActionRate47, List<RateAndAmountFormat21Choice>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate47.mmObject();
			isDerived = false;
			xmlTag = "ReqdWhldgOfLclTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedWithholdingOfLocalTax";
			definition = "Requested rate at which the income will be withheld by the jurisdiction in which the account owner is located, for which relief at source and/or reclaim may be possible.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionRate71.mmRequestedSecondLevelTaxRate);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateAndAmountFormat21Choice.mmObject();
		}

		@Override
		public List<RateAndAmountFormat21Choice> getValue(CorporateActionRate47 obj) {
			return obj.getRequestedWithholdingOfLocalTax();
		}

		@Override
		public void setValue(CorporateActionRate47 obj, List<RateAndAmountFormat21Choice> value) {
			obj.setRequestedWithholdingOfLocalTax(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRate47.mmProposedRate, com.tools20022.repository.msg.CorporateActionRate47.mmOversubscriptionRate,
						com.tools20022.repository.msg.CorporateActionRate47.mmRequestedTaxationRate, com.tools20022.repository.msg.CorporateActionRate47.mmRequestedWithholdingOfForeignTax,
						com.tools20022.repository.msg.CorporateActionRate47.mmRequestedWithholdingOfLocalTax);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionRate47";
				definition = "Specifies rates related to a corporate action option.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionRate71.mmObject());
				previousVersion_lazy = () -> CorporateActionRate8.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PercentageRate> getProposedRate() {
		return proposedRate == null ? Optional.empty() : Optional.of(proposedRate);
	}

	public CorporateActionRate47 setProposedRate(PercentageRate proposedRate) {
		this.proposedRate = proposedRate;
		return this;
	}

	public Optional<RateAndAmountFormat5Choice> getOversubscriptionRate() {
		return oversubscriptionRate == null ? Optional.empty() : Optional.of(oversubscriptionRate);
	}

	public CorporateActionRate47 setOversubscriptionRate(RateAndAmountFormat5Choice oversubscriptionRate) {
		this.oversubscriptionRate = oversubscriptionRate;
		return this;
	}

	public List<RateAndAmountFormat21Choice> getRequestedTaxationRate() {
		return requestedTaxationRate == null ? requestedTaxationRate = new ArrayList<>() : requestedTaxationRate;
	}

	public CorporateActionRate47 setRequestedTaxationRate(List<RateAndAmountFormat21Choice> requestedTaxationRate) {
		this.requestedTaxationRate = Objects.requireNonNull(requestedTaxationRate);
		return this;
	}

	public List<RateAndAmountFormat21Choice> getRequestedWithholdingOfForeignTax() {
		return requestedWithholdingOfForeignTax == null ? requestedWithholdingOfForeignTax = new ArrayList<>() : requestedWithholdingOfForeignTax;
	}

	public CorporateActionRate47 setRequestedWithholdingOfForeignTax(List<RateAndAmountFormat21Choice> requestedWithholdingOfForeignTax) {
		this.requestedWithholdingOfForeignTax = Objects.requireNonNull(requestedWithholdingOfForeignTax);
		return this;
	}

	public List<RateAndAmountFormat21Choice> getRequestedWithholdingOfLocalTax() {
		return requestedWithholdingOfLocalTax == null ? requestedWithholdingOfLocalTax = new ArrayList<>() : requestedWithholdingOfLocalTax;
	}

	public CorporateActionRate47 setRequestedWithholdingOfLocalTax(List<RateAndAmountFormat21Choice> requestedWithholdingOfLocalTax) {
		this.requestedWithholdingOfLocalTax = Objects.requireNonNull(requestedWithholdingOfLocalTax);
		return this;
	}
}