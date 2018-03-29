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
import com.tools20022.repository.choice.PriceFormat15Choice;
import com.tools20022.repository.choice.PriceFormat16Choice;
import com.tools20022.repository.choice.PriceFormat18Choice;
import com.tools20022.repository.entity.CorporateActionPrice;
import com.tools20022.repository.entity.SecuritiesTax;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountPrice5;
import java.util.*;
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
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice14#mmCashInLieuOfSharePrice
 * CorporateActionPrice14.mmCashInLieuOfSharePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice14#mmExercisePrice
 * CorporateActionPrice14.mmExercisePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice14#mmGenericCashPriceReceivedPerProduct
 * CorporateActionPrice14.mmGenericCashPriceReceivedPerProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice14#mmOverSubscriptionDepositPrice
 * CorporateActionPrice14.mmOverSubscriptionDepositPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice14#mmGenericCashPricePaidPerProduct
 * CorporateActionPrice14.mmGenericCashPricePaidPerProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice14#mmTaxableIncomePerDividendShare
 * CorporateActionPrice14.mmTaxableIncomePerDividendShare}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline#forCorporateActionPrice14
 * ConstraintGenericCashPricePerProductGuideline.forCorporateActionPrice14}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionPrice14"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies prices related to a corporate action option."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionPrice14", propOrder = {"cashInLieuOfSharePrice", "exercisePrice", "genericCashPriceReceivedPerProduct", "overSubscriptionDepositPrice", "genericCashPricePaidPerProduct", "taxableIncomePerDividendShare"})
