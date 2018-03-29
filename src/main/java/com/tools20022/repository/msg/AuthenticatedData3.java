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
import com.tools20022.repository.choice.Recipient3Choice;
import com.tools20022.repository.datatype.Max35Binary;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AlgorithmIdentification10;
import com.tools20022.repository.msg.EncapsulatedContent2;
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
 * <li>{@linkplain com.tools20022.repository.msg.AuthenticatedData3#mmVersion
 * AuthenticatedData3.mmVersion}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AuthenticatedData3#mmRecipient
 * AuthenticatedData3.mmRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AuthenticatedData3#mmMACAlgorithm
 * AuthenticatedData3.mmMACAlgorithm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AuthenticatedData3#mmEncapsulatedContent
 * AuthenticatedData3.mmEncapsulatedContent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AuthenticatedData3#mmMAC
 * AuthenticatedData3.mmMAC}</li>
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
 * "AuthenticatedData3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Message authentication code (MAC), computed on the data to protect with an encryption key."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AuthenticatedData4
 * AuthenticatedData4}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AuthenticatedData2
 * AuthenticatedData2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AuthenticatedData3", propOrder = {"version", "recipient", "mACAlgorithm", "encapsulatedContent", "mAC"})
public class AuthenticatedData3 {

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
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData3
	 * AuthenticatedData3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData4#mmVersion
	 * AuthenticatedData4.mmVersion}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData2#mmVersion
	 * AuthenticatedData2.mmVersion}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AuthenticatedData3, Optional<Number>> mmVersion = new MMMessageAttribute<AuthenticatedData3, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AuthenticatedData3.mmObject();
			isDerived = false;
			xmlTag = "Vrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Version";
			definition = "Version of the data structure.";
			nextVersions_lazy = () -> Arrays.asList(AuthenticatedData4.mmVersion);
			previousVersion_lazy = () -> AuthenticatedData2.mmVersion;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(AuthenticatedData3 obj) {
			return obj.getVersion();
		}

		@Override
		public void setValue(AuthenticatedData3 obj, Optional<Number> value) {
			obj.setVersion(value.orElse(null));
		}
	};
	@XmlElement(name = "Rcpt", required = true)
	protected List<Recipient3Choice> recipient;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Recipient3Choice
	 * Recipient3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData3
	 * AuthenticatedData3}</li>
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
	 * definition} = "Information related to the transport key."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData4#mmRecipient
	 * AuthenticatedData4.mmRecipient}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData2#mmRecipient
	 * AuthenticatedData2.mmRecipient}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AuthenticatedData3, List<Recipient3Choice>> mmRecipient = new MMMessageAssociationEnd<AuthenticatedData3, List<Recipient3Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AuthenticatedData3.mmObject();
			isDerived = false;
			xmlTag = "Rcpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Recipient";
			definition = "Information related to the transport key.";
			nextVersions_lazy = () -> Arrays.asList(AuthenticatedData4.mmRecipient);
			previousVersion_lazy = () -> AuthenticatedData2.mmRecipient;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Recipient3Choice.mmObject();
		}

		@Override
		public List<Recipient3Choice> getValue(AuthenticatedData3 obj) {
			return obj.getRecipient();
		}

		@Override
		public void setValue(AuthenticatedData3 obj, List<Recipient3Choice> value) {
			obj.setRecipient(value);
		}
	};
	@XmlElement(name = "MACAlgo", required = true)
	protected AlgorithmIdentification10 mACAlgorithm;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AlgorithmIdentification10
	 * AlgorithmIdentification10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData3
	 * AuthenticatedData3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData4#mmMACAlgorithm
	 * AuthenticatedData4.mmMACAlgorithm}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData2#mmMACAlgorithm
	 * AuthenticatedData2.mmMACAlgorithm}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AuthenticatedData3, AlgorithmIdentification10> mmMACAlgorithm = new MMMessageAssociationEnd<AuthenticatedData3, AlgorithmIdentification10>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AuthenticatedData3.mmObject();
			isDerived = false;
			xmlTag = "MACAlgo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MACAlgorithm";
			definition = "Algorithm to compute message authentication code (MAC).";
			nextVersions_lazy = () -> Arrays.asList(AuthenticatedData4.mmMACAlgorithm);
			previousVersion_lazy = () -> AuthenticatedData2.mmMACAlgorithm;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AlgorithmIdentification10.mmObject();
		}

		@Override
		public AlgorithmIdentification10 getValue(AuthenticatedData3 obj) {
			return obj.getMACAlgorithm();
		}

		@Override
		public void setValue(AuthenticatedData3 obj, AlgorithmIdentification10 value) {
			obj.setMACAlgorithm(value);
		}
	};
	@XmlElement(name = "NcpsltdCntt", required = true)
	protected EncapsulatedContent2 encapsulatedContent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.EncapsulatedContent2
	 * EncapsulatedContent2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData3
	 * AuthenticatedData3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData4#mmEncapsulatedContent
	 * AuthenticatedData4.mmEncapsulatedContent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData2#mmEncapsulatedContent
	 * AuthenticatedData2.mmEncapsulatedContent}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AuthenticatedData3, EncapsulatedContent2> mmEncapsulatedContent = new MMMessageAssociationEnd<AuthenticatedData3, EncapsulatedContent2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AuthenticatedData3.mmObject();
			isDerived = false;
			xmlTag = "NcpsltdCntt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EncapsulatedContent";
			definition = "Data to authenticate.";
			nextVersions_lazy = () -> Arrays.asList(AuthenticatedData4.mmEncapsulatedContent);
			previousVersion_lazy = () -> AuthenticatedData2.mmEncapsulatedContent;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> EncapsulatedContent2.mmObject();
		}

		@Override
		public EncapsulatedContent2 getValue(AuthenticatedData3 obj) {
			return obj.getEncapsulatedContent();
		}

		@Override
		public void setValue(AuthenticatedData3 obj, EncapsulatedContent2 value) {
			obj.setEncapsulatedContent(value);
		}
	};
	@XmlElement(name = "MAC", required = true)
	protected Max35Binary mAC;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Binary
	 * Max35Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData3
	 * AuthenticatedData3}</li>
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
	 * definition} = "Encrypted data which authenticates the data."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.AuthenticatedData4#mmMAC
	 * AuthenticatedData4.mmMAC}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData2#mmMAC
	 * AuthenticatedData2.mmMAC}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AuthenticatedData3, Max35Binary> mmMAC = new MMMessageAttribute<AuthenticatedData3, Max35Binary>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AuthenticatedData3.mmObject();
			isDerived = false;
			xmlTag = "MAC";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MAC";
			definition = "Encrypted data which authenticates the data.";
			nextVersions_lazy = () -> Arrays.asList(AuthenticatedData4.mmMAC);
			previousVersion_lazy = () -> AuthenticatedData2.mmMAC;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Binary.mmObject();
		}

		@Override
		public Max35Binary getValue(AuthenticatedData3 obj) {
			return obj.getMAC();
		}

		@Override
		public void setValue(AuthenticatedData3 obj, Max35Binary value) {
			obj.setMAC(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AuthenticatedData3.mmVersion, com.tools20022.repository.msg.AuthenticatedData3.mmRecipient,
						com.tools20022.repository.msg.AuthenticatedData3.mmMACAlgorithm, com.tools20022.repository.msg.AuthenticatedData3.mmEncapsulatedContent, com.tools20022.repository.msg.AuthenticatedData3.mmMAC);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AuthenticatedData3";
				definition = "Message authentication code (MAC), computed on the data to protect with an encryption key.";
				nextVersions_lazy = () -> Arrays.asList(AuthenticatedData4.mmObject());
				previousVersion_lazy = () -> AuthenticatedData2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Number> getVersion() {
		return version == null ? Optional.empty() : Optional.of(version);
	}

	public AuthenticatedData3 setVersion(Number version) {
		this.version = version;
		return this;
	}

	public List<Recipient3Choice> getRecipient() {
		return recipient == null ? recipient = new ArrayList<>() : recipient;
	}

	public AuthenticatedData3 setRecipient(List<Recipient3Choice> recipient) {
		this.recipient = Objects.requireNonNull(recipient);
		return this;
	}

	public AlgorithmIdentification10 getMACAlgorithm() {
		return mACAlgorithm;
	}

	public AuthenticatedData3 setMACAlgorithm(AlgorithmIdentification10 mACAlgorithm) {
		this.mACAlgorithm = Objects.requireNonNull(mACAlgorithm);
		return this;
	}

	public EncapsulatedContent2 getEncapsulatedContent() {
		return encapsulatedContent;
	}

	public AuthenticatedData3 setEncapsulatedContent(EncapsulatedContent2 encapsulatedContent) {
		this.encapsulatedContent = Objects.requireNonNull(encapsulatedContent);
		return this;
	}

	public Max35Binary getMAC() {
		return mAC;
	}

	public AuthenticatedData3 setMAC(Max35Binary mAC) {
		this.mAC = Objects.requireNonNull(mAC);
		return this;
	}
}