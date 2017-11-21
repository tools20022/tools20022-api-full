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
import com.tools20022.repository.area.secl.NetPositionV03;
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.codeset.EventFrequency6Code;
import com.tools20022.repository.codeset.StatementUpdateType1Code;
import com.tools20022.repository.datatype.Exact5NumericText;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Parameters related to the net position.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportParameters1#mmNetPositionIdentification
 * ReportParameters1.mmNetPositionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportParameters1#mmReportDateAndTime
 * ReportParameters1.mmReportDateAndTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportParameters1#mmUpdateType
 * ReportParameters1.mmUpdateType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportParameters1#mmFrequency
 * ReportParameters1.mmFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportParameters1#mmReportNumber
 * ReportParameters1.mmReportNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportParameters1#mmActivityIndicator
 * ReportParameters1.mmActivityIndicator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.NetPositionV03#mmReportParameters
 * NetPositionV03.mmReportParameters}</li>
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
 * "ReportParameters1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Parameters related to the net position."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ReportParameters1", propOrder = {"netPositionIdentification", "reportDateAndTime", "updateType", "frequency", "reportNumber", "activityIndicator"})
public class ReportParameters1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text netPositionIdentification;
	/**
	 * After netting, reference that is common to a net transaction to settle
	 * and all its underlying trades.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportParameters1
	 * ReportParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetPosId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetPositionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "After netting, reference that is common to a net transaction to settle and all its underlying trades."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNetPositionIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ReportParameters1.mmObject();
			isDerived = false;
			xmlTag = "NetPosId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetPositionIdentification";
			definition = "After netting, reference that is common to a net transaction to settle and all its underlying trades.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected DateAndDateTimeChoice reportDateAndTime;
	/**
	 * Date and time of the net position report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportParameters1
	 * ReportParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptDtAndTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportDateAndTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time of the net position report."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReportDateAndTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ReportParameters1.mmObject();
			isDerived = false;
			xmlTag = "RptDtAndTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportDateAndTime";
			definition = "Date and time of the net position report.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected StatementUpdateType1Code updateType;
	/**
	 * Indicates whether the statement is complete or contains changes only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.StatementUpdateType1Code
	 * StatementUpdateType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportParameters1
	 * ReportParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UpdTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UpdateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the statement is complete or contains changes only."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUpdateType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ReportParameters1.mmObject();
			isDerived = false;
			xmlTag = "UpdTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpdateType";
			definition = "Indicates whether the statement is complete or contains changes only.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> StatementUpdateType1Code.mmObject();
		}
	};
	protected EventFrequency6Code frequency;
	/**
	 * Frequency of the report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency6Code
	 * EventFrequency6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportParameters1
	 * ReportParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Frqcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Frequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Frequency of the report."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFrequency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ReportParameters1.mmObject();
			isDerived = false;
			xmlTag = "Frqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Frequency";
			definition = "Frequency of the report.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EventFrequency6Code.mmObject();
		}
	};
	protected Exact5NumericText reportNumber;
	/**
	 * Sequential number of the report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact5NumericText
	 * Exact5NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportParameters1
	 * ReportParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sequential number of the report."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReportNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ReportParameters1.mmObject();
			isDerived = false;
			xmlTag = "RptNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumber";
			definition = "Sequential number of the report.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact5NumericText.mmObject();
		}
	};
	protected YesNoIndicator activityIndicator;
	/**
	 * Indicates whether there is activity or information update reported in the
	 * statement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportParameters1
	 * ReportParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActvtyInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActivityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether there is activity or information update reported in the statement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmActivityIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ReportParameters1.mmObject();
			isDerived = false;
			xmlTag = "ActvtyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActivityIndicator";
			definition = "Indicates whether there is activity or information update reported in the statement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ReportParameters1.mmNetPositionIdentification, ReportParameters1.mmReportDateAndTime, ReportParameters1.mmUpdateType, ReportParameters1.mmFrequency,
						ReportParameters1.mmReportNumber, ReportParameters1.mmActivityIndicator);
				messageBuildingBlock_lazy = () -> Arrays.asList(NetPositionV03.mmReportParameters);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReportParameters1";
				definition = "Parameters related to the net position.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "NetPosId", required = true)
	public Max35Text getNetPositionIdentification() {
		return netPositionIdentification;
	}

	public void setNetPositionIdentification(Max35Text netPositionIdentification) {
		this.netPositionIdentification = netPositionIdentification;
	}

	@XmlElement(name = "RptDtAndTm", required = true)
	public DateAndDateTimeChoice getReportDateAndTime() {
		return reportDateAndTime;
	}

	public void setReportDateAndTime(DateAndDateTimeChoice reportDateAndTime) {
		this.reportDateAndTime = reportDateAndTime;
	}

	@XmlElement(name = "UpdTp", required = true)
	public StatementUpdateType1Code getUpdateType() {
		return updateType;
	}

	public void setUpdateType(StatementUpdateType1Code updateType) {
		this.updateType = updateType;
	}

	@XmlElement(name = "Frqcy", required = true)
	public EventFrequency6Code getFrequency() {
		return frequency;
	}

	public void setFrequency(EventFrequency6Code frequency) {
		this.frequency = frequency;
	}

	@XmlElement(name = "RptNb")
	public Exact5NumericText getReportNumber() {
		return reportNumber;
	}

	public void setReportNumber(Exact5NumericText reportNumber) {
		this.reportNumber = reportNumber;
	}

	@XmlElement(name = "ActvtyInd", required = true)
	public YesNoIndicator getActivityIndicator() {
		return activityIndicator;
	}

	public void setActivityIndicator(YesNoIndicator activityIndicator) {
		this.activityIndicator = activityIndicator;
	}
}