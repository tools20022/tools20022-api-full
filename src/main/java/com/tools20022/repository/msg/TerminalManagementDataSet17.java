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
import com.tools20022.repository.datatype.Max140Binary;
import com.tools20022.repository.datatype.Max5000Binary;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identification of requested data set.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet17#mmIdentification
 * TerminalManagementDataSet17.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet17#mmPOIChallenge
 * TerminalManagementDataSet17.mmPOIChallenge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet17#mmTMChallenge
 * TerminalManagementDataSet17.mmTMChallenge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet17#mmSessionKey
 * TerminalManagementDataSet17.mmSessionKey}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet17#mmDelegationProof
 * TerminalManagementDataSet17.mmDelegationProof}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet17#mmProtectedDelegationProof
 * TerminalManagementDataSet17.mmProtectedDelegationProof}</li>
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
 * "TerminalManagementDataSet17"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identification of requested data set."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet12
 * TerminalManagementDataSet12}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "TerminalManagementDataSet17", propOrder = {"identification", "POIChallenge", "TMChallenge", "sessionKey", "delegationProof", "protectedDelegationProof"})
public class TerminalManagementDataSet17 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected DataSetIdentification6 identification;
	/**
	 * Identification of the required data set.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DataSetIdentification6
	 * DataSetIdentification6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet17
	 * TerminalManagementDataSet17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the required data set."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet12#mmIdentification
	 * TerminalManagementDataSet12.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TerminalManagementDataSet17.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the required data set.";
			previousVersion_lazy = () -> TerminalManagementDataSet12.mmIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.DataSetIdentification6.mmObject();
		}
	};
	protected Max140Binary pOIChallenge;
	/**
	 * Point of interaction challenge for cryptographic key injection.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet17
	 * TerminalManagementDataSet17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "POIChllng"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "POIChallenge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Point of interaction challenge for cryptographic key injection."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet12#mmPOIChallenge
	 * TerminalManagementDataSet12.mmPOIChallenge}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPOIChallenge = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TerminalManagementDataSet17.mmObject();
			isDerived = false;
			xmlTag = "POIChllng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POIChallenge";
			definition = "Point of interaction challenge for cryptographic key injection.";
			previousVersion_lazy = () -> TerminalManagementDataSet12.mmPOIChallenge;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Binary.mmObject();
		}
	};
	protected Max140Binary tMChallenge;
	/**
	 * Terminal manager challenge for cryptographic key injection.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet17
	 * TerminalManagementDataSet17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TMChllng"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TMChallenge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Terminal manager challenge for cryptographic key injection."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet12#mmTMChallenge
	 * TerminalManagementDataSet12.mmTMChallenge}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTMChallenge = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TerminalManagementDataSet17.mmObject();
			isDerived = false;
			xmlTag = "TMChllng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMChallenge";
			definition = "Terminal manager challenge for cryptographic key injection.";
			previousVersion_lazy = () -> TerminalManagementDataSet12.mmTMChallenge;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Binary.mmObject();
		}
	};
	protected CryptographicKey5 sessionKey;
	/**
	 * Temporary encryption key that the host will use for protecting keys to
	 * download.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CryptographicKey5
	 * CryptographicKey5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet17
	 * TerminalManagementDataSet17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SsnKey"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SessionKey"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Temporary encryption key that the host will use for protecting keys to download."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet12#mmSessionKey
	 * TerminalManagementDataSet12.mmSessionKey}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSessionKey = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TerminalManagementDataSet17.mmObject();
			isDerived = false;
			xmlTag = "SsnKey";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SessionKey";
			definition = "Temporary encryption key that the host will use for protecting keys to download.";
			previousVersion_lazy = () -> TerminalManagementDataSet12.mmSessionKey;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CryptographicKey5.mmObject();
		}
	};
	protected Max5000Binary delegationProof;
	/**
	 * Proof of delegation to be validated by the terminal manager receiving a
	 * status report from a new POI.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max5000Binary
	 * Max5000Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet17
	 * TerminalManagementDataSet17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlgtnProof"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DelegationProof"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Proof of delegation to be validated by the terminal manager receiving a status report from a new POI."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDelegationProof = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TerminalManagementDataSet17.mmObject();
			isDerived = false;
			xmlTag = "DlgtnProof";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelegationProof";
			definition = "Proof of delegation to be validated by the terminal manager receiving a status report from a new POI.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max5000Binary.mmObject();
		}
	};
	protected ContentInformationType12 protectedDelegationProof;
	/**
	 * Protected proof of delegation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType12
	 * ContentInformationType12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet17
	 * TerminalManagementDataSet17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctdDlgtnProof"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectedDelegationProof"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Protected proof of delegation."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProtectedDelegationProof = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TerminalManagementDataSet17.mmObject();
			isDerived = false;
			xmlTag = "PrtctdDlgtnProof";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedDelegationProof";
			definition = "Protected proof of delegation.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ContentInformationType12.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(TerminalManagementDataSet17.mmIdentification, TerminalManagementDataSet17.mmPOIChallenge, TerminalManagementDataSet17.mmTMChallenge, TerminalManagementDataSet17.mmSessionKey,
						TerminalManagementDataSet17.mmDelegationProof, TerminalManagementDataSet17.mmProtectedDelegationProof);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TerminalManagementDataSet17";
				definition = "Identification of requested data set.";
				previousVersion_lazy = () -> TerminalManagementDataSet12.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Id", required = true)
	public DataSetIdentification6 getIdentification() {
		return identification;
	}

	public void setIdentification(com.tools20022.repository.msg.DataSetIdentification6 identification) {
		this.identification = identification;
	}

	@XmlElement(name = "POIChllng")
	public Max140Binary getPOIChallenge() {
		return pOIChallenge;
	}

	public void setPOIChallenge(Max140Binary pOIChallenge) {
		this.pOIChallenge = pOIChallenge;
	}

	@XmlElement(name = "TMChllng")
	public Max140Binary getTMChallenge() {
		return tMChallenge;
	}

	public void setTMChallenge(Max140Binary tMChallenge) {
		this.tMChallenge = tMChallenge;
	}

	@XmlElement(name = "SsnKey")
	public CryptographicKey5 getSessionKey() {
		return sessionKey;
	}

	public void setSessionKey(com.tools20022.repository.msg.CryptographicKey5 sessionKey) {
		this.sessionKey = sessionKey;
	}

	@XmlElement(name = "DlgtnProof")
	public Max5000Binary getDelegationProof() {
		return delegationProof;
	}

	public void setDelegationProof(Max5000Binary delegationProof) {
		this.delegationProof = delegationProof;
	}

	@XmlElement(name = "PrtctdDlgtnProof")
	public ContentInformationType12 getProtectedDelegationProof() {
		return protectedDelegationProof;
	}

	public void setProtectedDelegationProof(com.tools20022.repository.msg.ContentInformationType12 protectedDelegationProof) {
		this.protectedDelegationProof = protectedDelegationProof;
	}
}