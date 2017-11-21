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
import com.tools20022.repository.codeset.ReportingRecordStatus1Code;
import com.tools20022.repository.datatype.Max15NumericText;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides detailed information on the number of transactions that are reported
 * with a specific transaction status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NumberOfRecordsPerStatus1#mmDetailedNumberOfRecords
 * NumberOfRecordsPerStatus1.mmDetailedNumberOfRecords}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NumberOfRecordsPerStatus1#mmDetailedStatus
 * NumberOfRecordsPerStatus1.mmDetailedStatus}</li>
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
 * "NumberOfRecordsPerStatus1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides detailed information on the number of transactions that are reported with a specific transaction status."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "NumberOfRecordsPerStatus1", propOrder = {"detailedNumberOfRecords", "detailedStatus"})
public class NumberOfRecordsPerStatus1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max15NumericText detailedNumberOfRecords;
	/**
	 * Number of individual records contained in the message, detailed per
	 * status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NumberOfRecordsPerStatus1
	 * NumberOfRecordsPerStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtldNbOfRcrds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DetailedNumberOfRecords"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of individual records contained in the message, detailed per status."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDetailedNumberOfRecords = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NumberOfRecordsPerStatus1.mmObject();
			isDerived = false;
			xmlTag = "DtldNbOfRcrds";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DetailedNumberOfRecords";
			definition = "Number of individual records contained in the message, detailed per status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}
	};
	protected ReportingRecordStatus1Code detailedStatus;
	/**
	 * Common transaction status for all individual records reported.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingRecordStatus1Code
	 * ReportingRecordStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NumberOfRecordsPerStatus1
	 * NumberOfRecordsPerStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtldSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DetailedStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Common transaction status for all individual records reported."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDetailedStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NumberOfRecordsPerStatus1.mmObject();
			isDerived = false;
			xmlTag = "DtldSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DetailedStatus";
			definition = "Common transaction status for all individual records reported.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ReportingRecordStatus1Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(NumberOfRecordsPerStatus1.mmDetailedNumberOfRecords, NumberOfRecordsPerStatus1.mmDetailedStatus);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NumberOfRecordsPerStatus1";
				definition = "Provides detailed information on the number of transactions that are reported with a specific transaction status.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "DtldNbOfRcrds", required = true)
	public Max15NumericText getDetailedNumberOfRecords() {
		return detailedNumberOfRecords;
	}

	public void setDetailedNumberOfRecords(Max15NumericText detailedNumberOfRecords) {
		this.detailedNumberOfRecords = detailedNumberOfRecords;
	}

	@XmlElement(name = "DtldSts", required = true)
	public ReportingRecordStatus1Code getDetailedStatus() {
		return detailedStatus;
	}

	public void setDetailedStatus(ReportingRecordStatus1Code detailedStatus) {
		this.detailedStatus = detailedStatus;
	}
}