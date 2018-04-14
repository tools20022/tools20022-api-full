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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.PriceFormat57Choice;
import com.tools20022.repository.choice.PriceFormat62Choice;
import com.tools20022.repository.entity.CorporateActionPrice;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
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
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice69#mmCashInLieuOfSharePrice
 * CorporateActionPrice69.mmCashInLieuOfSharePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice69#mmOverSubscriptionDepositPrice
 * CorporateActionPrice69.mmOverSubscriptionDepositPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice69#mmMaximumCashToInstruct
 * CorporateActionPrice69.mmMaximumCashToInstruct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice69#mmMinimumCashToInstruct
 * CorporateActionPrice69.mmMinimumCashToInstruct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice69#mmMinimumMultipleCashToInstruct
 * CorporateActionPrice69.mmMinimumMultipleCashToInstruct}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionPrice
 * CorporateActionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionPrice69"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies prices related to a corporate action option."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionPrice69", propOrder = {"cashInLieuOfSharePrice", "overSubscriptionDepositPrice", "maximumCashToInstruct", "minimumCashToInstruct", "minimumMultipleCashToInstruct"})
public class CorporateActionPrice69 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CshInLieuOfShrPric")
	protected PriceFormat57Choice cashInLieuOfSharePrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PriceFormat57Choice
	 * PriceFormat57Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmCashInLieuOfSharePrice
	 * CorporateActionPrice.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice69
	 * CorporateActionPrice69}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshInLieuOfShrPric"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashInLieuOfSharePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash disbursement in lieu of equities; usually in lieu of fractional quantity."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90a::CINL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPrice69, Optional<PriceFormat57Choice>> mmCashInLieuOfSharePrice = new MMMessageAssociationEnd<CorporateActionPrice69, Optional<PriceFormat57Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionPrice.mmCashInLieuOfSharePrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPrice69.mmObject();
			isDerived = false;
			xmlTag = "CshInLieuOfShrPric";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::CINL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashInLieuOfSharePrice";
			definition = "Cash disbursement in lieu of equities; usually in lieu of fractional quantity.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceFormat57Choice.mmObject();
		}

		@Override
		public Optional<PriceFormat57Choice> getValue(CorporateActionPrice69 obj) {
			return obj.getCashInLieuOfSharePrice();
		}

		@Override
		public void setValue(CorporateActionPrice69 obj, Optional<PriceFormat57Choice> value) {
			obj.setCashInLieuOfSharePrice(value.orElse(null));
		}
	};
	@XmlElement(name = "OverSbcptDpstPric")
	protected PriceFormat57Choice overSubscriptionDepositPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PriceFormat57Choice
	 * PriceFormat57Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmOverSubscriptionDepositPrice
	 * CorporateActionPrice.mmOverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice69
	 * CorporateActionPrice69}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OverSbcptDpstPric"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OverSubscriptionDepositPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money required per over-subscribed equity as defined by the issuer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90a::OSUB</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPrice69, Optional<PriceFormat57Choice>> mmOverSubscriptionDepositPrice = new MMMessageAssociationEnd<CorporateActionPrice69, Optional<PriceFormat57Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionPrice.mmOverSubscriptionDepositPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPrice69.mmObject();
			isDerived = false;
			xmlTag = "OverSbcptDpstPric";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::OSUB"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OverSubscriptionDepositPrice";
			definition = "Amount of money required per over-subscribed equity as defined by the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceFormat57Choice.mmObject();
		}

		@Override
		public Optional<PriceFormat57Choice> getValue(CorporateActionPrice69 obj) {
			return obj.getOverSubscriptionDepositPrice();
		}

		@Override
		public void setValue(CorporateActionPrice69 obj, Optional<PriceFormat57Choice> value) {
			obj.setOverSubscriptionDepositPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "MaxCshToInst")
	protected PriceFormat62Choice maximumCashToInstruct;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PriceFormat62Choice
	 * PriceFormat62Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmMaximumCashToInstruct
	 * CorporateActionPrice.mmMaximumCashToInstruct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice69
	 * CorporateActionPrice69}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxCshToInst"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumCashToInstruct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maximum cash amount that may be instructed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPrice69, Optional<PriceFormat62Choice>> mmMaximumCashToInstruct = new MMMessageAssociationEnd<CorporateActionPrice69, Optional<PriceFormat62Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionPrice.mmMaximumCashToInstruct;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPrice69.mmObject();
			isDerived = false;
			xmlTag = "MaxCshToInst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumCashToInstruct";
			definition = "Maximum cash amount that may be instructed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceFormat62Choice.mmObject();
		}

		@Override
		public Optional<PriceFormat62Choice> getValue(CorporateActionPrice69 obj) {
			return obj.getMaximumCashToInstruct();
		}

		@Override
		public void setValue(CorporateActionPrice69 obj, Optional<PriceFormat62Choice> value) {
			obj.setMaximumCashToInstruct(value.orElse(null));
		}
	};
	@XmlElement(name = "MinCshToInst")
	protected PriceFormat62Choice minimumCashToInstruct;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PriceFormat62Choice
	 * PriceFormat62Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmMinimumCashToInstruct
	 * CorporateActionPrice.mmMinimumCashToInstruct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice69
	 * CorporateActionPrice69}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinCshToInst"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumCashToInstruct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Minimum cash amount that may be instructed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPrice69, Optional<PriceFormat62Choice>> mmMinimumCashToInstruct = new MMMessageAssociationEnd<CorporateActionPrice69, Optional<PriceFormat62Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionPrice.mmMinimumCashToInstruct;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPrice69.mmObject();
			isDerived = false;
			xmlTag = "MinCshToInst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumCashToInstruct";
			definition = "Minimum cash amount that may be instructed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceFormat62Choice.mmObject();
		}

		@Override
		public Optional<PriceFormat62Choice> getValue(CorporateActionPrice69 obj) {
			return obj.getMinimumCashToInstruct();
		}

		@Override
		public void setValue(CorporateActionPrice69 obj, Optional<PriceFormat62Choice> value) {
			obj.setMinimumCashToInstruct(value.orElse(null));
		}
	};
	@XmlElement(name = "MinMltplCshToInst")
	protected PriceFormat62Choice minimumMultipleCashToInstruct;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PriceFormat62Choice
	 * PriceFormat62Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmMinimumMultipleCashToInstruct
	 * CorporateActionPrice.mmMinimumMultipleCashToInstruct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice69
	 * CorporateActionPrice69}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinMltplCshToInst"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumMultipleCashToInstruct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Minimum multiple of a cash amount that may be instructed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPrice69, Optional<PriceFormat62Choice>> mmMinimumMultipleCashToInstruct = new MMMessageAssociationEnd<CorporateActionPrice69, Optional<PriceFormat62Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionPrice.mmMinimumMultipleCashToInstruct;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPrice69.mmObject();
			isDerived = false;
			xmlTag = "MinMltplCshToInst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumMultipleCashToInstruct";
			definition = "Minimum multiple of a cash amount that may be instructed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceFormat62Choice.mmObject();
		}

		@Override
		public Optional<PriceFormat62Choice> getValue(CorporateActionPrice69 obj) {
			return obj.getMinimumMultipleCashToInstruct();
		}

		@Override
		public void setValue(CorporateActionPrice69 obj, Optional<PriceFormat62Choice> value) {
			obj.setMinimumMultipleCashToInstruct(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPrice69.mmCashInLieuOfSharePrice, com.tools20022.repository.msg.CorporateActionPrice69.mmOverSubscriptionDepositPrice,
						com.tools20022.repository.msg.CorporateActionPrice69.mmMaximumCashToInstruct, com.tools20022.repository.msg.CorporateActionPrice69.mmMinimumCashToInstruct,
						com.tools20022.repository.msg.CorporateActionPrice69.mmMinimumMultipleCashToInstruct);
				trace_lazy = () -> CorporateActionPrice.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionPrice69";
				definition = "Specifies prices related to a corporate action option.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PriceFormat57Choice> getCashInLieuOfSharePrice() {
		return cashInLieuOfSharePrice == null ? Optional.empty() : Optional.of(cashInLieuOfSharePrice);
	}

	public CorporateActionPrice69 setCashInLieuOfSharePrice(PriceFormat57Choice cashInLieuOfSharePrice) {
		this.cashInLieuOfSharePrice = cashInLieuOfSharePrice;
		return this;
	}

	public Optional<PriceFormat57Choice> getOverSubscriptionDepositPrice() {
		return overSubscriptionDepositPrice == null ? Optional.empty() : Optional.of(overSubscriptionDepositPrice);
	}

	public CorporateActionPrice69 setOverSubscriptionDepositPrice(PriceFormat57Choice overSubscriptionDepositPrice) {
		this.overSubscriptionDepositPrice = overSubscriptionDepositPrice;
		return this;
	}

	public Optional<PriceFormat62Choice> getMaximumCashToInstruct() {
		return maximumCashToInstruct == null ? Optional.empty() : Optional.of(maximumCashToInstruct);
	}

	public CorporateActionPrice69 setMaximumCashToInstruct(PriceFormat62Choice maximumCashToInstruct) {
		this.maximumCashToInstruct = maximumCashToInstruct;
		return this;
	}

	public Optional<PriceFormat62Choice> getMinimumCashToInstruct() {
		return minimumCashToInstruct == null ? Optional.empty() : Optional.of(minimumCashToInstruct);
	}

	public CorporateActionPrice69 setMinimumCashToInstruct(PriceFormat62Choice minimumCashToInstruct) {
		this.minimumCashToInstruct = minimumCashToInstruct;
		return this;
	}

	public Optional<PriceFormat62Choice> getMinimumMultipleCashToInstruct() {
		return minimumMultipleCashToInstruct == null ? Optional.empty() : Optional.of(minimumMultipleCashToInstruct);
	}

	public CorporateActionPrice69 setMinimumMultipleCashToInstruct(PriceFormat62Choice minimumMultipleCashToInstruct) {
		this.minimumMultipleCashToInstruct = minimumMultipleCashToInstruct;
		return this;
	}
}