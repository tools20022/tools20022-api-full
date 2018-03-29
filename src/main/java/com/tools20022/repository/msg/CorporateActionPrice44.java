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
import com.tools20022.repository.choice.IndicativeOrMarketPrice2Choice;
import com.tools20022.repository.choice.PriceFormat33Choice;
import com.tools20022.repository.choice.PriceFormat5Choice;
import com.tools20022.repository.entity.CorporateActionPrice;
import com.tools20022.repository.entity.Issuance;
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
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice44#mmIndicativeOrMarketPrice
 * CorporateActionPrice44.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice44#mmIssuePrice
 * CorporateActionPrice44.mmIssuePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice44#mmGenericCashPriceReceivedPerProduct
 * CorporateActionPrice44.mmGenericCashPriceReceivedPerProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice44#mmGenericCashPricePaidPerProduct
 * CorporateActionPrice44.mmGenericCashPricePaidPerProduct}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline#forCorporateActionPrice44
 * ConstraintGenericCashPricePerProductGuideline.forCorporateActionPrice44}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionPrice44"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies prices related to a corporate action option."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice60
 * CorporateActionPrice60}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice29
 * CorporateActionPrice29}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionPrice44", propOrder = {"indicativeOrMarketPrice", "issuePrice", "genericCashPriceReceivedPerProduct", "genericCashPricePaidPerProduct"})
