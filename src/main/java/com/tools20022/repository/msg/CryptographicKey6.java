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
import com.tools20022.repository.codeset.CryptographicKeyType3Code;
import com.tools20022.repository.codeset.KeyUsage1Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.datatype.Max5000Binary;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Cryptographic Key.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CryptographicKey6#mmName
 * CryptographicKey6.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CryptographicKey6#mmIdentification
 * CryptographicKey6.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CryptographicKey6#mmVersion
 * CryptographicKey6.mmVersion}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CryptographicKey6#mmType
 * CryptographicKey6.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CryptographicKey6#mmFunction
 * CryptographicKey6.mmFunction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CryptographicKey6#mmActivationDate
 * CryptographicKey6.mmActivationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CryptographicKey6#mmDeactivationDate
 * CryptographicKey6.mmDeactivationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CryptographicKey6#mmEncryptedKeyValue
 * CryptographicKey6.mmEncryptedKeyValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CryptographicKey6#mmCertificate
 * CryptographicKey6.mmCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CryptographicKey6#mmICCRelatedData
 * CryptographicKey6.mmICCRelatedData}</li>
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
 * "CryptographicKey6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Cryptographic Key."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CryptographicKey7
 * CryptographicKey7}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CryptographicKey5
 * CryptographicKey5}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CryptographicKey6", propOrder = {"name", "identification", "version", "type", "function", "activationDate", "deactivationDate", "encryptedKeyValue", "certificate", "ICCRelatedData"})
