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
import com.tools20022.repository.choice.PriceFormat45Choice;
import com.tools20022.repository.choice.PriceFormat61Choice;
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
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice68#mmCashInLieuOfSharePrice
 * CorporateActionPrice68.mmCashInLieuOfSharePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice68#mmOverSubscriptionDepositPrice
 * CorporateActionPrice68.mmOverSubscriptionDepositPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice68#mmMaximumCashToInstruct
 * CorporateActionPrice68.mmMaximumCashToInstruct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice68#mmMinimumCashToInstruct
 * CorporateActionPrice68.mmMinimumCashToInstruct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice68#mmMinimumMultipleCashToInstruct
 * CorporateActionPrice68.mmMinimumMultipleCashToInstruct}</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionPrice68"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies prices related to a corporate action option."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice58
 * CorporateActionPrice58}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionPrice68", propOrder = {"cashInLieuOfSharePrice", "overSubscriptionDepositPrice", "maximumCashToInstruct", "minimumCashToInstruct", "minimumMultipleCashToInstruct"})
public class CorporateActionPrice68 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CshInLieuOfShrPric")
	protected PriceFormat45Choice cashInLieuOfSharePrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PriceFormat45Choice
	 * PriceFormat45Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmCashInLieuOfSharePrice
	 * CorporateActionPrice.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice68
	 * CorporateActionPrice68}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshInLieuOfShrPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90a::CINL</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice58#mmCashInLieuOfSharePrice
	 * CorporateActionPrice58.mmCashInLieuOfSharePrice}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPrice68, Optional<PriceFormat45Choice>> mmCashInLieuOfSharePrice = new MMMessageAssociationEnd<CorporateActionPrice68, Optional<PriceFormat45Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionPrice.mmCashInLieuOfSharePrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPrice68.mmObject();
			isDerived = false;
			xmlTag = "CshInLieuOfShrPric";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::CINL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashInLieuOfSharePrice";
			definition = "Cash disbursement in lieu of equities; usually in lieu of fractional quantity.";
			previousVersion_lazy = () -> CorporateActionPrice58.mmCashInLieuOfSharePrice;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceFormat45Choice.mmObject();
		}

		@Override
		public Optional<PriceFormat45Choice> getValue(CorporateActionPrice68 obj) {
			return obj.getCashInLieuOfSharePrice();
		}

		@Override
		public void setValue(CorporateActionPrice68 obj, Optional<PriceFormat45Choice> value) {
			obj.setCashInLieuOfSharePrice(value.orElse(null));
		}
	};
	@XmlElement(name = "OverSbcptDpstPric")
	protected PriceFormat45Choice overSubscriptionDepositPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PriceFormat45Choice
	 * PriceFormat45Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmOverSubscriptionDepositPrice
	 * CorporateActionPrice.mmOverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice68
	 * CorporateActionPrice68}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OverSbcptDpstPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90a::OSUB</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice58#mmOverSubscriptionDepositPrice
	 * CorporateActionPrice58.mmOverSubscriptionDepositPrice}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPrice68, Optional<PriceFormat45Choice>> mmOverSubscriptionDepositPrice = new MMMessageAssociationEnd<CorporateActionPrice68, Optional<PriceFormat45Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionPrice.mmOverSubscriptionDepositPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPrice68.mmObject();
			isDerived = false;
			xmlTag = "OverSbcptDpstPric";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::OSUB"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OverSubscriptionDepositPrice";
			definition = "Amount of money required per over-subscribed equity as defined by the issuer.";
			previousVersion_lazy = () -> CorporateActionPrice58.mmOverSubscriptionDepositPrice;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceFormat45Choice.mmObject();
		}

		@Override
		public Optional<PriceFormat45Choice> getValue(CorporateActionPrice68 obj) {
			return obj.getOverSubscriptionDepositPrice();
		}

		@Override
		public void setValue(CorporateActionPrice68 obj, Optional<PriceFormat45Choice> value) {
			obj.setOverSubscriptionDepositPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "MaxCshToInst")
	protected PriceFormat61Choice maximumCashToInstruct;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PriceFormat61Choice
	 * PriceFormat61Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmMaximumCashToInstruct
	 * CorporateActionPrice.mmMaximumCashToInstruct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice68
	 * CorporateActionPrice68}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxCshToInst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumCashToInstruct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maximum cash amount that may be instructed."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPrice68, Optional<PriceFormat61Choice>> mmMaximumCashToInstruct = new MMMessageAssociationEnd<CorporateActionPrice68, Optional<PriceFormat61Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionPrice.mmMaximumCashToInstruct;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPrice68.mmObject();
			isDerived = false;
			xmlTag = "MaxCshToInst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumCashToInstruct";
			definition = "Maximum cash amount that may be instructed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceFormat61Choice.mmObject();
		}

		@Override
		public Optional<PriceFormat61Choice> getValue(CorporateActionPrice68 obj) {
			return obj.getMaximumCashToInstruct();
		}

		@Override
		public void setValue(CorporateActionPrice68 obj, Optional<PriceFormat61Choice> value) {
			obj.setMaximumCashToInstruct(value.orElse(null));
		}
	};
	@XmlElement(name = "MinCshToInst")
	protected PriceFormat61Choice minimumCashToInstruct;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PriceFormat61Choice
	 * PriceFormat61Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmMinimumCashToInstruct
	 * CorporateActionPrice.mmMinimumCashToInstruct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice68
	 * CorporateActionPrice68}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinCshToInst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumCashToInstruct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Minimum cash amount that may be instructed."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPrice68, Optional<PriceFormat61Choice>> mmMinimumCashToInstruct = new MMMessageAssociationEnd<CorporateActionPrice68, Optional<PriceFormat61Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionPrice.mmMinimumCashToInstruct;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPrice68.mmObject();
			isDerived = false;
			xmlTag = "MinCshToInst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumCashToInstruct";
			definition = "Minimum cash amount that may be instructed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceFormat61Choice.mmObject();
		}

		@Override
		public Optional<PriceFormat61Choice> getValue(CorporateActionPrice68 obj) {
			return obj.getMinimumCashToInstruct();
		}

		@Override
		public void setValue(CorporateActionPrice68 obj, Optional<PriceFormat61Choice> value) {
			obj.setMinimumCashToInstruct(value.orElse(null));
		}
	};
	@XmlElement(name = "MinMltplCshToInst")
	protected PriceFormat61Choice minimumMultipleCashToInstruct;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PriceFormat61Choice
	 * PriceFormat61Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmMinimumMultipleCashToInstruct
	 * CorporateActionPrice.mmMinimumMultipleCashToInstruct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice68
	 * CorporateActionPrice68}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinMltplCshToInst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumMultipleCashToInstruct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Minimum multiple of a cash amount that may be instructed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPrice68, Optional<PriceFormat61Choice>> mmMinimumMultipleCashToInstruct = new MMMessageAssociationEnd<CorporateActionPrice68, Optional<PriceFormat61Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionPrice.mmMinimumMultipleCashToInstruct;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPrice68.mmObject();
			isDerived = false;
			xmlTag = "MinMltplCshToInst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumMultipleCashToInstruct";
			definition = "Minimum multiple of a cash amount that may be instructed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceFormat61Choice.mmObject();
		}

		@Override
		public Optional<PriceFormat61Choice> getValue(CorporateActionPrice68 obj) {
			return obj.getMinimumMultipleCashToInstruct();
		}

		@Override
		public void setValue(CorporateActionPrice68 obj, Optional<PriceFormat61Choice> value) {
			obj.setMinimumMultipleCashToInstruct(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPrice68.mmCashInLieuOfSharePrice, com.tools20022.repository.msg.CorporateActionPrice68.mmOverSubscriptionDepositPrice,
						com.tools20022.repository.msg.CorporateActionPrice68.mmMaximumCashToInstruct, com.tools20022.repository.msg.CorporateActionPrice68.mmMinimumCashToInstruct,
						com.tools20022.repository.msg.CorporateActionPrice68.mmMinimumMultipleCashToInstruct);
				trace_lazy = () -> CorporateActionPrice.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionPrice68";
				definition = "Specifies prices related to a corporate action option.";
				previousVersion_lazy = () -> CorporateActionPrice58.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PriceFormat45Choice> getCashInLieuOfSharePrice() {
		return cashInLieuOfSharePrice == null ? Optional.empty() : Optional.of(cashInLieuOfSharePrice);
	}

	public CorporateActionPrice68 setCashInLieuOfSharePrice(PriceFormat45Choice cashInLieuOfSharePrice) {
		this.cashInLieuOfSharePrice = cashInLieuOfSharePrice;
		return this;
	}

	public Optional<PriceFormat45Choice> getOverSubscriptionDepositPrice() {
		return overSubscriptionDepositPrice == null ? Optional.empty() : Optional.of(overSubscriptionDepositPrice);
	}

	public CorporateActionPrice68 setOverSubscriptionDepositPrice(PriceFormat45Choice overSubscriptionDepositPrice) {
		this.overSubscriptionDepositPrice = overSubscriptionDepositPrice;
		return this;
	}

	public Optional<PriceFormat61Choice> getMaximumCashToInstruct() {
		return maximumCashToInstruct == null ? Optional.empty() : Optional.of(maximumCashToInstruct);
	}

	public CorporateActionPrice68 setMaximumCashToInstruct(PriceFormat61Choice maximumCashToInstruct) {
		this.maximumCashToInstruct = maximumCashToInstruct;
		return this;
	}

	public Optional<PriceFormat61Choice> getMinimumCashToInstruct() {
		return minimumCashToInstruct == null ? Optional.empty() : Optional.of(minimumCashToInstruct);
	}

	public CorporateActionPrice68 setMinimumCashToInstruct(PriceFormat61Choice minimumCashToInstruct) {
		this.minimumCashToInstruct = minimumCashToInstruct;
		return this;
	}

	public Optional<PriceFormat61Choice> getMinimumMultipleCashToInstruct() {
		return minimumMultipleCashToInstruct == null ? Optional.empty() : Optional.of(minimumMultipleCashToInstruct);
	}

	public CorporateActionPrice68 setMinimumMultipleCashToInstruct(PriceFormat61Choice minimumMultipleCashToInstruct) {
		this.minimumMultipleCashToInstruct = minimumMultipleCashToInstruct;
		return this;
	}
}