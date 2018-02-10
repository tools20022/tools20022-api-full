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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.pain.MandateCancellationRequestV01;
import com.tools20022.repository.choice.OriginalMandate1Choice;
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
 * Identifies the mandate to be cancelled.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateCancellation1#mmOriginalMessageInformation
 * MandateCancellation1.mmOriginalMessageInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateCancellation1#mmCancellationReason
 * MandateCancellation1.mmCancellationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateCancellation1#mmOriginalMandate
 * MandateCancellation1.mmOriginalMandate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateCancellationRequestV01#mmUnderlyingCancellationDetails
 * MandateCancellationRequestV01.mmUnderlyingCancellationDetails}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MandateCancellation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the mandate to be cancelled."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MandateCancellation1", propOrder = {"originalMessageInformation", "cancellationReason", "originalMandate"})
public class MandateCancellation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OrgnlMsgInf")
	protected OriginalMessageInformation1 originalMessageInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.OriginalMessageInformation1
	 * OriginalMessageInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateCancellation1
	 * MandateCancellation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlMsgInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalMessageInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide information on the original messsage."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalMessageInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateCancellation1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMsgInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMessageInformation";
			definition = "Set of elements used to provide information on the original messsage.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OriginalMessageInformation1.mmObject();
		}
	};
	@XmlElement(name = "CxlRsn", required = true)
	protected CancellationReasonInformation2 cancellationReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CancellationReasonInformation2
	 * CancellationReasonInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateCancellation1
	 * MandateCancellation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide detailed information on the cancellation reason."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCancellationReason = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateCancellation1.mmObject();
			isDerived = false;
			xmlTag = "CxlRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationReason";
			definition = "Set of elements used to provide detailed information on the cancellation reason.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CancellationReasonInformation2.mmObject();
		}
	};
	@XmlElement(name = "OrgnlMndt", required = true)
	protected OriginalMandate1Choice originalMandate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.OriginalMandate1Choice
	 * OriginalMandate1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateCancellation1
	 * MandateCancellation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlMndt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalMandate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide the original mandate data."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalMandate = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateCancellation1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMndt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMandate";
			definition = "Set of elements used to provide the original mandate data.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> OriginalMandate1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateCancellation1.mmOriginalMessageInformation, com.tools20022.repository.msg.MandateCancellation1.mmCancellationReason,
						com.tools20022.repository.msg.MandateCancellation1.mmOriginalMandate);
				messageBuildingBlock_lazy = () -> Arrays.asList(MandateCancellationRequestV01.mmUnderlyingCancellationDetails);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MandateCancellation1";
				definition = "Identifies the mandate to be cancelled.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<OriginalMessageInformation1> getOriginalMessageInformation() {
		return originalMessageInformation == null ? Optional.empty() : Optional.of(originalMessageInformation);
	}

	public MandateCancellation1 setOriginalMessageInformation(com.tools20022.repository.msg.OriginalMessageInformation1 originalMessageInformation) {
		this.originalMessageInformation = originalMessageInformation;
		return this;
	}

	public CancellationReasonInformation2 getCancellationReason() {
		return cancellationReason;
	}

	public MandateCancellation1 setCancellationReason(com.tools20022.repository.msg.CancellationReasonInformation2 cancellationReason) {
		this.cancellationReason = Objects.requireNonNull(cancellationReason);
		return this;
	}

	public OriginalMandate1Choice getOriginalMandate() {
		return originalMandate;
	}

	public MandateCancellation1 setOriginalMandate(OriginalMandate1Choice originalMandate) {
		this.originalMandate = Objects.requireNonNull(originalMandate);
		return this;
	}
}