public class CryptographicKey6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max140Text name;
	/**
	 * Name or label of the key.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey6
	 * CryptographicKey6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name or label of the key."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CryptographicKey7#mmName
	 * CryptographicKey7.mmName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CryptographicKey6.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name or label of the key.";
			nextVersions_lazy = () -> Arrays.asList(CryptographicKey7.mmName);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected Max140Text identification;
	/**
	 * Name of the cryptographic key.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey6
	 * CryptographicKey6}</li>
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
	 * definition} = "Name of the cryptographic key."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey7#mmIdentification
	 * CryptographicKey7.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey5#mmIdentification
	 * CryptographicKey5.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CryptographicKey6.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Name of the cryptographic key.";
			nextVersions_lazy = () -> Arrays.asList(CryptographicKey7.mmIdentification);
			previousVersion_lazy = () -> CryptographicKey5.mmIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected Max256Text version;
	/**
	 * Version of the cryptographic key.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey6
	 * CryptographicKey6}</li>
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
	 * definition} = "Version of the cryptographic key."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey7#mmVersion
	 * CryptographicKey7.mmVersion}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey5#mmVersion
	 * CryptographicKey5.mmVersion}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVersion = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CryptographicKey6.mmObject();
			isDerived = false;
			xmlTag = "Vrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Version";
			definition = "Version of the cryptographic key.";
			nextVersions_lazy = () -> Arrays.asList(CryptographicKey7.mmVersion);
			previousVersion_lazy = () -> CryptographicKey5.mmVersion;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max256Text.mmObject();
		}
	};
	protected CryptographicKeyType3Code type;
	/**
	 * Type of algorithm used by the cryptographic key.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyType3Code
	 * CryptographicKeyType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey6
	 * CryptographicKey6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of algorithm used by the cryptographic key."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CryptographicKey7#mmType
	 * CryptographicKey7.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey5#mmType
	 * CryptographicKey5.mmType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CryptographicKey6.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of algorithm used by the cryptographic key.";
			nextVersions_lazy = () -> Arrays.asList(CryptographicKey7.mmType);
			previousVersion_lazy = () -> CryptographicKey5.mmType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CryptographicKeyType3Code.mmObject();
		}
	};
	protected List<KeyUsage1Code> function;
	/**
	 * Allowed usage of the key.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.KeyUsage1Code
	 * KeyUsage1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey6
	 * CryptographicKey6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Fctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Function"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Allowed usage of the key."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey7#mmFunction
	 * CryptographicKey7.mmFunction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey5#mmFunction
	 * CryptographicKey5.mmFunction}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFunction = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CryptographicKey6.mmObject();
			isDerived = false;
			xmlTag = "Fctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Function";
			definition = "Allowed usage of the key.";
			nextVersions_lazy = () -> Arrays.asList(CryptographicKey7.mmFunction);
			previousVersion_lazy = () -> CryptographicKey5.mmFunction;
			minOccurs = 1;
			simpleType_lazy = () -> KeyUsage1Code.mmObject();
		}
	};
	protected ISODateTime activationDate;
	/**
	 * Date and time on which the key must be activated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey6
	 * CryptographicKey6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActvtnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActivationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time on which the key must be activated."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey7#mmActivationDate
	 * CryptographicKey7.mmActivationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey5#mmActivationDate
	 * CryptographicKey5.mmActivationDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmActivationDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CryptographicKey6.mmObject();
			isDerived = false;
			xmlTag = "ActvtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActivationDate";
			definition = "Date and time on which the key must be activated.";
			nextVersions_lazy = () -> Arrays.asList(CryptographicKey7.mmActivationDate);
			previousVersion_lazy = () -> CryptographicKey5.mmActivationDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime deactivationDate;
	/**
	 * Date and time on which the key must be deactivated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey6
	 * CryptographicKey6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DeactvtnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeactivationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time on which the key must be deactivated."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey7#mmDeactivationDate
	 * CryptographicKey7.mmDeactivationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey5#mmDeactivationDate
	 * CryptographicKey5.mmDeactivationDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeactivationDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CryptographicKey6.mmObject();
			isDerived = false;
			xmlTag = "DeactvtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeactivationDate";
			definition = "Date and time on which the key must be deactivated.";
			nextVersions_lazy = () -> Arrays.asList(CryptographicKey7.mmDeactivationDate);
			previousVersion_lazy = () -> CryptographicKey5.mmDeactivationDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ContentInformationType10 encryptedKeyValue;
	/**
	 * Encrypted value of the key present as CMS structure EnvelopedData.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType10
	 * ContentInformationType10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey6
	 * CryptographicKey6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NcrptdKeyVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EncryptedKeyValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Encrypted value of the key present as CMS structure EnvelopedData."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEncryptedKeyValue = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CryptographicKey6.mmObject();
			isDerived = false;
			xmlTag = "NcrptdKeyVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EncryptedKeyValue";
			definition = "Encrypted value of the key present as CMS structure EnvelopedData.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ContentInformationType10.mmObject();
		}
	};
	protected List<Max5000Binary> certificate;
	/**
	 * Certificate to protect the key.
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
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey6
	 * CryptographicKey6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cert"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Certificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certificate to protect the key."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCertificate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CryptographicKey6.mmObject();
			isDerived = false;
			xmlTag = "Cert";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Certificate";
			definition = "Certificate to protect the key.";
			minOccurs = 0;
			simpleType_lazy = () -> Max5000Binary.mmObject();
		}
	};
	protected Max5000Binary iCCRelatedData;
	/**
	 * Chip card protection of the key.
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
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey6
	 * CryptographicKey6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ICCRltdData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ICCRelatedData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Chip card protection of the key."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmICCRelatedData = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CryptographicKey6.mmObject();
			isDerived = false;
			xmlTag = "ICCRltdData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ICCRelatedData";
			definition = "Chip card protection of the key.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max5000Binary.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CryptographicKey6.mmName, CryptographicKey6.mmIdentification, CryptographicKey6.mmVersion, CryptographicKey6.mmType, CryptographicKey6.mmFunction,
						CryptographicKey6.mmActivationDate, CryptographicKey6.mmDeactivationDate, CryptographicKey6.mmEncryptedKeyValue, CryptographicKey6.mmCertificate, CryptographicKey6.mmICCRelatedData);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CryptographicKey6";
				definition = "Cryptographic Key.";
				nextVersions_lazy = () -> Arrays.asList(CryptographicKey7.mmObject());
				previousVersion_lazy = () -> CryptographicKey5.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Nm")
	public Max140Text getName() {
		return name;
	}

	public void setName(Max140Text name) {
		this.name = name;
	}

	@XmlElement(name = "Id", required = true)
	public Max140Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max140Text identification) {
		this.identification = identification;
	}

	@XmlElement(name = "Vrsn")
	public Max256Text getVersion() {
		return version;
	}

	public void setVersion(Max256Text version) {
		this.version = version;
	}

	@XmlElement(name = "Tp", required = true)
	public CryptographicKeyType3Code getType() {
		return type;
	}

	public void setType(CryptographicKeyType3Code type) {
		this.type = type;
	}

	@XmlElement(name = "Fctn", required = true)
	public List<KeyUsage1Code> getFunction() {
		return function;
	}

	public void setFunction(List<KeyUsage1Code> function) {
		this.function = function;
	}

	@XmlElement(name = "ActvtnDt")
	public ISODateTime getActivationDate() {
		return activationDate;
	}

	public void setActivationDate(ISODateTime activationDate) {
		this.activationDate = activationDate;
	}

	@XmlElement(name = "DeactvtnDt")
	public ISODateTime getDeactivationDate() {
		return deactivationDate;
	}

	public void setDeactivationDate(ISODateTime deactivationDate) {
		this.deactivationDate = deactivationDate;
	}

	@XmlElement(name = "NcrptdKeyVal")
	public ContentInformationType10 getEncryptedKeyValue() {
		return encryptedKeyValue;
	}

	public void setEncryptedKeyValue(com.tools20022.repository.msg.ContentInformationType10 encryptedKeyValue) {
		this.encryptedKeyValue = encryptedKeyValue;
	}

	@XmlElement(name = "Cert")
	public List<Max5000Binary> getCertificate() {
		return certificate;
	}

	public void setCertificate(List<Max5000Binary> certificate) {
		this.certificate = certificate;
	}

	@XmlElement(name = "ICCRltdData")
	public Max5000Binary getICCRelatedData() {
		return iCCRelatedData;
	}

	public void setICCRelatedData(Max5000Binary iCCRelatedData) {
		this.iCCRelatedData = iCCRelatedData;
	}
}