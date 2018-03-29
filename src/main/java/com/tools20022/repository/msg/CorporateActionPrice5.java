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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.PriceFormat5Choice;
import com.tools20022.repository.choice.PriceFormat6Choice;
import com.tools20022.repository.choice.PriceFormat7Choice;
import com.tools20022.repository.entity.CorporateActionPrice;
import com.tools20022.repository.entity.SecuritiesTax;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountPrice3;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies prices.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice5#mmExercisePrice
 * CorporateActionPrice5.mmExercisePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice5#mmGenericCashPriceReceivedPerProduct
 * CorporateActionPrice5.mmGenericCashPriceReceivedPerProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice5#mmGenericCashPricePaidPerProduct
 * CorporateActionPrice5.mmGenericCashPricePaidPerProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice5#mmTaxableIncomePerDividendShare
 * CorporateActionPrice5.mmTaxableIncomePerDividendShare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice5#mmCashInLieuOfSharePrice
 * CorporateActionPrice5.mmCashInLieuOfSharePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice5#mmOverSubscriptionDepositPrice
 * CorporateActionPrice5.mmOverSubscriptionDepositPrice}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline#forCorporateActionPrice5
 * ConstraintGenericCashPricePerProductGuideline.forCorporateActionPrice5}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionPrice5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies prices."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionPrice5", propOrder = {"exercisePrice", "genericCashPriceReceivedPerProduct", "genericCashPricePaidPerProduct", "taxableIncomePerDividendShare", "cashInLieuOfSharePrice", "overSubscriptionDepositPrice"})
