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
import com.tools20022.repository.area.auth.FinancialInstrumentReportingTradingVolumeCapDataReportV01;
import com.tools20022.repository.choice.Period4Choice;
import com.tools20022.repository.datatype.MICIdentifier;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Double volume cap report.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VolumeCapReport1#mmReportingPeriod
 * VolumeCapReport1.mmReportingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VolumeCapReport1#mmTradingVenue
 * VolumeCapReport1.mmTradingVenue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VolumeCapReport1#mmInstrumentReport
 * VolumeCapReport1.mmInstrumentReport}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingTradingVolumeCapDataReportV01#mmVolumeCapData
 * FinancialInstrumentReportingTradingVolumeCapDataReportV01.mmVolumeCapData}</li>
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
 * "VolumeCapReport1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Double volume cap report."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "VolumeCapReport1", propOrder = {"reportingPeriod", "tradingVenue", "instrumentReport"})
public class VolumeCapReport1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Period4Choice reportingPeriod;
	/**
	 * Date or date range the report relates to.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period4Choice
	 * Period4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VolumeCapReport1
	 * VolumeCapReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptgPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date or date range the report relates to."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReportingPeriod = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> VolumeCapReport1.mmObject();
			isDerived = false;
			xmlTag = "RptgPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingPeriod";
			definition = "Date or date range the report relates to.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period4Choice.mmObject();
		}
	};
	protected MICIdentifier tradingVenue;
	/**
	 * The venue this report is in relation to specified as {MIC} (segment MIC,
	 * where available, otherwise operational MIC).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.MICIdentifier
	 * MICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmPlaceOfListing
	 * Security.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VolumeCapReport1
	 * VolumeCapReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgVn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingVenue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The venue this report is in relation to specified as {MIC} (segment MIC, where available, otherwise operational MIC)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradingVenue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmPlaceOfListing;
			componentContext_lazy = () -> VolumeCapReport1.mmObject();
			isDerived = false;
			xmlTag = "TradgVn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingVenue";
			definition = "The venue this report is in relation to specified as {MIC} (segment MIC, where available, otherwise operational MIC).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> MICIdentifier.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.VolumeCapReport2> instrumentReport;
	/**
	 * Volume cap data specific to a reporting period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.VolumeCapReport2
	 * VolumeCapReport2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VolumeCapReport1
	 * VolumeCapReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrmRpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstrumentReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Volume cap data specific to a reporting period."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstrumentReport = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> VolumeCapReport1.mmObject();
			isDerived = false;
			xmlTag = "InstrmRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstrumentReport";
			definition = "Volume cap data specific to a reporting period.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.VolumeCapReport2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(VolumeCapReport1.mmReportingPeriod, VolumeCapReport1.mmTradingVenue, VolumeCapReport1.mmInstrumentReport);
				messageBuildingBlock_lazy = () -> Arrays.asList(FinancialInstrumentReportingTradingVolumeCapDataReportV01.mmVolumeCapData);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "VolumeCapReport1";
				definition = "Double volume cap report.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "RptgPrd")
	public Period4Choice getReportingPeriod() {
		return reportingPeriod;
	}

	public void setReportingPeriod(Period4Choice reportingPeriod) {
		this.reportingPeriod = reportingPeriod;
	}

	@XmlElement(name = "TradgVn")
	public MICIdentifier getTradingVenue() {
		return tradingVenue;
	}

	public void setTradingVenue(MICIdentifier tradingVenue) {
		this.tradingVenue = tradingVenue;
	}

	@XmlElement(name = "InstrmRpt", required = true)
	public List<VolumeCapReport2> getInstrumentReport() {
		return instrumentReport;
	}

	public void setInstrumentReport(List<com.tools20022.repository.msg.VolumeCapReport2> instrumentReport) {
		this.instrumentReport = instrumentReport;
	}
}