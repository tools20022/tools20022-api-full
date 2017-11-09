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
import com.tools20022.repository.choice.Recipient2Choice;
import com.tools20022.repository.datatype.Max35Binary;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * <li>{@linkplain com.tools20022.repository.msg.AuthenticatedData2#mmVersion
 * AuthenticatedData2.mmVersion}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AuthenticatedData2#mmRecipient
 * AuthenticatedData2.mmRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AuthenticatedData2#mmMACAlgorithm
 * AuthenticatedData2.mmMACAlgorithm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AuthenticatedData2#mmEncapsulatedContent
 * AuthenticatedData2.mmEncapsulatedContent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AuthenticatedData2#mmMAC
 * AuthenticatedData2.mmMAC}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AuthenticatedData2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Message authentication code (MAC), computed on the data to protect with an encryption key."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AuthenticatedData3
 * AuthenticatedData3}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AuthenticatedData1
 * AuthenticatedData1}</li>
 * </ul>
 */
public class AuthenticatedData2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Number version;
	/**
	 * Version of the data structure.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData2
	 * AuthenticatedData2}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData3#mmVersion
	 * AuthenticatedData3.mmVersion}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVersion = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AuthenticatedData2.mmObject();
			isDerived = false;
			xmlTag = "Vrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Version";
			definition = "Version of the data structure.";
			nextVersions_lazy = () -> Arrays.asList(AuthenticatedData3.mmVersion);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected List<Recipient2Choice> recipient;
	/**
	 * Information related to the transport key.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Recipient2Choice
	 * Recipient2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData2
	 * AuthenticatedData2}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData3#mmRecipient
	 * AuthenticatedData3.mmRecipient}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRecipient = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AuthenticatedData2.mmObject();
			isDerived = false;
			xmlTag = "Rcpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Recipient";
			definition = "Information related to the transport key.";
			nextVersions_lazy = () -> Arrays.asList(AuthenticatedData3.mmRecipient);
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Recipient2Choice.mmObject();
		}
	};
	protected AlgorithmIdentification3 mACAlgorithm;
	/**
	 * Algorithm to compute message authentication code (MAC).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AlgorithmIdentification3
	 * AlgorithmIdentification3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData2
	 * AuthenticatedData2}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData3#mmMACAlgorithm
	 * AuthenticatedData3.mmMACAlgorithm}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMACAlgorithm = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AuthenticatedData2.mmObject();
			isDerived = false;
			xmlTag = "MACAlgo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MACAlgorithm";
			definition = "Algorithm to compute message authentication code (MAC).";
			nextVersions_lazy = () -> Arrays.asList(AuthenticatedData3.mmMACAlgorithm);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AlgorithmIdentification3.mmObject();
		}
	};
	protected EncapsulatedContent1 encapsulatedContent;
	/**
	 * Data to authenticate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.EncapsulatedContent1
	 * EncapsulatedContent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData2
	 * AuthenticatedData2}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData3#mmEncapsulatedContent
	 * AuthenticatedData3.mmEncapsulatedContent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEncapsulatedContent = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AuthenticatedData2.mmObject();
			isDerived = false;
			xmlTag = "NcpsltdCntt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EncapsulatedContent";
			definition = "Data to authenticate.";
			nextVersions_lazy = () -> Arrays.asList(AuthenticatedData3.mmEncapsulatedContent);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.EncapsulatedContent1.mmObject();
		}
	};
	protected Max35Binary mAC;
	/**
	 * Encrypted data which authenticates the data.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Binary
	 * Max35Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData2
	 * AuthenticatedData2}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.AuthenticatedData3#mmMAC
	 * AuthenticatedData3.mmMAC}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMAC = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AuthenticatedData2.mmObject();
			isDerived = false;
			xmlTag = "MAC";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MAC";
			definition = "Encrypted data which authenticates the data.";
			nextVersions_lazy = () -> Arrays.asList(AuthenticatedData3.mmMAC);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Binary.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AuthenticatedData2.mmVersion, AuthenticatedData2.mmRecipient, AuthenticatedData2.mmMACAlgorithm, AuthenticatedData2.mmEncapsulatedContent, AuthenticatedData2.mmMAC);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AuthenticatedData2";
				definition = "Message authentication code (MAC), computed on the data to protect with an encryption key.";
				nextVersions_lazy = () -> Arrays.asList(AuthenticatedData3.mmObject());
				previousVersion_lazy = () -> AuthenticatedData1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Number getVersion() {
		return version;
	}

	public void setVersion(Number version) {
		this.version = version;
	}

	public List<Recipient2Choice> getRecipient() {
		return recipient;
	}

	public void setRecipient(List<Recipient2Choice> recipient) {
		this.recipient = recipient;
	}

	public AlgorithmIdentification3 getMACAlgorithm() {
		return mACAlgorithm;
	}

	public void setMACAlgorithm(com.tools20022.repository.msg.AlgorithmIdentification3 mACAlgorithm) {
		this.mACAlgorithm = mACAlgorithm;
	}

	public EncapsulatedContent1 getEncapsulatedContent() {
		return encapsulatedContent;
	}

	public void setEncapsulatedContent(com.tools20022.repository.msg.EncapsulatedContent1 encapsulatedContent) {
		this.encapsulatedContent = encapsulatedContent;
	}

	public Max35Binary getMAC() {
		return mAC;
	}

	public void setMAC(Max35Binary mAC) {
		this.mAC = mAC;
	}
}