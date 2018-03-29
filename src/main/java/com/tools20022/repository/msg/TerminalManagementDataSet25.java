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
import com.tools20022.repository.msg.ContentInformationType19;
import com.tools20022.repository.msg.CryptographicKey13;
import com.tools20022.repository.msg.DataSetIdentification7;
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
 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet25#mmIdentification
 * TerminalManagementDataSet25.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet25#mmPOIChallenge
 * TerminalManagementDataSet25.mmPOIChallenge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet25#mmTMChallenge
 * TerminalManagementDataSet25.mmTMChallenge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet25#mmSessionKey
 * TerminalManagementDataSet25.mmSessionKey}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet25#mmDelegationProof
 * TerminalManagementDataSet25.mmDelegationProof}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet25#mmProtectedDelegationProof
 * TerminalManagementDataSet25.mmProtectedDelegationProof}</li>
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
 * "TerminalManagementDataSet25"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identification of requested data set."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet17
 * TerminalManagementDataSet17}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TerminalManagementDataSet25", propOrder = {"identification", "pOIChallenge", "tMChallenge", "sessionKey", "delegationProof", "protectedDelegationProof"})
public class TerminalManagementDataSet25 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected DataSetIdentification7 identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DataSetIdentification7
	 * DataSetIdentification7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet25
	 * TerminalManagementDataSet25}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet17#mmIdentification
	 * TerminalManagementDataSet17.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TerminalManagementDataSet25, DataSetIdentification7> mmIdentification = new MMMessageAttribute<TerminalManagementDataSet25, DataSetIdentification7>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TerminalManagementDataSet25.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the required data set.";
			previousVersion_lazy = () -> TerminalManagementDataSet17.mmIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DataSetIdentification7.mmObject();
		}

		@Override
		public DataSetIdentification7 getValue(TerminalManagementDataSet25 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(TerminalManagementDataSet25 obj, DataSetIdentification7 value) {
			obj.setIdentification(value);
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
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet25
	 * TerminalManagementDataSet25}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet17#mmPOIChallenge
	 * TerminalManagementDataSet17.mmPOIChallenge}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TerminalManagementDataSet25, Optional<Max140Binary>> mmPOIChallenge = new MMMessageAttribute<TerminalManagementDataSet25, Optional<Max140Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TerminalManagementDataSet25.mmObject();
			isDerived = false;
			xmlTag = "POIChllng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POIChallenge";
			definition = "Point of interaction challenge for cryptographic key injection.";
			previousVersion_lazy = () -> TerminalManagementDataSet17.mmPOIChallenge;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Binary.mmObject();
		}

		@Override
		public Optional<Max140Binary> getValue(TerminalManagementDataSet25 obj) {
			return obj.getPOIChallenge();
		}

		@Override
		public void setValue(TerminalManagementDataSet25 obj, Optional<Max140Binary> value) {
			obj.setPOIChallenge(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet25
	 * TerminalManagementDataSet25}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet17#mmTMChallenge
	 * TerminalManagementDataSet17.mmTMChallenge}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TerminalManagementDataSet25, Optional<Max140Binary>> mmTMChallenge = new MMMessageAttribute<TerminalManagementDataSet25, Optional<Max140Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TerminalManagementDataSet25.mmObject();
			isDerived = false;
			xmlTag = "TMChllng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMChallenge";
			definition = "Terminal manager challenge for cryptographic key injection.";
			previousVersion_lazy = () -> TerminalManagementDataSet17.mmTMChallenge;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Binary.mmObject();
		}

		@Override
		public Optional<Max140Binary> getValue(TerminalManagementDataSet25 obj) {
			return obj.getTMChallenge();
		}

		@Override
		public void setValue(TerminalManagementDataSet25 obj, Optional<Max140Binary> value) {
			obj.setTMChallenge(value.orElse(null));
		}
	};
	@XmlElement(name = "SsnKey")
	protected CryptographicKey13 sessionKey;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CryptographicKey13
	 * CryptographicKey13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet25
	 * TerminalManagementDataSet25}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet17#mmSessionKey
	 * TerminalManagementDataSet17.mmSessionKey}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TerminalManagementDataSet25, Optional<CryptographicKey13>> mmSessionKey = new MMMessageAssociationEnd<TerminalManagementDataSet25, Optional<CryptographicKey13>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TerminalManagementDataSet25.mmObject();
			isDerived = false;
			xmlTag = "SsnKey";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SessionKey";
			definition = "Temporary encryption key that the host will use for protecting keys to download.";
			previousVersion_lazy = () -> TerminalManagementDataSet17.mmSessionKey;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CryptographicKey13.mmObject();
		}

		@Override
		public Optional<CryptographicKey13> getValue(TerminalManagementDataSet25 obj) {
			return obj.getSessionKey();
		}

		@Override
		public void setValue(TerminalManagementDataSet25 obj, Optional<CryptographicKey13> value) {
			obj.setSessionKey(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet25
	 * TerminalManagementDataSet25}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet17#mmDelegationProof
	 * TerminalManagementDataSet17.mmDelegationProof}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TerminalManagementDataSet25, Optional<Max5000Binary>> mmDelegationProof = new MMMessageAttribute<TerminalManagementDataSet25, Optional<Max5000Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TerminalManagementDataSet25.mmObject();
			isDerived = false;
			xmlTag = "DlgtnProof";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelegationProof";
			definition = "Proof of delegation to be validated by the terminal manager receiving a status report from a new POI.";
			previousVersion_lazy = () -> TerminalManagementDataSet17.mmDelegationProof;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max5000Binary.mmObject();
		}

		@Override
		public Optional<Max5000Binary> getValue(TerminalManagementDataSet25 obj) {
			return obj.getDelegationProof();
		}

		@Override
		public void setValue(TerminalManagementDataSet25 obj, Optional<Max5000Binary> value) {
			obj.setDelegationProof(value.orElse(null));
		}
	};
	@XmlElement(name = "PrtctdDlgtnProof")
	protected ContentInformationType19 protectedDelegationProof;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType19
	 * ContentInformationType19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet25
	 * TerminalManagementDataSet25}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet17#mmProtectedDelegationProof
	 * TerminalManagementDataSet17.mmProtectedDelegationProof}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TerminalManagementDataSet25, Optional<ContentInformationType19>> mmProtectedDelegationProof = new MMMessageAssociationEnd<TerminalManagementDataSet25, Optional<ContentInformationType19>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TerminalManagementDataSet25.mmObject();
			isDerived = false;
			xmlTag = "PrtctdDlgtnProof";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedDelegationProof";
			definition = "Protected proof of delegation.";
			previousVersion_lazy = () -> TerminalManagementDataSet17.mmProtectedDelegationProof;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ContentInformationType19.mmObject();
		}

		@Override
		public Optional<ContentInformationType19> getValue(TerminalManagementDataSet25 obj) {
			return obj.getProtectedDelegationProof();
		}

		@Override
		public void setValue(TerminalManagementDataSet25 obj, Optional<ContentInformationType19> value) {
			obj.setProtectedDelegationProof(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TerminalManagementDataSet25.mmIdentification, com.tools20022.repository.msg.TerminalManagementDataSet25.mmPOIChallenge,
						com.tools20022.repository.msg.TerminalManagementDataSet25.mmTMChallenge, com.tools20022.repository.msg.TerminalManagementDataSet25.mmSessionKey,
						com.tools20022.repository.msg.TerminalManagementDataSet25.mmDelegationProof, com.tools20022.repository.msg.TerminalManagementDataSet25.mmProtectedDelegationProof);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TerminalManagementDataSet25";
				definition = "Identification of requested data set.";
				previousVersion_lazy = () -> TerminalManagementDataSet17.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public DataSetIdentification7 getIdentification() {
		return identification;
	}

	public TerminalManagementDataSet25 setIdentification(DataSetIdentification7 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<Max140Binary> getPOIChallenge() {
		return pOIChallenge == null ? Optional.empty() : Optional.of(pOIChallenge);
	}

	public TerminalManagementDataSet25 setPOIChallenge(Max140Binary pOIChallenge) {
		this.pOIChallenge = pOIChallenge;
		return this;
	}

	public Optional<Max140Binary> getTMChallenge() {
		return tMChallenge == null ? Optional.empty() : Optional.of(tMChallenge);
	}

	public TerminalManagementDataSet25 setTMChallenge(Max140Binary tMChallenge) {
		this.tMChallenge = tMChallenge;
		return this;
	}

	public Optional<CryptographicKey13> getSessionKey() {
		return sessionKey == null ? Optional.empty() : Optional.of(sessionKey);
	}

	public TerminalManagementDataSet25 setSessionKey(CryptographicKey13 sessionKey) {
		this.sessionKey = sessionKey;
		return this;
	}

	public Optional<Max5000Binary> getDelegationProof() {
		return delegationProof == null ? Optional.empty() : Optional.of(delegationProof);
	}

	public TerminalManagementDataSet25 setDelegationProof(Max5000Binary delegationProof) {
		this.delegationProof = delegationProof;
		return this;
	}

	public Optional<ContentInformationType19> getProtectedDelegationProof() {
		return protectedDelegationProof == null ? Optional.empty() : Optional.of(protectedDelegationProof);
	}

	public TerminalManagementDataSet25 setProtectedDelegationProof(ContentInformationType19 protectedDelegationProof) {
		this.protectedDelegationProof = protectedDelegationProof;
		return this;
	}
}