public class CorporateActionPrice14 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CshInLieuOfShrPric")
	protected PriceFormat15Choice cashInLieuOfSharePrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PriceFormat15Choice
	 * PriceFormat15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmCashInLieuOfSharePrice
	 * CorporateActionPrice.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice14
	 * CorporateActionPrice14}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPrice14, Optional<PriceFormat15Choice>> mmCashInLieuOfSharePrice = new MMMessageAssociationEnd<CorporateActionPrice14, Optional<PriceFormat15Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionPrice.mmCashInLieuOfSharePrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPrice14.mmObject();
			isDerived = false;
			xmlTag = "CshInLieuOfShrPric";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::CINL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashInLieuOfSharePrice";
			definition = "Cash disbursement in lieu of equities; usually in lieu of fractional quantity.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceFormat15Choice.mmObject();
		}

		@Override
		public Optional<PriceFormat15Choice> getValue(CorporateActionPrice14 obj) {
			return obj.getCashInLieuOfSharePrice();
		}

		@Override
		public void setValue(CorporateActionPrice14 obj, Optional<PriceFormat15Choice> value) {
			obj.setCashInLieuOfSharePrice(value.orElse(null));
		}
	};
	@XmlElement(name = "ExrcPric")
	protected PriceFormat16Choice exercisePrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PriceFormat16Choice
	 * PriceFormat16Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmCorporateActionExercisePrice
	 * CorporateActionPrice.mmCorporateActionExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice14
	 * CorporateActionPrice14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExrcPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90a::EXER</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExercisePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "1. Price at which security will be purchased/sold if warrant is exercised, either as an actual amount or a percentage.\n2. Price at which a bond is converted to underlying security either as an actual amount or a percentage.\n3. Strike price of an option, represented either as an actual amount, a percentage or a number of points above an index."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPrice14, Optional<PriceFormat16Choice>> mmExercisePrice = new MMMessageAssociationEnd<CorporateActionPrice14, Optional<PriceFormat16Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionPrice.mmCorporateActionExercisePrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPrice14.mmObject();
			isDerived = false;
			xmlTag = "ExrcPric";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::EXER"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExercisePrice";
			definition = "1. Price at which security will be purchased/sold if warrant is exercised, either as an actual amount or a percentage.\n2. Price at which a bond is converted to underlying security either as an actual amount or a percentage.\n3. Strike price of an option, represented either as an actual amount, a percentage or a number of points above an index.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceFormat16Choice.mmObject();
		}

		@Override
		public Optional<PriceFormat16Choice> getValue(CorporateActionPrice14 obj) {
			return obj.getExercisePrice();
		}

		@Override
		public void setValue(CorporateActionPrice14 obj, Optional<PriceFormat16Choice> value) {
			obj.setExercisePrice(value.orElse(null));
		}
	};
	@XmlElement(name = "GncCshPricRcvdPerPdct")
	protected List<PriceFormat18Choice> genericCashPriceReceivedPerProduct;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PriceFormat18Choice
	 * PriceFormat18Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice14
	 * CorporateActionPrice14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GncCshPricRcvdPerPdct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90a::OFFR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPriceReceivedPerProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Generic cash price received per product by the underlying security holder either as a percentage or an amount, for example, redemption price."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPrice14, List<PriceFormat18Choice>> mmGenericCashPriceReceivedPerProduct = new MMMessageAssociationEnd<CorporateActionPrice14, List<PriceFormat18Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionPrice.mmGenericCashPriceReceivedPerProduct;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPrice14.mmObject();
			isDerived = false;
			xmlTag = "GncCshPricRcvdPerPdct";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::OFFR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPriceReceivedPerProduct";
			definition = "Generic cash price received per product by the underlying security holder either as a percentage or an amount, for example, redemption price.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceFormat18Choice.mmObject();
		}

		@Override
		public List<PriceFormat18Choice> getValue(CorporateActionPrice14 obj) {
			return obj.getGenericCashPriceReceivedPerProduct();
		}

		@Override
		public void setValue(CorporateActionPrice14 obj, List<PriceFormat18Choice> value) {
			obj.setGenericCashPriceReceivedPerProduct(value);
		}
	};
	@XmlElement(name = "OverSbcptDpstPric")
	protected PriceFormat15Choice overSubscriptionDepositPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PriceFormat15Choice
	 * PriceFormat15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmOverSubscriptionDepositPrice
	 * CorporateActionPrice.mmOverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice14
	 * CorporateActionPrice14}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPrice14, Optional<PriceFormat15Choice>> mmOverSubscriptionDepositPrice = new MMMessageAssociationEnd<CorporateActionPrice14, Optional<PriceFormat15Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionPrice.mmOverSubscriptionDepositPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPrice14.mmObject();
			isDerived = false;
			xmlTag = "OverSbcptDpstPric";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::OSUB"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OverSubscriptionDepositPrice";
			definition = "Amount of money required per over-subscribed equity as defined by the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceFormat15Choice.mmObject();
		}

		@Override
		public Optional<PriceFormat15Choice> getValue(CorporateActionPrice14 obj) {
			return obj.getOverSubscriptionDepositPrice();
		}

		@Override
		public void setValue(CorporateActionPrice14 obj, Optional<PriceFormat15Choice> value) {
			obj.setOverSubscriptionDepositPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "GncCshPricPdPerPdct")
	protected PriceFormat15Choice genericCashPricePaidPerProduct;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PriceFormat15Choice
	 * PriceFormat15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice14
	 * CorporateActionPrice14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GncCshPricPdPerPdct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90a::PRPP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePaidPerProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Generic cash price paid per product by the underlying security holder either as a percentage or an amount, for example, reinvestment price."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPrice14, Optional<PriceFormat15Choice>> mmGenericCashPricePaidPerProduct = new MMMessageAssociationEnd<CorporateActionPrice14, Optional<PriceFormat15Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionPrice.mmGenericCashPricePaidPerProduct;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPrice14.mmObject();
			isDerived = false;
			xmlTag = "GncCshPricPdPerPdct";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::PRPP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePaidPerProduct";
			definition = "Generic cash price paid per product by the underlying security holder either as a percentage or an amount, for example, reinvestment price.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceFormat15Choice.mmObject();
		}

		@Override
		public Optional<PriceFormat15Choice> getValue(CorporateActionPrice14 obj) {
			return obj.getGenericCashPricePaidPerProduct();
		}

		@Override
		public void setValue(CorporateActionPrice14 obj, Optional<PriceFormat15Choice> value) {
			obj.setGenericCashPricePaidPerProduct(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxblIncmPerDvddShr")
	protected AmountPrice5 taxableIncomePerDividendShare;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountPrice5
	 * AmountPrice5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTaxableIncomePerDividendShare
	 * SecuritiesTax.mmTaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice14
	 * CorporateActionPrice14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxblIncmPerDvddShr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90a::TDMT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxableIncomePerDividendShare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount included in the dividend/NAV that is identified as gains directly or indirectly derived from interest payments within the scope of the EU Savings directive."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPrice14, Optional<AmountPrice5>> mmTaxableIncomePerDividendShare = new MMMessageAssociationEnd<CorporateActionPrice14, Optional<AmountPrice5>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmTaxableIncomePerDividendShare;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPrice14.mmObject();
			isDerived = false;
			xmlTag = "TaxblIncmPerDvddShr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::TDMT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxableIncomePerDividendShare";
			definition = "Amount included in the dividend/NAV that is identified as gains directly or indirectly derived from interest payments within the scope of the EU Savings directive.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountPrice5.mmObject();
		}

		@Override
		public Optional<AmountPrice5> getValue(CorporateActionPrice14 obj) {
			return obj.getTaxableIncomePerDividendShare();
		}

		@Override
		public void setValue(CorporateActionPrice14 obj, Optional<AmountPrice5> value) {
			obj.setTaxableIncomePerDividendShare(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPrice14.mmCashInLieuOfSharePrice, com.tools20022.repository.msg.CorporateActionPrice14.mmExercisePrice,
						com.tools20022.repository.msg.CorporateActionPrice14.mmGenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.CorporateActionPrice14.mmOverSubscriptionDepositPrice,
						com.tools20022.repository.msg.CorporateActionPrice14.mmGenericCashPricePaidPerProduct, com.tools20022.repository.msg.CorporateActionPrice14.mmTaxableIncomePerDividendShare);
				trace_lazy = () -> CorporateActionPrice.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forCorporateActionPrice14);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionPrice14";
				definition = "Specifies prices related to a corporate action option.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PriceFormat15Choice> getCashInLieuOfSharePrice() {
		return cashInLieuOfSharePrice == null ? Optional.empty() : Optional.of(cashInLieuOfSharePrice);
	}

	public CorporateActionPrice14 setCashInLieuOfSharePrice(PriceFormat15Choice cashInLieuOfSharePrice) {
		this.cashInLieuOfSharePrice = cashInLieuOfSharePrice;
		return this;
	}

	public Optional<PriceFormat16Choice> getExercisePrice() {
		return exercisePrice == null ? Optional.empty() : Optional.of(exercisePrice);
	}

	public CorporateActionPrice14 setExercisePrice(PriceFormat16Choice exercisePrice) {
		this.exercisePrice = exercisePrice;
		return this;
	}

	public List<PriceFormat18Choice> getGenericCashPriceReceivedPerProduct() {
		return genericCashPriceReceivedPerProduct == null ? genericCashPriceReceivedPerProduct = new ArrayList<>() : genericCashPriceReceivedPerProduct;
	}

	public CorporateActionPrice14 setGenericCashPriceReceivedPerProduct(List<PriceFormat18Choice> genericCashPriceReceivedPerProduct) {
		this.genericCashPriceReceivedPerProduct = Objects.requireNonNull(genericCashPriceReceivedPerProduct);
		return this;
	}

	public Optional<PriceFormat15Choice> getOverSubscriptionDepositPrice() {
		return overSubscriptionDepositPrice == null ? Optional.empty() : Optional.of(overSubscriptionDepositPrice);
	}

	public CorporateActionPrice14 setOverSubscriptionDepositPrice(PriceFormat15Choice overSubscriptionDepositPrice) {
		this.overSubscriptionDepositPrice = overSubscriptionDepositPrice;
		return this;
	}

	public Optional<PriceFormat15Choice> getGenericCashPricePaidPerProduct() {
		return genericCashPricePaidPerProduct == null ? Optional.empty() : Optional.of(genericCashPricePaidPerProduct);
	}

	public CorporateActionPrice14 setGenericCashPricePaidPerProduct(PriceFormat15Choice genericCashPricePaidPerProduct) {
		this.genericCashPricePaidPerProduct = genericCashPricePaidPerProduct;
		return this;
	}

	public Optional<AmountPrice5> getTaxableIncomePerDividendShare() {
		return taxableIncomePerDividendShare == null ? Optional.empty() : Optional.of(taxableIncomePerDividendShare);
	}

	public CorporateActionPrice14 setTaxableIncomePerDividendShare(AmountPrice5 taxableIncomePerDividendShare) {
		this.taxableIncomePerDividendShare = taxableIncomePerDividendShare;
		return this;
	}
}