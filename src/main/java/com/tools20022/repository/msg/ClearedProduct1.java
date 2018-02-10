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
import com.tools20022.repository.area.auth.CCPClearedProductReportV01;
import com.tools20022.repository.choice.Product1Choice;
import com.tools20022.repository.datatype.MICIdentifier;
import com.tools20022.repository.datatype.NonNegativeNumber;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Financial instrument cleared by a central counterparty.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ClearedProduct1#mmTradingVenue
 * ClearedProduct1.mmTradingVenue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearedProduct1#mmCCPProductIdentification
 * ClearedProduct1.mmCCPProductIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearedProduct1#mmUniversalProductIdentification
 * ClearedProduct1.mmUniversalProductIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ClearedProduct1#mmProduct
 * ClearedProduct1.mmProduct}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ClearedProduct1#mmOpenInterest
 * ClearedProduct1.mmOpenInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearedProduct1#mmTradesCleared
 * ClearedProduct1.mmTradesCleared}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CCPClearedProductReportV01#mmClearedProduct
 * CCPClearedProductReportV01.mmClearedProduct}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ClearedProduct1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Financial instrument cleared by a central counterparty."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ClearedProduct1", propOrder = {"tradingVenue", "cCPProductIdentification", "universalProductIdentification", "product", "openInterest", "tradesCleared"})
public class ClearedProduct1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TradgVn", required = true)
	protected MICIdentifier tradingVenue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.MICIdentifier
	 * MICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmMIC
	 * OrganisationIdentification.mmMIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClearedProduct1
	 * ClearedProduct1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgVn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingVenue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Exchange or trading venue where product is traded.\r\n\r\n"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradingVenue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmMIC;
			componentContext_lazy = () -> com.tools20022.repository.msg.ClearedProduct1.mmObject();
			isDerived = false;
			xmlTag = "TradgVn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingVenue";
			definition = "Exchange or trading venue where product is traded.\r\n\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MICIdentifier.mmObject();
		}
	};
	@XmlElement(name = "CCPPdctId", required = true)
	protected GenericIdentification172 cCPProductIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification172
	 * GenericIdentification172}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClearedProduct1
	 * ClearedProduct1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CCPPdctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CCPProductIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "CCP's unique identification for product cleared."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCCPProductIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ClearedProduct1.mmObject();
			isDerived = false;
			xmlTag = "CCPPdctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CCPProductIdentification";
			definition = "CCP's unique identification for product cleared.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification172.mmObject();
		}
	};
	@XmlElement(name = "UvrslPdctId")
	protected GenericIdentification170 universalProductIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification170
	 * GenericIdentification170}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmUniqueTradeIdentifier
	 * TradeIdentification.mmUniqueTradeIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClearedProduct1
	 * ClearedProduct1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UvrslPdctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UniversalProductIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Standard unique identification of product cleared."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUniversalProductIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmUniqueTradeIdentifier;
			componentContext_lazy = () -> com.tools20022.repository.msg.ClearedProduct1.mmObject();
			isDerived = false;
			xmlTag = "UvrslPdctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UniversalProductIdentification";
			definition = "Standard unique identification of product cleared.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification170.mmObject();
		}
	};
	@XmlElement(name = "Pdct", required = true)
	protected Product1Choice product;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Product1Choice
	 * Product1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassification#mmProductType
	 * AssetClassification.mmProductType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClearedProduct1
	 * ClearedProduct1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pdct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Product"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Choice between the major categories of financial instruments."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProduct = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> AssetClassification.mmProductType;
			componentContext_lazy = () -> com.tools20022.repository.msg.ClearedProduct1.mmObject();
			isDerived = false;
			xmlTag = "Pdct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Product";
			definition = "Choice between the major categories of financial instruments.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Product1Choice.mmObject();
		}
	};
	@XmlElement(name = "OpnIntrst", required = true)
	protected OpenInterest1 openInterest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OpenInterest1
	 * OpenInterest1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmInterest
	 * AssetHolding.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClearedProduct1
	 * ClearedProduct1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OpnIntrst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpenInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Measure of the current stock of a financial instrument that has been traded on an exchange or cleared via a central counterparty."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOpenInterest = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmInterest;
			componentContext_lazy = () -> com.tools20022.repository.msg.ClearedProduct1.mmObject();
			isDerived = false;
			xmlTag = "OpnIntrst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpenInterest";
			definition = "Measure of the current stock of a financial instrument that has been traded on an exchange or cleared via a central counterparty.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OpenInterest1.mmObject();
		}
	};
	@XmlElement(name = "TrdsClrd")
	protected NonNegativeNumber tradesCleared;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.NonNegativeNumber
	 * NonNegativeNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClearedProduct1
	 * ClearedProduct1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrdsClrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradesCleared"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of trades cleared over the reporting period."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradesCleared = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ClearedProduct1.mmObject();
			isDerived = false;
			xmlTag = "TrdsClrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradesCleared";
			definition = "Number of trades cleared over the reporting period.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> NonNegativeNumber.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ClearedProduct1.mmTradingVenue, com.tools20022.repository.msg.ClearedProduct1.mmCCPProductIdentification,
						com.tools20022.repository.msg.ClearedProduct1.mmUniversalProductIdentification, com.tools20022.repository.msg.ClearedProduct1.mmProduct, com.tools20022.repository.msg.ClearedProduct1.mmOpenInterest,
						com.tools20022.repository.msg.ClearedProduct1.mmTradesCleared);
				messageBuildingBlock_lazy = () -> Arrays.asList(CCPClearedProductReportV01.mmClearedProduct);
				trace_lazy = () -> Asset.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ClearedProduct1";
				definition = "Financial instrument cleared by a central counterparty.";
			}
		});
		return mmObject_lazy.get();
	}

	public MICIdentifier getTradingVenue() {
		return tradingVenue;
	}

	public ClearedProduct1 setTradingVenue(MICIdentifier tradingVenue) {
		this.tradingVenue = Objects.requireNonNull(tradingVenue);
		return this;
	}

	public GenericIdentification172 getCCPProductIdentification() {
		return cCPProductIdentification;
	}

	public ClearedProduct1 setCCPProductIdentification(com.tools20022.repository.msg.GenericIdentification172 cCPProductIdentification) {
		this.cCPProductIdentification = Objects.requireNonNull(cCPProductIdentification);
		return this;
	}

	public Optional<GenericIdentification170> getUniversalProductIdentification() {
		return universalProductIdentification == null ? Optional.empty() : Optional.of(universalProductIdentification);
	}

	public ClearedProduct1 setUniversalProductIdentification(com.tools20022.repository.msg.GenericIdentification170 universalProductIdentification) {
		this.universalProductIdentification = universalProductIdentification;
		return this;
	}

	public Product1Choice getProduct() {
		return product;
	}

	public ClearedProduct1 setProduct(Product1Choice product) {
		this.product = Objects.requireNonNull(product);
		return this;
	}

	public OpenInterest1 getOpenInterest() {
		return openInterest;
	}

	public ClearedProduct1 setOpenInterest(com.tools20022.repository.msg.OpenInterest1 openInterest) {
		this.openInterest = Objects.requireNonNull(openInterest);
		return this;
	}

	public Optional<NonNegativeNumber> getTradesCleared() {
		return tradesCleared == null ? Optional.empty() : Optional.of(tradesCleared);
	}

	public ClearedProduct1 setTradesCleared(NonNegativeNumber tradesCleared) {
		this.tradesCleared = tradesCleared;
		return this;
	}
}