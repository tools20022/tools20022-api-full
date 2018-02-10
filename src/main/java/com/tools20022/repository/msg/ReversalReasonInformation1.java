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
import com.tools20022.repository.choice.ReversalReason1Choice;
import com.tools20022.repository.datatype.Max105Text;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.PaymentStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Further information on the reversal reason of the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReversalReasonInformation1#mmReversalOriginator
 * ReversalReasonInformation1.mmReversalOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReversalReasonInformation1#mmReversalReason
 * ReversalReasonInformation1.mmReversalReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReversalReasonInformation1#mmAdditionalReversalReasonInformation
 * ReversalReasonInformation1.mmAdditionalReversalReasonInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentStatus
 * PaymentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReversalReasonInformation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Further information on the reversal reason of the transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ReversalReasonInformation1", propOrder = {"reversalOriginator", "reversalReason", "additionalReversalReasonInformation"})
public class ReversalReasonInformation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RvslOrgtr")
	protected PartyIdentification8 reversalOriginator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification8
	 * PartyIdentification8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReversalReasonInformation1
	 * ReversalReasonInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RvslOrgtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalOriginator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party issuing the reversal."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReversalOriginator = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReversalReasonInformation1.mmObject();
			isDerived = false;
			xmlTag = "RvslOrgtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalOriginator";
			definition = "Party issuing the reversal.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification8.mmObject();
		}
	};
	@XmlElement(name = "RvslRsn")
	protected ReversalReason1Choice reversalReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ReversalReason1Choice
	 * ReversalReason1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus PaymentStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReversalReasonInformation1
	 * ReversalReasonInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RvslRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reason for the reversal."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReversalReason = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PaymentStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ReversalReasonInformation1.mmObject();
			isDerived = false;
			xmlTag = "RvslRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalReason";
			definition = "Specifies the reason for the reversal.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ReversalReason1Choice.mmObject();
		}
	};
	@XmlElement(name = "AddtlRvslRsnInf")
	protected List<Max105Text> additionalReversalReasonInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max105Text
	 * Max105Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReversalReasonInformation1
	 * ReversalReasonInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlRvslRsnInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReversalReasonInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Further details on the reversal reason."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalReversalReasonInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReversalReasonInformation1.mmObject();
			isDerived = false;
			xmlTag = "AddtlRvslRsnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReversalReasonInformation";
			definition = "Further details on the reversal reason.";
			minOccurs = 0;
			simpleType_lazy = () -> Max105Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReversalReasonInformation1.mmReversalOriginator, com.tools20022.repository.msg.ReversalReasonInformation1.mmReversalReason,
						com.tools20022.repository.msg.ReversalReasonInformation1.mmAdditionalReversalReasonInformation);
				trace_lazy = () -> PaymentStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReversalReasonInformation1";
				definition = "Further information on the reversal reason of the transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PartyIdentification8> getReversalOriginator() {
		return reversalOriginator == null ? Optional.empty() : Optional.of(reversalOriginator);
	}

	public ReversalReasonInformation1 setReversalOriginator(com.tools20022.repository.msg.PartyIdentification8 reversalOriginator) {
		this.reversalOriginator = reversalOriginator;
		return this;
	}

	public Optional<ReversalReason1Choice> getReversalReason() {
		return reversalReason == null ? Optional.empty() : Optional.of(reversalReason);
	}

	public ReversalReasonInformation1 setReversalReason(ReversalReason1Choice reversalReason) {
		this.reversalReason = reversalReason;
		return this;
	}

	public List<Max105Text> getAdditionalReversalReasonInformation() {
		return additionalReversalReasonInformation == null ? additionalReversalReasonInformation = new ArrayList<>() : additionalReversalReasonInformation;
	}

	public ReversalReasonInformation1 setAdditionalReversalReasonInformation(List<Max105Text> additionalReversalReasonInformation) {
		this.additionalReversalReasonInformation = Objects.requireNonNull(additionalReversalReasonInformation);
		return this;
	}
}