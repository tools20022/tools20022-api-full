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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max35Text;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Reference12", propOrder = {"bidIdentification", "clientBidIdentification", "iOIIdentification", "quoteIdentification", "referenceOrderIdentification"})
public class Reference12 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "BidId")
	protected Max35Text bidIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Reference12 Reference12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BidId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 390</li>
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
	public static final MMMessageAttribute<Reference12, Optional<Max35Text>> mmBidIdentification = new MMMessageAttribute<Reference12, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Reference12.mmObject();
			isDerived = false;
			xmlTag = "BidId";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "390"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BidIdentification";
			definition = "Unique identifier for bid response as assigned by sell-side (broker, exchange, electronic communication network).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Reference12 obj) {
			return obj.getBidIdentification();
		}

		@Override
		public void setValue(Reference12 obj, Optional<Max35Text> value) {
			obj.setBidIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "ClntBidId")
	protected Max35Text clientBidIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Reference12 Reference12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntBidId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 391</li>
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
	public static final MMMessageAttribute<Reference12, Optional<Max35Text>> mmClientBidIdentification = new MMMessageAttribute<Reference12, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Reference12.mmObject();
			isDerived = false;
			xmlTag = "ClntBidId";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "391"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientBidIdentification";
			definition = "Unique identifier for a bid request as assigned by institution.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Reference12 obj) {
			return obj.getClientBidIdentification();
		}

		@Override
		public void setValue(Reference12 obj, Optional<Max35Text> value) {
			obj.setClientBidIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "IOIId", required = true)
	protected Max35Text iOIIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Reference12 Reference12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IOIId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 23</li>
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
	public static final MMMessageAttribute<Reference12, Max35Text> mmIOIIdentification = new MMMessageAttribute<Reference12, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Reference12.mmObject();
			isDerived = false;
			xmlTag = "IOIId";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "23"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IOIIdentification";
			definition = "Unique identifier of the indication of interest message. Required for previously indicated orders.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Reference12 obj) {
			return obj.getIOIIdentification();
		}

		@Override
		public void setValue(Reference12 obj, Max35Text value) {
			obj.setIOIIdentification(value);
		}
	};
	@XmlElement(name = "QtId", required = true)
	protected Max35Text quoteIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Reference12 Reference12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 117</li>
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
	public static final MMMessageAttribute<Reference12, Max35Text> mmQuoteIdentification = new MMMessageAttribute<Reference12, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Reference12.mmObject();
			isDerived = false;
			xmlTag = "QtId";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "117"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuoteIdentification";
			definition = "Unique identifier for quote. Required for previously quoted orders.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Reference12 obj) {
			return obj.getQuoteIdentification();
		}

		@Override
		public void setValue(Reference12 obj, Max35Text value) {
			obj.setQuoteIdentification(value);
		}
	};
	@XmlElement(name = "RefOrdrId", required = true)
	protected Max35Text referenceOrderIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Reference12 Reference12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RefOrdrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 1080, FIXSynonym: 1081</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceOrderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identifier of the order being hit or taken."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Reference12, Max35Text> mmReferenceOrderIdentification = new MMMessageAttribute<Reference12, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Reference12.mmObject();
			isDerived = false;
			xmlTag = "RefOrdrId";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "1080"), new FIXSynonym(this, "1081"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceOrderIdentification";
			definition = "Unique identifier of the order being hit or taken.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Reference12 obj) {
			return obj.getReferenceOrderIdentification();
		}

		@Override
		public void setValue(Reference12 obj, Max35Text value) {
			obj.setReferenceOrderIdentification(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Reference12.mmBidIdentification, com.tools20022.repository.msg.Reference12.mmClientBidIdentification,
						com.tools20022.repository.msg.Reference12.mmIOIIdentification, com.tools20022.repository.msg.Reference12.mmQuoteIdentification, com.tools20022.repository.msg.Reference12.mmReferenceOrderIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Reference12";
				definition = "Additional references linked to the list order.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getBidIdentification() {
		return bidIdentification == null ? Optional.empty() : Optional.of(bidIdentification);
	}

	public Reference12 setBidIdentification(Max35Text bidIdentification) {
		this.bidIdentification = bidIdentification;
		return this;
	}

	public Optional<Max35Text> getClientBidIdentification() {
		return clientBidIdentification == null ? Optional.empty() : Optional.of(clientBidIdentification);
	}

	public Reference12 setClientBidIdentification(Max35Text clientBidIdentification) {
		this.clientBidIdentification = clientBidIdentification;
		return this;
	}

	public Max35Text getIOIIdentification() {
		return iOIIdentification;
	}

	public Reference12 setIOIIdentification(Max35Text iOIIdentification) {
		this.iOIIdentification = Objects.requireNonNull(iOIIdentification);
		return this;
	}

	public Max35Text getQuoteIdentification() {
		return quoteIdentification;
	}

	public Reference12 setQuoteIdentification(Max35Text quoteIdentification) {
		this.quoteIdentification = Objects.requireNonNull(quoteIdentification);
		return this;
	}

	public Max35Text getReferenceOrderIdentification() {
		return referenceOrderIdentification;
	}

	public Reference12 setReferenceOrderIdentification(Max35Text referenceOrderIdentification) {
		this.referenceOrderIdentification = Objects.requireNonNull(referenceOrderIdentification);
		return this;
	}
}