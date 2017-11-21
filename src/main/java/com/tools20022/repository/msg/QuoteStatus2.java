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
import com.tools20022.repository.codeset.QuoteStatus1Code;
import com.tools20022.repository.codeset.RejectionReason3Code;
import com.tools20022.repository.entity.Organisation;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identifies the status of a quote and if required, the rejection reason, and
 * the parties and the details of the quote.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteStatus2#mmQuoteStatus
 * QuoteStatus2.mmQuoteStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteStatus2#mmRejectionReason
 * QuoteStatus2.mmRejectionReason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteStatus2#mmQuoteSetDetails
 * QuoteStatus2.mmQuoteSetDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteStatus2#mmRelatedParties
 * QuoteStatus2.mmRelatedParties}</li>
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
 * "QuoteStatus2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the status of a quote and if required, the rejection reason, and the parties and the details of the quote."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "QuoteStatus2", propOrder = {"quoteStatus", "rejectionReason", "quoteSetDetails", "relatedParties"})
public class QuoteStatus2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected QuoteStatus1Code quoteStatus;
	/**
	 * Provides information related to the status of a quote.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteStatus1Code
	 * QuoteStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuoteStatus2 QuoteStatus2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuoteStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information related to the status of a quote."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQuoteStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> QuoteStatus2.mmObject();
			isDerived = false;
			xmlTag = "QtSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuoteStatus";
			definition = "Provides information related to the status of a quote.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> QuoteStatus1Code.mmObject();
		}
	};
	protected RejectionReason3Code rejectionReason;
	/**
	 * Provides information related to the rejection of the quote.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason3Code
	 * RejectionReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuoteStatus2 QuoteStatus2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctnRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information related to the rejection of the quote."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRejectionReason = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> QuoteStatus2.mmObject();
			isDerived = false;
			xmlTag = "RjctnRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectionReason";
			definition = "Provides information related to the rejection of the quote.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RejectionReason3Code.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.QuoteSet2> quoteSetDetails;
	/**
	 * Provides details about a group of related quotes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.QuoteSet2 QuoteSet2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuoteStatus2 QuoteStatus2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtSetDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuoteSetDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details about a group of related quotes."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmQuoteSetDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> QuoteStatus2.mmObject();
			isDerived = false;
			xmlTag = "QtSetDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuoteSetDetails";
			definition = "Provides details about a group of related quotes.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.QuoteSet2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Intermediary14> relatedParties;
	/**
	 * Parties used for acting parties that applies either to the whole message
	 * or to individual sides.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Intermediary14
	 * Intermediary14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuoteStatus2 QuoteStatus2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parties used for acting parties that applies either to the whole message or to individual sides."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRelatedParties = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Organisation.mmObject();
			componentContext_lazy = () -> QuoteStatus2.mmObject();
			isDerived = false;
			xmlTag = "RltdPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedParties";
			definition = "Parties used for acting parties that applies either to the whole message or to individual sides.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Intermediary14.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(QuoteStatus2.mmQuoteStatus, QuoteStatus2.mmRejectionReason, QuoteStatus2.mmQuoteSetDetails, QuoteStatus2.mmRelatedParties);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "QuoteStatus2";
				definition = "Identifies the status of a quote and if required, the rejection reason, and the parties and the details of the quote.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "QtSts", required = true)
	public QuoteStatus1Code getQuoteStatus() {
		return quoteStatus;
	}

	public void setQuoteStatus(QuoteStatus1Code quoteStatus) {
		this.quoteStatus = quoteStatus;
	}

	@XmlElement(name = "RjctnRsn")
	public RejectionReason3Code getRejectionReason() {
		return rejectionReason;
	}

	public void setRejectionReason(RejectionReason3Code rejectionReason) {
		this.rejectionReason = rejectionReason;
	}

	@XmlElement(name = "QtSetDtls")
	public List<QuoteSet2> getQuoteSetDetails() {
		return quoteSetDetails;
	}

	public void setQuoteSetDetails(List<com.tools20022.repository.msg.QuoteSet2> quoteSetDetails) {
		this.quoteSetDetails = quoteSetDetails;
	}

	@XmlElement(name = "RltdPties")
	public List<Intermediary14> getRelatedParties() {
		return relatedParties;
	}

	public void setRelatedParties(List<com.tools20022.repository.msg.Intermediary14> relatedParties) {
		this.relatedParties = relatedParties;
	}
}