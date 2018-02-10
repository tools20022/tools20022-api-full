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
import com.tools20022.repository.choice.Recipient6Choice;
import com.tools20022.repository.datatype.Max140Binary;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Message authentication code (MAC), computed on the data to protect with an
 * encryption key.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AuthenticatedData5#mmVersion
 * AuthenticatedData5.mmVersion}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AuthenticatedData5#mmRecipient
 * AuthenticatedData5.mmRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AuthenticatedData5#mmMACAlgorithm
 * AuthenticatedData5.mmMACAlgorithm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AuthenticatedData5#mmEncapsulatedContent
 * AuthenticatedData5.mmEncapsulatedContent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AuthenticatedData5#mmMAC
 * AuthenticatedData5.mmMAC}</li>
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
 * "AuthenticatedData5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Message authentication code (MAC), computed on the data to protect with an encryption key."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AuthenticatedData4
 * AuthenticatedData4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AuthenticatedData5", propOrder = {"version", "recipient", "mACAlgorithm", "encapsulatedContent", "mAC"})
public class AuthenticatedData5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Vrsn")
	protected Number version;
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData5
	 * AuthenticatedData5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Vrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Version"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Version of the data structure."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData4#mmVersion
	 * AuthenticatedData4.mmVersion}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVersion = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AuthenticatedData5.mmObject();
			isDerived = false;
			xmlTag = "Vrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Version";
			definition = "Version of the data structure.";
			previousVersion_lazy = () -> AuthenticatedData4.mmVersion;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "Rcpt", required = true)
	protected List<Recipient6Choice> recipient;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Recipient6Choice
	 * Recipient6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData5
	 * AuthenticatedData5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rcpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Recipient"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Session key or protection key identification used by the recipient."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData4#mmRecipient
	 * AuthenticatedData4.mmRecipient}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRecipient = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AuthenticatedData5.mmObject();
			isDerived = false;
			xmlTag = "Rcpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Recipient";
			definition = "Session key or protection key identification used by the recipient.";
			previousVersion_lazy = () -> AuthenticatedData4.mmRecipient;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Recipient6Choice.mmObject();
		}
	};
	@XmlElement(name = "MACAlgo", required = true)
	protected AlgorithmIdentification22 mACAlgorithm;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AlgorithmIdentification22
	 * AlgorithmIdentification22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData5
	 * AuthenticatedData5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MACAlgo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MACAlgorithm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Algorithm to compute message authentication code (MAC)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData4#mmMACAlgorithm
	 * AuthenticatedData4.mmMACAlgorithm}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMACAlgorithm = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AuthenticatedData5.mmObject();
			isDerived = false;
			xmlTag = "MACAlgo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MACAlgorithm";
			definition = "Algorithm to compute message authentication code (MAC).";
			previousVersion_lazy = () -> AuthenticatedData4.mmMACAlgorithm;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AlgorithmIdentification22.mmObject();
		}
	};
	@XmlElement(name = "NcpsltdCntt", required = true)
	protected EncapsulatedContent3 encapsulatedContent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.EncapsulatedContent3
	 * EncapsulatedContent3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData5
	 * AuthenticatedData5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NcpsltdCntt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EncapsulatedContent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data to authenticate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData4#mmEncapsulatedContent
	 * AuthenticatedData4.mmEncapsulatedContent}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEncapsulatedContent = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AuthenticatedData5.mmObject();
			isDerived = false;
			xmlTag = "NcpsltdCntt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EncapsulatedContent";
			definition = "Data to authenticate.";
			previousVersion_lazy = () -> AuthenticatedData4.mmEncapsulatedContent;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.EncapsulatedContent3.mmObject();
		}
	};
	@XmlElement(name = "MAC", required = true)
	protected Max140Binary mAC;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max140Binary Max140Binary}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData5
	 * AuthenticatedData5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Message authentication code value."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData4#mmMAC
	 * AuthenticatedData4.mmMAC}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMAC = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AuthenticatedData5.mmObject();
			isDerived = false;
			xmlTag = "MAC";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MAC";
			definition = "Message authentication code value.";
			previousVersion_lazy = () -> AuthenticatedData4.mmMAC;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Binary.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AuthenticatedData5.mmVersion, com.tools20022.repository.msg.AuthenticatedData5.mmRecipient,
						com.tools20022.repository.msg.AuthenticatedData5.mmMACAlgorithm, com.tools20022.repository.msg.AuthenticatedData5.mmEncapsulatedContent, com.tools20022.repository.msg.AuthenticatedData5.mmMAC);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "AuthenticatedData5";
				definition = "Message authentication code (MAC), computed on the data to protect with an encryption key.";
				previousVersion_lazy = () -> AuthenticatedData4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Number> getVersion() {
		return version == null ? Optional.empty() : Optional.of(version);
	}

	public AuthenticatedData5 setVersion(Number version) {
		this.version = version;
		return this;
	}

	public List<Recipient6Choice> getRecipient() {
		return recipient == null ? recipient = new ArrayList<>() : recipient;
	}

	public AuthenticatedData5 setRecipient(List<Recipient6Choice> recipient) {
		this.recipient = Objects.requireNonNull(recipient);
		return this;
	}

	public AlgorithmIdentification22 getMACAlgorithm() {
		return mACAlgorithm;
	}

	public AuthenticatedData5 setMACAlgorithm(com.tools20022.repository.msg.AlgorithmIdentification22 mACAlgorithm) {
		this.mACAlgorithm = Objects.requireNonNull(mACAlgorithm);
		return this;
	}

	public EncapsulatedContent3 getEncapsulatedContent() {
		return encapsulatedContent;
	}

	public AuthenticatedData5 setEncapsulatedContent(com.tools20022.repository.msg.EncapsulatedContent3 encapsulatedContent) {
		this.encapsulatedContent = Objects.requireNonNull(encapsulatedContent);
		return this;
	}

	public Max140Binary getMAC() {
		return mAC;
	}

	public AuthenticatedData5 setMAC(Max140Binary mAC) {
		this.mAC = Objects.requireNonNull(mAC);
		return this;
	}
}