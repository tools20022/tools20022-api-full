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
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.RelativeDistinguishedName1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Certificate issuer name (see X.509).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CertificateIssuer1#mmRelativeDistinguishedName
 * CertificateIssuer1.mmRelativeDistinguishedName}</li>
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
 * "CertificateIssuer1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Certificate issuer name (see X.509)."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CertificateIssuer1", propOrder = "relativeDistinguishedName")
public class CertificateIssuer1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RltvDstngshdNm", required = true)
	protected List<RelativeDistinguishedName1> relativeDistinguishedName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.RelativeDistinguishedName1
	 * RelativeDistinguishedName1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CertificateIssuer1
	 * CertificateIssuer1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltvDstngshdNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelativeDistinguishedName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relative distinguished name inside a X.509 certificate."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CertificateIssuer1, List<RelativeDistinguishedName1>> mmRelativeDistinguishedName = new MMMessageAssociationEnd<CertificateIssuer1, List<RelativeDistinguishedName1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CertificateIssuer1.mmObject();
			isDerived = false;
			xmlTag = "RltvDstngshdNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelativeDistinguishedName";
			definition = "Relative distinguished name inside a X.509 certificate.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RelativeDistinguishedName1.mmObject();
		}

		@Override
		public List<RelativeDistinguishedName1> getValue(CertificateIssuer1 obj) {
			return obj.getRelativeDistinguishedName();
		}

		@Override
		public void setValue(CertificateIssuer1 obj, List<RelativeDistinguishedName1> value) {
			obj.setRelativeDistinguishedName(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CertificateIssuer1.mmRelativeDistinguishedName);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CertificateIssuer1";
				definition = "Certificate issuer name (see X.509).";
			}
		});
		return mmObject_lazy.get();
	}

	public List<RelativeDistinguishedName1> getRelativeDistinguishedName() {
		return relativeDistinguishedName == null ? relativeDistinguishedName = new ArrayList<>() : relativeDistinguishedName;
	}

	public CertificateIssuer1 setRelativeDistinguishedName(List<RelativeDistinguishedName1> relativeDistinguishedName) {
		this.relativeDistinguishedName = Objects.requireNonNull(relativeDistinguishedName);
		return this;
	}
}