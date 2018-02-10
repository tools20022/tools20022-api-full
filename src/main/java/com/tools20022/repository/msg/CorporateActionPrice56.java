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
import com.tools20022.repository.choice.*;
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
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice56#mmIndicativeOrMarketPrice
 * CorporateActionPrice56.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice56#mmCashInLieuOfSharePrice
 * CorporateActionPrice56.mmCashInLieuOfSharePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice56#mmCashValueForTax
 * CorporateActionPrice56.mmCashValueForTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice56#mmGenericCashPricePaidPerProduct
 * CorporateActionPrice56.mmGenericCashPricePaidPerProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice56#mmGenericCashPriceReceivedPerProduct
 * CorporateActionPrice56.mmGenericCashPriceReceivedPerProduct}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline#forCorporateActionPrice56
 * ConstraintGenericCashPricePerProductGuideline.forCorporateActionPrice56}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionPrice56"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies prices related to a corporate action option."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice43
 * CorporateActionPrice43}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionPrice56", propOrder = {"indicativeOrMarketPrice", "cashInLieuOfSharePrice", "cashValueForTax", "genericCashPricePaidPerProduct", "genericCashPriceReceivedPerProduct"})
public class CorporateActionPrice56 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "IndctvOrMktPric")
	protected IndicativeOrMarketPrice7Choice indicativeOrMarketPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.IndicativeOrMarketPrice7Choice
	 * IndicativeOrMarketPrice7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice56
	 * CorporateActionPrice56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndctvOrMktPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90a::INDC or MRKT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndicativeOrMarketPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the price is an indicative price or a market price."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice43#mmIndicativeOrMarketPrice
	 * CorporateActionPrice43.mmIndicativeOrMarketPrice}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIndicativeOrMarketPrice = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CorporateActionPrice.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPrice56.mmObject();
			isDerived = false;
			xmlTag = "IndctvOrMktPric";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::INDC or MRKT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndicativeOrMarketPrice";
			definition = "Indicates whether the price is an indicative price or a market price.";
			previousVersion_lazy = () -> CorporateActionPrice43.mmIndicativeOrMarketPrice;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> IndicativeOrMarketPrice7Choice.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice56
	 * CorporateActionPrice56}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice43#mmCashInLieuOfSharePrice
	 * CorporateActionPrice43.mmCashInLieuOfSharePrice}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashInLieuOfSharePrice = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionPrice.mmCashInLieuOfSharePrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPrice56.mmObject();
			isDerived = false;
			xmlTag = "CshInLieuOfShrPric";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::CINL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashInLieuOfSharePrice";
			definition = "Cash disbursement in lieu of equities; usually in lieu of fractional quantity.";
			previousVersion_lazy = () -> CorporateActionPrice43.mmCashInLieuOfSharePrice;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceFormat45Choice.mmObject();
		}
	};
	@XmlElement(name = "CshValForTax")
	protected PriceFormat46Choice cashValueForTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat46Choice
	 * PriceFormat46Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmCashValueForTax
	 * CorporateActionPrice.mmCashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice56
	 * CorporateActionPrice56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshValForTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashValueForTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash value of resulting securities proceeds for tax calculation and/or reporting."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice43#mmCashValueForTax
	 * CorporateActionPrice43.mmCashValueForTax}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCashValueForTax = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionPrice.mmCashValueForTax;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPrice56.mmObject();
			isDerived = false;
			xmlTag = "CshValForTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashValueForTax";
			definition = "Cash value of resulting securities proceeds for tax calculation and/or reporting.";
			previousVersion_lazy = () -> CorporateActionPrice43.mmCashValueForTax;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceFormat46Choice.mmObject();
		}
	};
	@XmlElement(name = "GncCshPricPdPerPdct")
	protected PriceFormat44Choice genericCashPricePaidPerProduct;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PriceFormat44Choice
	 * PriceFormat44Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice56
	 * CorporateActionPrice56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GncCshPricPdPerPdct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePaidPerProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Generic cash price paid per product by the underlying security holder either as a percentage or an amount or a number of points above an index, for example, reinvestment price, strike price and exercise price."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice43#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice43.mmGenericCashPricePaidPerProduct}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmGenericCashPricePaidPerProduct = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionPrice.mmGenericCashPricePaidPerProduct;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPrice56.mmObject();
			isDerived = false;
			xmlTag = "GncCshPricPdPerPdct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePaidPerProduct";
			definition = "Generic cash price paid per product by the underlying security holder either as a percentage or an amount or a number of points above an index, for example, reinvestment price, strike price and exercise price.";
			previousVersion_lazy = () -> CorporateActionPrice43.mmGenericCashPricePaidPerProduct;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceFormat44Choice.mmObject();
		}
	};
	@XmlElement(name = "GncCshPricRcvdPerPdct")
	protected PriceFormat47Choice genericCashPriceReceivedPerProduct;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PriceFormat47Choice
	 * PriceFormat47Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice56
	 * CorporateActionPrice56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GncCshPricRcvdPerPdct"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice43#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice43.mmGenericCashPriceReceivedPerProduct}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmGenericCashPriceReceivedPerProduct = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionPrice.mmGenericCashPriceReceivedPerProduct;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPrice56.mmObject();
			isDerived = false;
			xmlTag = "GncCshPricRcvdPerPdct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPriceReceivedPerProduct";
			definition = "Generic cash price received per product by the underlying security holder either as a percentage or an amount, for example, redemption price.";
			previousVersion_lazy = () -> CorporateActionPrice43.mmGenericCashPriceReceivedPerProduct;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceFormat47Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPrice56.mmIndicativeOrMarketPrice, com.tools20022.repository.msg.CorporateActionPrice56.mmCashInLieuOfSharePrice,
						com.tools20022.repository.msg.CorporateActionPrice56.mmCashValueForTax, com.tools20022.repository.msg.CorporateActionPrice56.mmGenericCashPricePaidPerProduct,
						com.tools20022.repository.msg.CorporateActionPrice56.mmGenericCashPriceReceivedPerProduct);
				trace_lazy = () -> CorporateActionPrice.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forCorporateActionPrice56);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionPrice56";
				definition = "Specifies prices related to a corporate action option.";
				previousVersion_lazy = () -> CorporateActionPrice43.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<IndicativeOrMarketPrice7Choice> getIndicativeOrMarketPrice() {
		return indicativeOrMarketPrice == null ? Optional.empty() : Optional.of(indicativeOrMarketPrice);
	}

	public CorporateActionPrice56 setIndicativeOrMarketPrice(IndicativeOrMarketPrice7Choice indicativeOrMarketPrice) {
		this.indicativeOrMarketPrice = indicativeOrMarketPrice;
		return this;
	}

	public Optional<PriceFormat45Choice> getCashInLieuOfSharePrice() {
		return cashInLieuOfSharePrice == null ? Optional.empty() : Optional.of(cashInLieuOfSharePrice);
	}

	public CorporateActionPrice56 setCashInLieuOfSharePrice(PriceFormat45Choice cashInLieuOfSharePrice) {
		this.cashInLieuOfSharePrice = cashInLieuOfSharePrice;
		return this;
	}

	public Optional<PriceFormat46Choice> getCashValueForTax() {
		return cashValueForTax == null ? Optional.empty() : Optional.of(cashValueForTax);
	}

	public CorporateActionPrice56 setCashValueForTax(PriceFormat46Choice cashValueForTax) {
		this.cashValueForTax = cashValueForTax;
		return this;
	}

	public Optional<PriceFormat44Choice> getGenericCashPricePaidPerProduct() {
		return genericCashPricePaidPerProduct == null ? Optional.empty() : Optional.of(genericCashPricePaidPerProduct);
	}

	public CorporateActionPrice56 setGenericCashPricePaidPerProduct(PriceFormat44Choice genericCashPricePaidPerProduct) {
		this.genericCashPricePaidPerProduct = genericCashPricePaidPerProduct;
		return this;
	}

	public Optional<PriceFormat47Choice> getGenericCashPriceReceivedPerProduct() {
		return genericCashPriceReceivedPerProduct == null ? Optional.empty() : Optional.of(genericCashPriceReceivedPerProduct);
	}

	public CorporateActionPrice56 setGenericCashPriceReceivedPerProduct(PriceFormat47Choice genericCashPriceReceivedPerProduct) {
		this.genericCashPriceReceivedPerProduct = genericCashPriceReceivedPerProduct;
		return this;
	}
}