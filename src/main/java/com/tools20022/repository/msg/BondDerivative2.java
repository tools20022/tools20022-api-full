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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.LEIIdentifier;
import com.tools20022.repository.entity.Asset;
import com.tools20022.repository.entity.Derivative;
import com.tools20022.repository.entity.IssuerRole;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Transparency calculation specific details on a bond derivative.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BondDerivative2#mmIssuer
 * BondDerivative2.mmIssuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BondDerivative2#mmMaturityDate
 * BondDerivative2.mmMaturityDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BondDerivative2#mmIssuanceDate
 * BondDerivative2.mmIssuanceDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
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
 * "BondDerivative2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Transparency calculation specific details on a bond derivative."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "BondDerivative2", propOrder = {"issuer", "maturityDate", "issuanceDate"})
public class BondDerivative2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected LEIIdentifier issuer;
	/**
	 * Legal Entity Identifer (LEI) code of the issuer of the direct or ultimate
	 * underlying bond.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.LEIIdentifier
	 * LEIIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.IssuerRole IssuerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BondDerivative2
	 * BondDerivative2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Issr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Legal Entity Identifer (LEI) code of the issuer of the direct or ultimate underlying bond."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIssuer = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> IssuerRole.mmObject();
			componentContext_lazy = () -> BondDerivative2.mmObject();
			isDerived = false;
			xmlTag = "Issr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuer";
			definition = "Legal Entity Identifer (LEI) code of the issuer of the direct or ultimate underlying bond.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LEIIdentifier.mmObject();
		}
	};
	protected ISODate maturityDate;
	/**
	 * Date of maturity of the underlying bond. This field applies to debt
	 * instruments with defined maturity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmMaturityDate
	 * Asset.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BondDerivative2
	 * BondDerivative2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtrtyDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date of maturity of the underlying bond. This field applies to debt instruments with defined maturity."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaturityDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Asset.mmMaturityDate;
			componentContext_lazy = () -> BondDerivative2.mmObject();
			isDerived = false;
			xmlTag = "MtrtyDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityDate";
			definition = "Date of maturity of the underlying bond. This field applies to debt instruments with defined maturity.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate issuanceDate;
	/**
	 * Populated with the issuance date of the underlying bond.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BondDerivative2
	 * BondDerivative2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssncDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuanceDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Populated with the issuance date of the underlying bond."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIssuanceDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BondDerivative2.mmObject();
			isDerived = false;
			xmlTag = "IssncDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuanceDate";
			definition = "Populated with the issuance date of the underlying bond.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(BondDerivative2.mmIssuer, BondDerivative2.mmMaturityDate, BondDerivative2.mmIssuanceDate);
				trace_lazy = () -> Derivative.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BondDerivative2";
				definition = "Transparency calculation specific details on a bond derivative.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Issr", required = true)
	public LEIIdentifier getIssuer() {
		return issuer;
	}

	public void setIssuer(LEIIdentifier issuer) {
		this.issuer = issuer;
	}

	@XmlElement(name = "MtrtyDt")
	public ISODate getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(ISODate maturityDate) {
		this.maturityDate = maturityDate;
	}

	@XmlElement(name = "IssncDt")
	public ISODate getIssuanceDate() {
		return issuanceDate;
	}

	public void setIssuanceDate(ISODate issuanceDate) {
		this.issuanceDate = issuanceDate;
	}
}