public class CorporateActionPrice44 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "IndctvOrMktPric")
	protected IndicativeOrMarketPrice2Choice indicativeOrMarketPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.IndicativeOrMarketPrice2Choice
	 * IndicativeOrMarketPrice2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice44
	 * CorporateActionPrice44}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice60#mmIndicativeOrMarketPrice
	 * CorporateActionPrice60.mmIndicativeOrMarketPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice29#mmIndicativeOrMarketPrice
	 * CorporateActionPrice29.mmIndicativeOrMarketPrice}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPrice44, Optional<IndicativeOrMarketPrice2Choice>> mmIndicativeOrMarketPrice = new MMMessageAssociationEnd<CorporateActionPrice44, Optional<IndicativeOrMarketPrice2Choice>>() {
		{
			businessComponentTrace_lazy = () -> CorporateActionPrice.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPrice44.mmObject();
			isDerived = false;
			xmlTag = "IndctvOrMktPric";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::INDC or MRKT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndicativeOrMarketPrice";
			definition = "Indicates whether the price is an indicative price or a market price.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionPrice60.mmIndicativeOrMarketPrice);
			previousVersion_lazy = () -> CorporateActionPrice29.mmIndicativeOrMarketPrice;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> IndicativeOrMarketPrice2Choice.mmObject();
		}

		@Override
		public Optional<IndicativeOrMarketPrice2Choice> getValue(CorporateActionPrice44 obj) {
			return obj.getIndicativeOrMarketPrice();
		}

		@Override
		public void setValue(CorporateActionPrice44 obj, Optional<IndicativeOrMarketPrice2Choice> value) {
			obj.setIndicativeOrMarketPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "IssePric")
	protected PriceFormat5Choice issuePrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PriceFormat5Choice
	 * PriceFormat5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmIssuePrice
	 * Issuance.mmIssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice44
	 * CorporateActionPrice44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssePric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90a::ISSU</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Initial issue price of a financial instrument."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice60#mmIssuePrice
	 * CorporateActionPrice60.mmIssuePrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice29#mmIssuePrice
	 * CorporateActionPrice29.mmIssuePrice}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPrice44, Optional<PriceFormat5Choice>> mmIssuePrice = new MMMessageAssociationEnd<CorporateActionPrice44, Optional<PriceFormat5Choice>>() {
		{
			businessElementTrace_lazy = () -> Issuance.mmIssuePrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPrice44.mmObject();
			isDerived = false;
			xmlTag = "IssePric";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::ISSU"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuePrice";
			definition = "Initial issue price of a financial instrument.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionPrice60.mmIssuePrice);
			previousVersion_lazy = () -> CorporateActionPrice29.mmIssuePrice;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceFormat5Choice.mmObject();
		}

		@Override
		public Optional<PriceFormat5Choice> getValue(CorporateActionPrice44 obj) {
			return obj.getIssuePrice();
		}

		@Override
		public void setValue(CorporateActionPrice44 obj, Optional<PriceFormat5Choice> value) {
			obj.setIssuePrice(value.orElse(null));
		}
	};
	@XmlElement(name = "GncCshPricRcvdPerPdct")
	protected PriceFormat33Choice genericCashPriceReceivedPerProduct;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PriceFormat33Choice
	 * PriceFormat33Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice44
	 * CorporateActionPrice44}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice60#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice60.mmGenericCashPriceReceivedPerProduct}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice29#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice29.mmGenericCashPriceReceivedPerProduct}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPrice44, Optional<PriceFormat33Choice>> mmGenericCashPriceReceivedPerProduct = new MMMessageAssociationEnd<CorporateActionPrice44, Optional<PriceFormat33Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionPrice.mmGenericCashPriceReceivedPerProduct;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPrice44.mmObject();
			isDerived = false;
			xmlTag = "GncCshPricRcvdPerPdct";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::OFFR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPriceReceivedPerProduct";
			definition = "Generic cash price received per product by the underlying security holder either as a percentage or an amount, for example, redemption price.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionPrice60.mmGenericCashPriceReceivedPerProduct);
			previousVersion_lazy = () -> CorporateActionPrice29.mmGenericCashPriceReceivedPerProduct;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceFormat33Choice.mmObject();
		}

		@Override
		public Optional<PriceFormat33Choice> getValue(CorporateActionPrice44 obj) {
			return obj.getGenericCashPriceReceivedPerProduct();
		}

		@Override
		public void setValue(CorporateActionPrice44 obj, Optional<PriceFormat33Choice> value) {
			obj.setGenericCashPriceReceivedPerProduct(value.orElse(null));
		}
	};
	@XmlElement(name = "GncCshPricPdPerPdct")
	protected PriceFormat5Choice genericCashPricePaidPerProduct;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PriceFormat5Choice
	 * PriceFormat5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice44
	 * CorporateActionPrice44}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice60#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice60.mmGenericCashPricePaidPerProduct}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice29#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice29.mmGenericCashPricePaidPerProduct}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPrice44, Optional<PriceFormat5Choice>> mmGenericCashPricePaidPerProduct = new MMMessageAssociationEnd<CorporateActionPrice44, Optional<PriceFormat5Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionPrice.mmGenericCashPricePaidPerProduct;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPrice44.mmObject();
			isDerived = false;
			xmlTag = "GncCshPricPdPerPdct";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::PRPP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePaidPerProduct";
			definition = "Generic cash price paid per product by the underlying security holder either as a percentage or an amount, for example, reinvestment price.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionPrice60.mmGenericCashPricePaidPerProduct);
			previousVersion_lazy = () -> CorporateActionPrice29.mmGenericCashPricePaidPerProduct;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceFormat5Choice.mmObject();
		}

		@Override
		public Optional<PriceFormat5Choice> getValue(CorporateActionPrice44 obj) {
			return obj.getGenericCashPricePaidPerProduct();
		}

		@Override
		public void setValue(CorporateActionPrice44 obj, Optional<PriceFormat5Choice> value) {
			obj.setGenericCashPricePaidPerProduct(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPrice44.mmIndicativeOrMarketPrice, com.tools20022.repository.msg.CorporateActionPrice44.mmIssuePrice,
						com.tools20022.repository.msg.CorporateActionPrice44.mmGenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.CorporateActionPrice44.mmGenericCashPricePaidPerProduct);
				trace_lazy = () -> CorporateActionPrice.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forCorporateActionPrice44);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionPrice44";
				definition = "Specifies prices related to a corporate action option.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionPrice60.mmObject());
				previousVersion_lazy = () -> CorporateActionPrice29.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<IndicativeOrMarketPrice2Choice> getIndicativeOrMarketPrice() {
		return indicativeOrMarketPrice == null ? Optional.empty() : Optional.of(indicativeOrMarketPrice);
	}

	public CorporateActionPrice44 setIndicativeOrMarketPrice(IndicativeOrMarketPrice2Choice indicativeOrMarketPrice) {
		this.indicativeOrMarketPrice = indicativeOrMarketPrice;
		return this;
	}

	public Optional<PriceFormat5Choice> getIssuePrice() {
		return issuePrice == null ? Optional.empty() : Optional.of(issuePrice);
	}

	public CorporateActionPrice44 setIssuePrice(PriceFormat5Choice issuePrice) {
		this.issuePrice = issuePrice;
		return this;
	}

	public Optional<PriceFormat33Choice> getGenericCashPriceReceivedPerProduct() {
		return genericCashPriceReceivedPerProduct == null ? Optional.empty() : Optional.of(genericCashPriceReceivedPerProduct);
	}

	public CorporateActionPrice44 setGenericCashPriceReceivedPerProduct(PriceFormat33Choice genericCashPriceReceivedPerProduct) {
		this.genericCashPriceReceivedPerProduct = genericCashPriceReceivedPerProduct;
		return this;
	}

	public Optional<PriceFormat5Choice> getGenericCashPricePaidPerProduct() {
		return genericCashPricePaidPerProduct == null ? Optional.empty() : Optional.of(genericCashPricePaidPerProduct);
	}

	public CorporateActionPrice44 setGenericCashPricePaidPerProduct(PriceFormat5Choice genericCashPricePaidPerProduct) {
		this.genericCashPricePaidPerProduct = genericCashPricePaidPerProduct;
		return this;
	}
}