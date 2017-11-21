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
import com.tools20022.repository.datatype.Exact4NumericText;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max6AlphaText;
import com.tools20022.repository.entity.Agreement;
import com.tools20022.repository.entity.MasterAgreement;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the type, date and version of the agreement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AgreementConditions1#mmAgreementCode
 * AgreementConditions1.mmAgreementCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AgreementConditions1#mmDate
 * AgreementConditions1.mmDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AgreementConditions1#mmVersion
 * AgreementConditions1.mmVersion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.MasterAgreement
 * MasterAgreement}</li>
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
 * "AgreementConditions1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type, date and version of the agreement."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AgreementConditions1", propOrder = {"agreementCode", "date", "version"})
public class AgreementConditions1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max6AlphaText agreementCode;
	/**
	 * Specifies the type of agreement
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max6AlphaText
	 * Max6AlphaText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MasterAgreement#mmMasterAgreementType
	 * MasterAgreement.mmMasterAgreementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AgreementConditions1
	 * AgreementConditions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgrmtCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgreementCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of agreement"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAgreementCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> MasterAgreement.mmMasterAgreementType;
			componentContext_lazy = () -> AgreementConditions1.mmObject();
			isDerived = false;
			xmlTag = "AgrmtCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgreementCode";
			definition = "Specifies the type of agreement";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max6AlphaText.mmObject();
		}
	};
	protected ISODate date;
	/**
	 * Specifies the date of the agreement.
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
	 * {@linkplain com.tools20022.repository.entity.Agreement#mmDateSigned
	 * Agreement.mmDateSigned}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AgreementConditions1
	 * AgreementConditions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Date"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the date of the agreement."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Agreement.mmDateSigned;
			componentContext_lazy = () -> AgreementConditions1.mmObject();
			isDerived = false;
			xmlTag = "Dt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Date";
			definition = "Specifies the date of the agreement.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected Exact4NumericText version;
	/**
	 * Specifies the version of the agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact4NumericText
	 * Exact4NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Agreement#mmVersion
	 * Agreement.mmVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AgreementConditions1
	 * AgreementConditions1}</li>
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
	 * definition} = "Specifies the version of the agreement."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVersion = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Agreement.mmVersion;
			componentContext_lazy = () -> AgreementConditions1.mmObject();
			isDerived = false;
			xmlTag = "Vrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Version";
			definition = "Specifies the version of the agreement.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact4NumericText.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AgreementConditions1.mmAgreementCode, AgreementConditions1.mmDate, AgreementConditions1.mmVersion);
				trace_lazy = () -> MasterAgreement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AgreementConditions1";
				definition = "Specifies the type, date and version of the agreement.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "AgrmtCd", required = true)
	public Max6AlphaText getAgreementCode() {
		return agreementCode;
	}

	public void setAgreementCode(Max6AlphaText agreementCode) {
		this.agreementCode = agreementCode;
	}

	@XmlElement(name = "Dt")
	public ISODate getDate() {
		return date;
	}

	public void setDate(ISODate date) {
		this.date = date;
	}

	@XmlElement(name = "Vrsn")
	public Exact4NumericText getVersion() {
		return version;
	}

	public void setVersion(Exact4NumericText version) {
		this.version = version;
	}
}