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
import com.tools20022.repository.choice.RateAndAmountFormat43Choice;
import com.tools20022.repository.choice.RateAndAmountFormat45Choice;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.BiddingConditions;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.entity.Tax;
import com.tools20022.repository.entity.TaxVoucher;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate73#mmProposedRate
 * CorporateActionRate73.mmProposedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate73#mmOversubscriptionRate
 * CorporateActionRate73.mmOversubscriptionRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate73#mmRequestedWithholdingTaxRate
 * CorporateActionRate73.mmRequestedWithholdingTaxRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate73#mmRequestedSecondLevelTaxRate
 * CorporateActionRate73.mmRequestedSecondLevelTaxRate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionEvent
 * CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionRate73"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies rates related to a corporate action option."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionRate73", propOrder = {"proposedRate", "oversubscriptionRate", "requestedWithholdingTaxRate", "requestedSecondLevelTaxRate"})
public class CorporateActionRate73 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PercentageRate proposedRate;
	/**
	 * Rate proposed in a remarketing of variable rate notes.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate73
	 * CorporateActionRate73}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PropsdRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProposedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate proposed in a remarketing of variable rate notes."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProposedRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmProposedRate;
			componentContext_lazy = () -> CorporateActionRate73.mmObject();
			isDerived = false;
			xmlTag = "PropsdRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProposedRate";
			definition = "Rate proposed in a remarketing of variable rate notes.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected RateAndAmountFormat43Choice oversubscriptionRate;
	/**
	 * Rate of allowed over-subscription.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat43Choice
	 * RateAndAmountFormat43Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmOversubscriptionRate
	 * BiddingConditions.mmOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate73
	 * CorporateActionRate73}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OvrsbcptRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OversubscriptionRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate of allowed over-subscription."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOversubscriptionRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmOversubscriptionRate;
			componentContext_lazy = () -> CorporateActionRate73.mmObject();
			isDerived = false;
			xmlTag = "OvrsbcptRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OversubscriptionRate";
			definition = "Rate of allowed over-subscription.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat43Choice.mmObject();
		}
	};
	protected List<RateAndAmountFormat45Choice> requestedWithholdingTaxRate;
	/**
	 * Requested tax rate that will be withheld by the tax authorities of the
	 * jurisdiction of the issuer, for which a relief at source and/or reclaim
	 * may be possible.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat45Choice
	 * RateAndAmountFormat45Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmRequestedTaxationRate
	 * TaxVoucher.mmRequestedTaxationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate73
	 * CorporateActionRate73}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdWhldgTaxRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedWithholdingTaxRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Requested tax rate that will be withheld by the tax authorities of the jurisdiction of the issuer, for which a relief at source and/or reclaim may be possible."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRequestedWithholdingTaxRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmRequestedTaxationRate;
			componentContext_lazy = () -> CorporateActionRate73.mmObject();
			isDerived = false;
			xmlTag = "ReqdWhldgTaxRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedWithholdingTaxRate";
			definition = "Requested tax rate that will be withheld by the tax authorities of the jurisdiction of the issuer, for which a relief at source and/or reclaim may be possible.";
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat45Choice.mmObject();
		}
	};
	protected List<RateAndAmountFormat45Choice> requestedSecondLevelTaxRate;
	/**
	 * Requested rate at which the income will be withheld by the jurisdiction
	 * other than the jurisdiction of the issuer’s country of tax incorporation,
	 * for which a relief at source and/or reclaim may be possible.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat45Choice
	 * RateAndAmountFormat45Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate73
	 * CorporateActionRate73}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdScndLvlTaxRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSecondLevelTaxRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Requested rate at which the income will be withheld by the jurisdiction other than the jurisdiction of the issuer’s country of tax incorporation, for which a relief at source and/or reclaim may be possible. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRequestedSecondLevelTaxRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> CorporateActionRate73.mmObject();
			isDerived = false;
			xmlTag = "ReqdScndLvlTaxRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSecondLevelTaxRate";
			definition = "Requested rate at which the income will be withheld by the jurisdiction other than the jurisdiction of the issuer’s country of tax incorporation, for which a relief at source and/or reclaim may be possible. ";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateAndAmountFormat45Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionRate73.mmProposedRate, CorporateActionRate73.mmOversubscriptionRate, CorporateActionRate73.mmRequestedWithholdingTaxRate,
						CorporateActionRate73.mmRequestedSecondLevelTaxRate);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionRate73";
				definition = "Specifies rates related to a corporate action option.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PropsdRate")
	public PercentageRate getProposedRate() {
		return proposedRate;
	}

	public void setProposedRate(PercentageRate proposedRate) {
		this.proposedRate = proposedRate;
	}

	@XmlElement(name = "OvrsbcptRate")
	public RateAndAmountFormat43Choice getOversubscriptionRate() {
		return oversubscriptionRate;
	}

	public void setOversubscriptionRate(RateAndAmountFormat43Choice oversubscriptionRate) {
		this.oversubscriptionRate = oversubscriptionRate;
	}

	@XmlElement(name = "ReqdWhldgTaxRate")
	public List<RateAndAmountFormat45Choice> getRequestedWithholdingTaxRate() {
		return requestedWithholdingTaxRate;
	}

	public void setRequestedWithholdingTaxRate(List<RateAndAmountFormat45Choice> requestedWithholdingTaxRate) {
		this.requestedWithholdingTaxRate = requestedWithholdingTaxRate;
	}

	@XmlElement(name = "ReqdScndLvlTaxRate")
	public List<RateAndAmountFormat45Choice> getRequestedSecondLevelTaxRate() {
		return requestedSecondLevelTaxRate;
	}

	public void setRequestedSecondLevelTaxRate(List<RateAndAmountFormat45Choice> requestedSecondLevelTaxRate) {
		this.requestedSecondLevelTaxRate = requestedSecondLevelTaxRate;
	}
}