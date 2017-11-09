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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Additional references linked to the list order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Reference12#mmBidIdentification
 * Reference12.mmBidIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Reference12#mmClientBidIdentification
 * Reference12.mmClientBidIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Reference12#mmIOIIdentification
 * Reference12.mmIOIIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Reference12#mmQuoteIdentification
 * Reference12.mmQuoteIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Reference12#mmReferenceOrderIdentification
 * Reference12.mmReferenceOrderIdentification}</li>
 * </ul>
 * </li>
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
 * "Reference12"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Additional references linked to the list order."</li>
 * </ul>
 */
public class Reference12 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text bidIdentification;
	/**
	 * Unique identifier for bid response as assigned by sell-side (broker,
	 * exchange, electronic communication network).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Reference12 Reference12}</li>
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
	 * definition} =
	 * "Unique identifier for bid response as assigned by sell-side (broker, exchange, electronic communication network)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBidIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Reference12.mmObject();
			isDerived = false;
			xmlTag = "BidId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BidIdentification";
			definition = "Unique identifier for bid response as assigned by sell-side (broker, exchange, electronic communication network).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text clientBidIdentification;
	/**
	 * Unique identifier for a bid request as assigned by institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Reference12 Reference12}</li>
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
	 * "Unique identifier for a bid request as assigned by institution."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClientBidIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Reference12.mmObject();
			isDerived = false;
			xmlTag = "ClntBidId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientBidIdentification";
			definition = "Unique identifier for a bid request as assigned by institution.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text iOIIdentification;
	/**
	 * Unique identifier of the indication of interest message. Required for
	 * previously indicated orders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Reference12 Reference12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IOIId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IOIIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier of the indication of interest message. Required for previously indicated orders."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIOIIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Reference12.mmObject();
			isDerived = false;
			xmlTag = "IOIId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IOIIdentification";
			definition = "Unique identifier of the indication of interest message. Required for previously indicated orders.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text quoteIdentification;
	/**
	 * Unique identifier for quote. Required for previously quoted orders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Reference12 Reference12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuoteIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier for quote. Required for previously quoted orders."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQuoteIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Reference12.mmObject();
			isDerived = false;
			xmlTag = "QtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuoteIdentification";
			definition = "Unique identifier for quote. Required for previously quoted orders.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text referenceOrderIdentification;
	/**
	 * Unique identifier of the order being hit or taken.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Reference12 Reference12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RefOrdrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceOrderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identifier of  the order being hit or taken."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReferenceOrderIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Reference12.mmObject();
			isDerived = false;
			xmlTag = "RefOrdrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceOrderIdentification";
			definition = "Unique identifier of  the order being hit or taken.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Reference12.mmBidIdentification, Reference12.mmClientBidIdentification, Reference12.mmIOIIdentification, Reference12.mmQuoteIdentification,
						Reference12.mmReferenceOrderIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Reference12";
				definition = "Additional references linked to the list order.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getBidIdentification() {
		return bidIdentification;
	}

	public void setBidIdentification(Max35Text bidIdentification) {
		this.bidIdentification = bidIdentification;
	}

	public Max35Text getClientBidIdentification() {
		return clientBidIdentification;
	}

	public void setClientBidIdentification(Max35Text clientBidIdentification) {
		this.clientBidIdentification = clientBidIdentification;
	}

	public Max35Text getIOIIdentification() {
		return iOIIdentification;
	}

	public void setIOIIdentification(Max35Text iOIIdentification) {
		this.iOIIdentification = iOIIdentification;
	}

	public Max35Text getQuoteIdentification() {
		return quoteIdentification;
	}

	public void setQuoteIdentification(Max35Text quoteIdentification) {
		this.quoteIdentification = quoteIdentification;
	}

	public Max35Text getReferenceOrderIdentification() {
		return referenceOrderIdentification;
	}

	public void setReferenceOrderIdentification(Max35Text referenceOrderIdentification) {
		this.referenceOrderIdentification = referenceOrderIdentification;
	}
}