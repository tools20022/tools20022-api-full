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
import com.tools20022.repository.datatype.Max15NumericText;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Statistical information on the processing of records included in the original
 * report.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalReportStatistics3#mmTotalNumberOfRecords
 * OriginalReportStatistics3.mmTotalNumberOfRecords}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalReportStatistics3#mmNumberOfRecordsPerStatus
 * OriginalReportStatistics3.mmNumberOfRecordsPerStatus}</li>
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
 * "OriginalReportStatistics3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Statistical information on the processing of records included in the original report."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "OriginalReportStatistics3", propOrder = {"totalNumberOfRecords", "numberOfRecordsPerStatus"})
public class OriginalReportStatistics3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max15NumericText totalNumberOfRecords;
	/**
	 * Total numbers of records included in the original file.
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
	 * {@linkplain com.tools20022.repository.msg.OriginalReportStatistics3
	 * OriginalReportStatistics3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNbOfRcrds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNumberOfRecords"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total numbers of records included in the original file."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalNumberOfRecords = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OriginalReportStatistics3.mmObject();
			isDerived = false;
			xmlTag = "TtlNbOfRcrds";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberOfRecords";
			definition = "Total numbers of records included in the original file.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.NumberOfRecordsPerStatus1> numberOfRecordsPerStatus;
	/**
	 * Detailed information on the number of records for each records status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.NumberOfRecordsPerStatus1
	 * NumberOfRecordsPerStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalReportStatistics3
	 * OriginalReportStatistics3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfRcrdsPerSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfRecordsPerStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Detailed information on the number of records for each records status."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNumberOfRecordsPerStatus = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> OriginalReportStatistics3.mmObject();
			isDerived = false;
			xmlTag = "NbOfRcrdsPerSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfRecordsPerStatus";
			definition = "Detailed information on the number of records for each records status.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.NumberOfRecordsPerStatus1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(OriginalReportStatistics3.mmTotalNumberOfRecords, OriginalReportStatistics3.mmNumberOfRecordsPerStatus);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OriginalReportStatistics3";
				definition = "Statistical information on the processing of records included in the original report.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TtlNbOfRcrds", required = true)
	public Max15NumericText getTotalNumberOfRecords() {
		return totalNumberOfRecords;
	}

	public void setTotalNumberOfRecords(Max15NumericText totalNumberOfRecords) {
		this.totalNumberOfRecords = totalNumberOfRecords;
	}

	@XmlElement(name = "NbOfRcrdsPerSts", required = true)
	public List<NumberOfRecordsPerStatus1> getNumberOfRecordsPerStatus() {
		return numberOfRecordsPerStatus;
	}

	public void setNumberOfRecordsPerStatus(List<com.tools20022.repository.msg.NumberOfRecordsPerStatus1> numberOfRecordsPerStatus) {
		this.numberOfRecordsPerStatus = numberOfRecordsPerStatus;
	}
}