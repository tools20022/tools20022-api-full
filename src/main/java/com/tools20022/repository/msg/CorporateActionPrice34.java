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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.PriceFormat25Choice;
import com.tools20022.repository.entity.CorporateActionPrice;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies prices related to a corporate action option.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice34#mmCashInLieuOfSharePrice
 * CorporateActionPrice34.mmCashInLieuOfSharePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice34#mmOverSubscriptionDepositPrice
 * CorporateActionPrice34.mmOverSubscriptionDepositPrice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionPrice
 * CorporateActionPrice}</li>
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
 * "CorporateActionPrice34"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies prices related to a corporate action option."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionPrice34", propOrder = {"cashInLieuOfSharePrice", "overSubscriptionDepositPrice"})
public class CorporateActionPrice34 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PriceFormat25Choice cashInLieuOfSharePrice;
	/**
	 * Cash disbursement in lieu of equities; usually in lieu of fractional
	 * quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PriceFormat25Choice
	 * PriceFormat25Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmCashInLieuOfSharePrice
	 * CorporateActionPrice.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice34
	 * CorporateActionPrice34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshInLieuOfShrPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashInLieuOfSharePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash disbursement in lieu of equities; usually in lieu of fractional quantity."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashInLieuOfSharePrice = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionPrice.mmCashInLieuOfSharePrice;
			componentContext_lazy = () -> CorporateActionPrice34.mmObject();
			isDerived = false;
			xmlTag = "CshInLieuOfShrPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashInLieuOfSharePrice";
			definition = "Cash disbursement in lieu of equities; usually in lieu of fractional quantity.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceFormat25Choice.mmObject();
		}
	};
	protected PriceFormat25Choice overSubscriptionDepositPrice;
	/**
	 * Amount of money required per over-subscribed equity as defined by the
	 * issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PriceFormat25Choice
	 * PriceFormat25Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmOverSubscriptionDepositPrice
	 * CorporateActionPrice.mmOverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice34
	 * CorporateActionPrice34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OverSbcptDpstPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OverSubscriptionDepositPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money required per over-subscribed equity as defined by the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOverSubscriptionDepositPrice = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionPrice.mmOverSubscriptionDepositPrice;
			componentContext_lazy = () -> CorporateActionPrice34.mmObject();
			isDerived = false;
			xmlTag = "OverSbcptDpstPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OverSubscriptionDepositPrice";
			definition = "Amount of money required per over-subscribed equity as defined by the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceFormat25Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionPrice34.mmCashInLieuOfSharePrice, CorporateActionPrice34.mmOverSubscriptionDepositPrice);
				trace_lazy = () -> CorporateActionPrice.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionPrice34";
				definition = "Specifies prices related to a corporate action option.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "CshInLieuOfShrPric")
	public PriceFormat25Choice getCashInLieuOfSharePrice() {
		return cashInLieuOfSharePrice;
	}

	public void setCashInLieuOfSharePrice(PriceFormat25Choice cashInLieuOfSharePrice) {
		this.cashInLieuOfSharePrice = cashInLieuOfSharePrice;
	}

	@XmlElement(name = "OverSbcptDpstPric")
	public PriceFormat25Choice getOverSubscriptionDepositPrice() {
		return overSubscriptionDepositPrice;
	}

	public void setOverSubscriptionDepositPrice(PriceFormat25Choice overSubscriptionDepositPrice) {
		this.overSubscriptionDepositPrice = overSubscriptionDepositPrice;
	}
}