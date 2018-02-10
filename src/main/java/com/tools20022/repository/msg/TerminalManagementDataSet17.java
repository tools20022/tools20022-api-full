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
import java.util.Objects;
import java.util.Optional;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TerminalManagementDataSet17"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identification of requested data set."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TerminalManagementDataSet25
 * TerminalManagementDataSet25}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet12
 * TerminalManagementDataSet12}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TerminalManagementDataSet17", propOrder = {"identification", "pOIChallenge", "tMChallenge", "sessionKey", "delegationProof", "protectedDelegationProof"})
public class TerminalManagementDataSet17 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected DataSetIdentification6 identification;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet25#mmIdentification
	 * TerminalManagementDataSet25.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet12#mmIdentification
	 * TerminalManagementDataSet12.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TerminalManagementDataSet17.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the required data set.";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementDataSet25.mmIdentification);
			previousVersion_lazy = () -> TerminalManagementDataSet12.mmIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.DataSetIdentification6.mmObject();
		}
	};
	@XmlElement(name = "POIChllng")
	protected Max140Binary pOIChallenge;
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet25#mmPOIChallenge
	 * TerminalManagementDataSet25.mmPOIChallenge}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet12#mmPOIChallenge
	 * TerminalManagementDataSet12.mmPOIChallenge}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPOIChallenge = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TerminalManagementDataSet17.mmObject();
			isDerived = false;
			xmlTag = "POIChllng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POIChallenge";
			definition = "Point of interaction challenge for cryptographic key injection.";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementDataSet25.mmPOIChallenge);
			previousVersion_lazy = () -> TerminalManagementDataSet12.mmPOIChallenge;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Binary.mmObject();
		}
	};
	@XmlElement(name = "TMChllng")
	protected Max140Binary tMChallenge;
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet25#mmTMChallenge
	 * TerminalManagementDataSet25.mmTMChallenge}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet12#mmTMChallenge
	 * TerminalManagementDataSet12.mmTMChallenge}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTMChallenge = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TerminalManagementDataSet17.mmObject();
			isDerived = false;
			xmlTag = "TMChllng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMChallenge";
			definition = "Terminal manager challenge for cryptographic key injection.";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementDataSet25.mmTMChallenge);
			previousVersion_lazy = () -> TerminalManagementDataSet12.mmTMChallenge;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Binary.mmObject();
		}
	};
	@XmlElement(name = "SsnKey")
	protected CryptographicKey5 sessionKey;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet25#mmSessionKey
	 * TerminalManagementDataSet25.mmSessionKey}</li>
	 * </ul>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.TerminalManagementDataSet17.mmObject();
			isDerived = false;
			xmlTag = "SsnKey";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SessionKey";
			definition = "Temporary encryption key that the host will use for protecting keys to download.";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementDataSet25.mmSessionKey);
			previousVersion_lazy = () -> TerminalManagementDataSet12.mmSessionKey;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CryptographicKey5.mmObject();
		}
	};
	@XmlElement(name = "DlgtnProof")
	protected Max5000Binary delegationProof;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet25#mmDelegationProof
	 * TerminalManagementDataSet25.mmDelegationProof}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDelegationProof = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TerminalManagementDataSet17.mmObject();
			isDerived = false;
			xmlTag = "DlgtnProof";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelegationProof";
			definition = "Proof of delegation to be validated by the terminal manager receiving a status report from a new POI.";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementDataSet25.mmDelegationProof);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max5000Binary.mmObject();
		}
	};
	@XmlElement(name = "PrtctdDlgtnProof")
	protected ContentInformationType12 protectedDelegationProof;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet25#mmProtectedDelegationProof
	 * TerminalManagementDataSet25.mmProtectedDelegationProof}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProtectedDelegationProof = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TerminalManagementDataSet17.mmObject();
			isDerived = false;
			xmlTag = "PrtctdDlgtnProof";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedDelegationProof";
			definition = "Protected proof of delegation.";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementDataSet25.mmProtectedDelegationProof);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ContentInformationType12.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TerminalManagementDataSet17.mmIdentification, com.tools20022.repository.msg.TerminalManagementDataSet17.mmPOIChallenge,
						com.tools20022.repository.msg.TerminalManagementDataSet17.mmTMChallenge, com.tools20022.repository.msg.TerminalManagementDataSet17.mmSessionKey,
						com.tools20022.repository.msg.TerminalManagementDataSet17.mmDelegationProof, com.tools20022.repository.msg.TerminalManagementDataSet17.mmProtectedDelegationProof);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TerminalManagementDataSet17";
				definition = "Identification of requested data set.";
				nextVersions_lazy = () -> Arrays.asList(TerminalManagementDataSet25.mmObject());
				previousVersion_lazy = () -> TerminalManagementDataSet12.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public DataSetIdentification6 getIdentification() {
		return identification;
	}

	public TerminalManagementDataSet17 setIdentification(com.tools20022.repository.msg.DataSetIdentification6 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<Max140Binary> getPOIChallenge() {
		return pOIChallenge == null ? Optional.empty() : Optional.of(pOIChallenge);
	}

	public TerminalManagementDataSet17 setPOIChallenge(Max140Binary pOIChallenge) {
		this.pOIChallenge = pOIChallenge;
		return this;
	}

	public Optional<Max140Binary> getTMChallenge() {
		return tMChallenge == null ? Optional.empty() : Optional.of(tMChallenge);
	}

	public TerminalManagementDataSet17 setTMChallenge(Max140Binary tMChallenge) {
		this.tMChallenge = tMChallenge;
		return this;
	}

	public Optional<CryptographicKey5> getSessionKey() {
		return sessionKey == null ? Optional.empty() : Optional.of(sessionKey);
	}

	public TerminalManagementDataSet17 setSessionKey(com.tools20022.repository.msg.CryptographicKey5 sessionKey) {
		this.sessionKey = sessionKey;
		return this;
	}

	public Optional<Max5000Binary> getDelegationProof() {
		return delegationProof == null ? Optional.empty() : Optional.of(delegationProof);
	}

	public TerminalManagementDataSet17 setDelegationProof(Max5000Binary delegationProof) {
		this.delegationProof = delegationProof;
		return this;
	}

	public Optional<ContentInformationType12> getProtectedDelegationProof() {
		return protectedDelegationProof == null ? Optional.empty() : Optional.of(protectedDelegationProof);
	}

	public TerminalManagementDataSet17 setProtectedDelegationProof(com.tools20022.repository.msg.ContentInformationType12 protectedDelegationProof) {
		this.protectedDelegationProof = protectedDelegationProof;
		return this;
	}
}