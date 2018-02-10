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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.ListTrading;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the details for negotiating and trading a large number of securities
 * contained in or comprising a portfolio.
 * 
 * One example is index arbitrage, which consists in the purchase or sale of a
 * basket of stocks in conjunction with the sale or purchase of a derivative
 * product (for example index futures) to profit from price differences between
 * the basket and the derivative product.
 * 
 * Other examples include liquidation of EFP (Exchange for Physical) stock
 * positions, portfolio realignment and portfolio liquidation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.List3#mmListIdentification
 * List3.mmListIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.List3#mmNumberOfStrikes
 * List3.mmNumberOfStrikes}</li>
 * <li>{@linkplain com.tools20022.repository.msg.List3#mmTotalNumberOfStrikes
 * List3.mmTotalNumberOfStrikes}</li>
 * <li>{@linkplain com.tools20022.repository.msg.List3#mmStrikePriceDetails
 * List3.mmStrikePriceDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ListTrading
 * ListTrading}</li>
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
 * "List3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the details for negotiating and trading a large number of securities contained in or comprising a portfolio. \n\nOne example is index arbitrage, which consists in the purchase or sale of a basket of stocks in conjunction with the sale or purchase of\na derivative product (for example index futures) to profit from price differences between the basket and the derivative product. \n\nOther examples include liquidation of EFP (Exchange for Physical) stock positions, portfolio realignment and portfolio liquidation."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "List3", propOrder = {"listIdentification", "numberOfStrikes", "totalNumberOfStrikes", "strikePriceDetails"})
public class List3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ListId", required = true)
	protected Max35Text listIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ListTrading#mmListIdentification
	 * ListTrading.mmListIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.List3
	 * List3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ListId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 66</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ListIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier for a list, as assigned by the trading party. The identifier must be unique within a single trading day."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmListIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ListTrading.mmListIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.List3.mmObject();
			isDerived = false;
			xmlTag = "ListId";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "66"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ListIdentification";
			definition = "Unique identifier for a list, as assigned by the trading party. The identifier must be unique within a single trading day.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "NbOfStrks", required = true)
	protected Number numberOfStrikes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.List3
	 * List3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfStrks"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 428</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfStrikes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the number of strike price entries in this message."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNumberOfStrikes = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.List3.mmObject();
			isDerived = false;
			xmlTag = "NbOfStrks";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "428"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfStrikes";
			definition = "Identifies the number of strike price entries in this message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "TtlNbOfStrks", required = true)
	protected Number totalNumberOfStrikes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.List3
	 * List3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNbOfStrks"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 422</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNumberOfStrikes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the total number of strike price entries across all messages with the same ListIdentification."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalNumberOfStrikes = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.List3.mmObject();
			isDerived = false;
			xmlTag = "TtlNbOfStrks";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "422"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberOfStrikes";
			definition = "Identifies the total number of strike price entries across all messages with the same ListIdentification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "StrkPricDtls", required = true)
	protected List<com.tools20022.repository.msg.ListStrikePriceDetails1> strikePriceDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ListStrikePriceDetails1
	 * ListStrikePriceDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ListTrading ListTrading}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.List3
	 * List3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StrkPricDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StrikePriceDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the details for negotiating and trading a large number of securities contained in or comprising a portfolio. \n\nOne example is index arbitrage, which consists in the purchase or sale of a basket of stocks in conjunction with the sale or purchase of\na derivative product (for example index futures) to profit from price differences between the basket and the derivative product. \n\nOther examples include liquidation of EFP (Exchange for Physical) stock positions, portfolio realignment and portfolio liquidation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStrikePriceDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> ListTrading.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.List3.mmObject();
			isDerived = false;
			xmlTag = "StrkPricDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StrikePriceDetails";
			definition = "Provides the details for negotiating and trading a large number of securities contained in or comprising a portfolio. \n\nOne example is index arbitrage, which consists in the purchase or sale of a basket of stocks in conjunction with the sale or purchase of\na derivative product (for example index futures) to profit from price differences between the basket and the derivative product. \n\nOther examples include liquidation of EFP (Exchange for Physical) stock positions, portfolio realignment and portfolio liquidation.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ListStrikePriceDetails1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.List3.mmListIdentification, com.tools20022.repository.msg.List3.mmNumberOfStrikes, com.tools20022.repository.msg.List3.mmTotalNumberOfStrikes,
						com.tools20022.repository.msg.List3.mmStrikePriceDetails);
				trace_lazy = () -> ListTrading.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "List3";
				definition = "Provides the details for negotiating and trading a large number of securities contained in or comprising a portfolio. \n\nOne example is index arbitrage, which consists in the purchase or sale of a basket of stocks in conjunction with the sale or purchase of\na derivative product (for example index futures) to profit from price differences between the basket and the derivative product. \n\nOther examples include liquidation of EFP (Exchange for Physical) stock positions, portfolio realignment and portfolio liquidation.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getListIdentification() {
		return listIdentification;
	}

	public List3 setListIdentification(Max35Text listIdentification) {
		this.listIdentification = Objects.requireNonNull(listIdentification);
		return this;
	}

	public Number getNumberOfStrikes() {
		return numberOfStrikes;
	}

	public List3 setNumberOfStrikes(Number numberOfStrikes) {
		this.numberOfStrikes = Objects.requireNonNull(numberOfStrikes);
		return this;
	}

	public Number getTotalNumberOfStrikes() {
		return totalNumberOfStrikes;
	}

	public List3 setTotalNumberOfStrikes(Number totalNumberOfStrikes) {
		this.totalNumberOfStrikes = Objects.requireNonNull(totalNumberOfStrikes);
		return this;
	}

	public List<ListStrikePriceDetails1> getStrikePriceDetails() {
		return strikePriceDetails == null ? strikePriceDetails = new ArrayList<>() : strikePriceDetails;
	}

	public List3 setStrikePriceDetails(List<com.tools20022.repository.msg.ListStrikePriceDetails1> strikePriceDetails) {
		this.strikePriceDetails = Objects.requireNonNull(strikePriceDetails);
		return this;
	}
}