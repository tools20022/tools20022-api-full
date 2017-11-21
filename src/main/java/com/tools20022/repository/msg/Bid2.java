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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.ListTrading;
import com.tools20022.repository.entity.SecuritiesOrder;
import com.tools20022.repository.entity.SecuritiesQuoteVariable;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identification of an attempt to buy or sell a large number of financial
 * instruments contained in or comprising a portfolio.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Bid2#mmBidIdentification
 * Bid2.mmBidIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Bid2#mmClientBidIdentification
 * Bid2.mmClientBidIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Bid2#mmListIdentification
 * Bid2.mmListIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Bid2#mmBidResponsePriceDetails
 * Bid2.mmBidResponsePriceDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
 * SecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Bid2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identification of an attempt to buy or sell a large number of financial instruments contained in or comprising a portfolio."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Bid2", propOrder = {"bidIdentification", "clientBidIdentification", "listIdentification", "bidResponsePriceDetails"})
public class Bid2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text bidIdentification;
	/**
	 * Unique and unambiguous identification of the bid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Bid2 Bid2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BidId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BidIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique and unambiguous identification of the bid."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBidIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Bid2.mmObject();
			isDerived = false;
			xmlTag = "BidId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BidIdentification";
			definition = "Unique and unambiguous identification of the bid.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text clientBidIdentification;
	/**
	 * Unique identifier for a Bid Request as assigned by institution.
	 * Uniqueness must be guaranteed within a single trading day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Bid2 Bid2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntBidId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientBidIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier for a Bid Request as assigned by institution. Uniqueness must be guaranteed within a single trading day."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClientBidIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Bid2.mmObject();
			isDerived = false;
			xmlTag = "ClntBidId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientBidIdentification";
			definition = "Unique identifier for a Bid Request as assigned by institution. Uniqueness must be guaranteed within a single trading day.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text listIdentification;
	/**
	 * Name or number assigned by an entity to enable recognition of that
	 * entity, eg, account identifier.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Bid2 Bid2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ListId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ListIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name or number assigned by an entity to enable recognition of that entity, eg, account identifier."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmListIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ListTrading.mmListIdentification;
			componentContext_lazy = () -> Bid2.mmObject();
			isDerived = false;
			xmlTag = "ListId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ListIdentification";
			definition = "Name or number assigned by an entity to enable recognition of that entity, eg, account identifier.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.BidResponsePrice1> bidResponsePriceDetails;
	/**
	 * Provides details about the price linked to a particular bid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BidResponsePrice1
	 * BidResponsePrice1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#mmBidSide
	 * SecuritiesQuoteVariable.mmBidSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Bid2 Bid2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BidRspnPricDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BidResponsePriceDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the price linked to a particular bid."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBidResponsePriceDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuoteVariable.mmBidSide;
			componentContext_lazy = () -> Bid2.mmObject();
			isDerived = false;
			xmlTag = "BidRspnPricDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BidResponsePriceDetails";
			definition = "Provides details about the price linked to a particular bid.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BidResponsePrice1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Bid2.mmBidIdentification, Bid2.mmClientBidIdentification, Bid2.mmListIdentification, Bid2.mmBidResponsePriceDetails);
				trace_lazy = () -> SecuritiesOrder.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Bid2";
				definition = "Identification of an attempt to buy or sell a large number of financial instruments contained in or comprising a portfolio.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "BidId")
	public Max35Text getBidIdentification() {
		return bidIdentification;
	}

	public void setBidIdentification(Max35Text bidIdentification) {
		this.bidIdentification = bidIdentification;
	}

	@XmlElement(name = "ClntBidId")
	public Max35Text getClientBidIdentification() {
		return clientBidIdentification;
	}

	public void setClientBidIdentification(Max35Text clientBidIdentification) {
		this.clientBidIdentification = clientBidIdentification;
	}

	@XmlElement(name = "ListId", required = true)
	public Max35Text getListIdentification() {
		return listIdentification;
	}

	public void setListIdentification(Max35Text listIdentification) {
		this.listIdentification = listIdentification;
	}

	@XmlElement(name = "BidRspnPricDtls", required = true)
	public List<BidResponsePrice1> getBidResponsePriceDetails() {
		return bidResponsePriceDetails;
	}

	public void setBidResponsePriceDetails(List<com.tools20022.repository.msg.BidResponsePrice1> bidResponsePriceDetails) {
		this.bidResponsePriceDetails = bidResponsePriceDetails;
	}
}