public class CorporateActionPrice5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ExrcPric")
	protected PriceFormat6Choice exercisePrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat6Choice
	 * PriceFormat6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmCorporateActionExercisePrice
	 * CorporateActionPrice.mmCorporateActionExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice5
	 * CorporateActionPrice5}</li>
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
	public static final MMMessageAttribute<CorporateActionPrice5, Optional<PriceFormat6Choice>> mmExercisePrice = new MMMessageAttribute<CorporateActionPrice5, Optional<PriceFormat6Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionPrice.mmCorporateActionExercisePrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPrice5.mmObject();
			isDerived = false;
			xmlTag = "ExrcPric";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::EXER"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExercisePrice";
			definition = "1. Price at which security will be purchased/sold if warrant is exercised, either as an actual amount or a percentage.\n2. Price at which a bond is converted to underlying security either as an actual amount or a percentage.\n3. Strike price of an option, represented either as an actual amount, a percentage or a number of points above an index.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceFormat6Choice.mmObject();
		}

		@Override
		public Optional<PriceFormat6Choice> getValue(CorporateActionPrice5 obj) {
			return obj.getExercisePrice();
		}

		@Override
		public void setValue(CorporateActionPrice5 obj, Optional<PriceFormat6Choice> value) {
			obj.setExercisePrice(value.orElse(null));
		}
	};
	@XmlElement(name = "GncCshPricRcvdPerPdct")
	protected List<PriceFormat7Choice> genericCashPriceReceivedPerProduct;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat7Choice
	 * PriceFormat7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice5
	 * CorporateActionPrice5}</li>
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
	public static final MMMessageAttribute<CorporateActionPrice5, List<PriceFormat7Choice>> mmGenericCashPriceReceivedPerProduct = new MMMessageAttribute<CorporateActionPrice5, List<PriceFormat7Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionPrice.mmGenericCashPriceReceivedPerProduct;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPrice5.mmObject();
			isDerived = false;
			xmlTag = "GncCshPricRcvdPerPdct";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::OFFR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPriceReceivedPerProduct";
			definition = "Generic cash price received per product by the underlying security holder either as a percentage or an amount, for example, redemption price.";
			minOccurs = 0;
			complexType_lazy = () -> PriceFormat7Choice.mmObject();
		}

		@Override
		public List<PriceFormat7Choice> getValue(CorporateActionPrice5 obj) {
			return obj.getGenericCashPriceReceivedPerProduct();
		}

		@Override
		public void setValue(CorporateActionPrice5 obj, List<PriceFormat7Choice> value) {
			obj.setGenericCashPriceReceivedPerProduct(value);
		}
	};
	@XmlElement(name = "GncCshPricPdPerPdct")
	protected PriceFormat5Choice genericCashPricePaidPerProduct;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat5Choice
	 * PriceFormat5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice5
	 * CorporateActionPrice5}</li>
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
	public static final MMMessageAttribute<CorporateActionPrice5, Optional<PriceFormat5Choice>> mmGenericCashPricePaidPerProduct = new MMMessageAttribute<CorporateActionPrice5, Optional<PriceFormat5Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionPrice.mmGenericCashPricePaidPerProduct;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPrice5.mmObject();
			isDerived = false;
			xmlTag = "GncCshPricPdPerPdct";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::PRPP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePaidPerProduct";
			definition = "Generic cash price paid per product by the underlying security holder either as a percentage or an amount, for example, reinvestment price.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceFormat5Choice.mmObject();
		}

		@Override
		public Optional<PriceFormat5Choice> getValue(CorporateActionPrice5 obj) {
			return obj.getGenericCashPricePaidPerProduct();
		}

		@Override
		public void setValue(CorporateActionPrice5 obj, Optional<PriceFormat5Choice> value) {
			obj.setGenericCashPricePaidPerProduct(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxblIncmPerDvddShr")
	protected AmountPrice3 taxableIncomePerDividendShare;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.AmountPrice3
	 * AmountPrice3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTaxableIncomePerDividendShare
	 * SecuritiesTax.mmTaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice5
	 * CorporateActionPrice5}</li>
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
	public static final MMMessageAttribute<CorporateActionPrice5, Optional<AmountPrice3>> mmTaxableIncomePerDividendShare = new MMMessageAttribute<CorporateActionPrice5, Optional<AmountPrice3>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmTaxableIncomePerDividendShare;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPrice5.mmObject();
			isDerived = false;
			xmlTag = "TaxblIncmPerDvddShr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::TDMT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxableIncomePerDividendShare";
			definition = "Amount included in the dividend/NAV that is identified as gains directly or indirectly derived from interest payments within the scope of the EU Savings directive.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountPrice3.mmObject();
		}

		@Override
		public Optional<AmountPrice3> getValue(CorporateActionPrice5 obj) {
			return obj.getTaxableIncomePerDividendShare();
		}

		@Override
		public void setValue(CorporateActionPrice5 obj, Optional<AmountPrice3> value) {
			obj.setTaxableIncomePerDividendShare(value.orElse(null));
		}
	};
	@XmlElement(name = "CshInLieuOfShrPric")
	protected PriceFormat5Choice cashInLieuOfSharePrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat5Choice
	 * PriceFormat5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmCashInLieuOfSharePrice
	 * CorporateActionPrice.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice5
	 * CorporateActionPrice5}</li>
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
	public static final MMMessageAttribute<CorporateActionPrice5, Optional<PriceFormat5Choice>> mmCashInLieuOfSharePrice = new MMMessageAttribute<CorporateActionPrice5, Optional<PriceFormat5Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionPrice.mmCashInLieuOfSharePrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPrice5.mmObject();
			isDerived = false;
			xmlTag = "CshInLieuOfShrPric";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::CINL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashInLieuOfSharePrice";
			definition = "Cash disbursement in lieu of equities; usually in lieu of fractional quantity.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceFormat5Choice.mmObject();
		}

		@Override
		public Optional<PriceFormat5Choice> getValue(CorporateActionPrice5 obj) {
			return obj.getCashInLieuOfSharePrice();
		}

		@Override
		public void setValue(CorporateActionPrice5 obj, Optional<PriceFormat5Choice> value) {
			obj.setCashInLieuOfSharePrice(value.orElse(null));
		}
	};
	@XmlElement(name = "OverSbcptDpstPric")
	protected PriceFormat5Choice overSubscriptionDepositPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat5Choice
	 * PriceFormat5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmOverSubscriptionDepositPrice
	 * CorporateActionPrice.mmOverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice5
	 * CorporateActionPrice5}</li>
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
	public static final MMMessageAttribute<CorporateActionPrice5, Optional<PriceFormat5Choice>> mmOverSubscriptionDepositPrice = new MMMessageAttribute<CorporateActionPrice5, Optional<PriceFormat5Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionPrice.mmOverSubscriptionDepositPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPrice5.mmObject();
			isDerived = false;
			xmlTag = "OverSbcptDpstPric";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::OSUB"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OverSubscriptionDepositPrice";
			definition = "Amount of money required per over-subscribed equity as defined by the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceFormat5Choice.mmObject();
		}

		@Override
		public Optional<PriceFormat5Choice> getValue(CorporateActionPrice5 obj) {
			return obj.getOverSubscriptionDepositPrice();
		}

		@Override
		public void setValue(CorporateActionPrice5 obj, Optional<PriceFormat5Choice> value) {
			obj.setOverSubscriptionDepositPrice(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPrice5.mmExercisePrice, com.tools20022.repository.msg.CorporateActionPrice5.mmGenericCashPriceReceivedPerProduct,
						com.tools20022.repository.msg.CorporateActionPrice5.mmGenericCashPricePaidPerProduct, com.tools20022.repository.msg.CorporateActionPrice5.mmTaxableIncomePerDividendShare,
						com.tools20022.repository.msg.CorporateActionPrice5.mmCashInLieuOfSharePrice, com.tools20022.repository.msg.CorporateActionPrice5.mmOverSubscriptionDepositPrice);
				trace_lazy = () -> CorporateActionPrice.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forCorporateActionPrice5);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionPrice5";
				definition = "Specifies prices.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PriceFormat6Choice> getExercisePrice() {
		return exercisePrice == null ? Optional.empty() : Optional.of(exercisePrice);
	}

	public CorporateActionPrice5 setExercisePrice(PriceFormat6Choice exercisePrice) {
		this.exercisePrice = exercisePrice;
		return this;
	}

	public List<PriceFormat7Choice> getGenericCashPriceReceivedPerProduct() {
		return genericCashPriceReceivedPerProduct == null ? genericCashPriceReceivedPerProduct = new ArrayList<>() : genericCashPriceReceivedPerProduct;
	}

	public CorporateActionPrice5 setGenericCashPriceReceivedPerProduct(List<PriceFormat7Choice> genericCashPriceReceivedPerProduct) {
		this.genericCashPriceReceivedPerProduct = Objects.requireNonNull(genericCashPriceReceivedPerProduct);
		return this;
	}

	public Optional<PriceFormat5Choice> getGenericCashPricePaidPerProduct() {
		return genericCashPricePaidPerProduct == null ? Optional.empty() : Optional.of(genericCashPricePaidPerProduct);
	}

	public CorporateActionPrice5 setGenericCashPricePaidPerProduct(PriceFormat5Choice genericCashPricePaidPerProduct) {
		this.genericCashPricePaidPerProduct = genericCashPricePaidPerProduct;
		return this;
	}

	public Optional<AmountPrice3> getTaxableIncomePerDividendShare() {
		return taxableIncomePerDividendShare == null ? Optional.empty() : Optional.of(taxableIncomePerDividendShare);
	}

	public CorporateActionPrice5 setTaxableIncomePerDividendShare(AmountPrice3 taxableIncomePerDividendShare) {
		this.taxableIncomePerDividendShare = taxableIncomePerDividendShare;
		return this;
	}

	public Optional<PriceFormat5Choice> getCashInLieuOfSharePrice() {
		return cashInLieuOfSharePrice == null ? Optional.empty() : Optional.of(cashInLieuOfSharePrice);
	}

	public CorporateActionPrice5 setCashInLieuOfSharePrice(PriceFormat5Choice cashInLieuOfSharePrice) {
		this.cashInLieuOfSharePrice = cashInLieuOfSharePrice;
		return this;
	}

	public Optional<PriceFormat5Choice> getOverSubscriptionDepositPrice() {
		return overSubscriptionDepositPrice == null ? Optional.empty() : Optional.of(overSubscriptionDepositPrice);
	}

	public CorporateActionPrice5 setOverSubscriptionDepositPrice(PriceFormat5Choice overSubscriptionDepositPrice) {
		this.overSubscriptionDepositPrice = overSubscriptionDepositPrice;
		return this;
	}
}