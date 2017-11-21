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
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.DateTimePeriod;
import com.tools20022.repository.entity.SecuritiesIdentification;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the date from which the financial instrument identification is
 * valid.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentIdentificationValidity1#mmFinancialInstrumentIdentification
 * FinancialInstrumentIdentificationValidity1.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentIdentificationValidity1#mmISINValidFrom
 * FinancialInstrumentIdentificationValidity1.mmISINValidFrom}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
 * SecuritiesIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialInstrumentIdentificationValidity1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the date from which the financial instrument identification is valid."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "FinancialInstrumentIdentificationValidity1", propOrder = {"financialInstrumentIdentification", "ISINValidFrom"})
public class FinancialInstrumentIdentificationValidity1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected SecurityIdentification14 financialInstrumentIdentification;
	/**
	 * Way(s) of identifying the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14
	 * SecurityIdentification14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentIdentificationValidity1
	 * FinancialInstrumentIdentificationValidity1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Way(s) of identifying the security."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentIdentification = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesIdentification.mmObject();
			componentContext_lazy = () -> FinancialInstrumentIdentificationValidity1.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Way(s) of identifying the security.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecurityIdentification14.mmObject();
		}
	};
	protected ISODate iSINValidFrom;
	/**
	 * Defines the date from which the instrument code is valid. This date can
	 * be before the actual issue date of an instrument for 'when-issued'
	 * securities, but may not be a date in the future for a new security.
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
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmFromDateTime
	 * DateTimePeriod.mmFromDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentIdentificationValidity1
	 * FinancialInstrumentIdentificationValidity1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ISINVldFr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISINValidFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the date from which the instrument code is valid. This date can be before the actual issue date of an instrument for 'when-issued' securities, but may not be a date in the future for a new security."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmISINValidFrom = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmFromDateTime;
			componentContext_lazy = () -> FinancialInstrumentIdentificationValidity1.mmObject();
			isDerived = false;
			xmlTag = "ISINVldFr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISINValidFrom";
			definition = "Defines the date from which the instrument code is valid. This date can be before the actual issue date of an instrument for 'when-issued' securities, but may not be a date in the future for a new security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(FinancialInstrumentIdentificationValidity1.mmFinancialInstrumentIdentification, FinancialInstrumentIdentificationValidity1.mmISINValidFrom);
				trace_lazy = () -> SecuritiesIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "FinancialInstrumentIdentificationValidity1";
				definition = "Specifies the date from which the financial instrument identification is valid.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "FinInstrmId")
	public SecurityIdentification14 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public void setFinancialInstrumentIdentification(com.tools20022.repository.msg.SecurityIdentification14 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = financialInstrumentIdentification;
	}

	@XmlElement(name = "ISINVldFr")
	public ISODate getISINValidFrom() {
		return iSINValidFrom;
	}

	public void setISINValidFrom(ISODate iSINValidFrom) {
		this.iSINValidFrom = iSINValidFrom;
	}
}