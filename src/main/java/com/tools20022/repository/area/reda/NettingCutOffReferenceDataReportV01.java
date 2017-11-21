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

package com.tools20022.repository.area.reda;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.ReferenceDataLatestVersion;
import com.tools20022.repository.msg.CutOffData1;
import com.tools20022.repository.msg.NettingCutOffReportData1;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.PostTradeForeignExchangeISOLatestversion;
import com.tools20022.repository.msgset.PostTradeForeignExchangeMaintenance20162017andSupplement;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * The Netting Cut Off Reference Data Report message is sent to a participant by
 * a central system to provide details of scheduled, changed, existing and
 * previous netting cut off data held at a central system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.ReferenceDataLatestVersion
 * ReferenceDataLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.PostTradeForeignExchangeISOLatestversion
 * PostTradeForeignExchangeISOLatestversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.PostTradeForeignExchangeMaintenance20162017andSupplement
 * PostTradeForeignExchangeMaintenance20162017andSupplement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "NetgCutOffRefDataRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.NettingCutOffReferenceDataReportV01#mmReportData
 * NettingCutOffReferenceDataReportV01.mmReportData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.NettingCutOffReferenceDataReportV01#mmParticipantNettingCutOffData
 * NettingCutOffReferenceDataReportV01.mmParticipantNettingCutOffData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.NettingCutOffReferenceDataReportV01#mmSupplementaryData
 * NettingCutOffReferenceDataReportV01.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code reda.061.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NettingCutOffReferenceDataReportV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The Netting Cut Off Reference Data Report message is sent to a participant by a central system to provide details of scheduled, changed, existing and previous netting cut off data held at a central system."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "NettingCutOffReferenceDataReportV01", propOrder = {"reportData", "participantNettingCutOffData", "supplementaryData"})
public class NettingCutOffReferenceDataReportV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected NettingCutOffReportData1 reportData;
	/**
	 * Specifies the meta data for the netting cut off report including message
	 * pagination.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.NettingCutOffReportData1
	 * NettingCutOffReportData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the meta data for the netting cut off report including message pagination."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReportData = new MMMessageBuildingBlock() {
		{
			xmlTag = "RptData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportData";
			definition = "Specifies the meta data for the netting cut off report including message pagination.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> NettingCutOffReportData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NettingCutOffReferenceDataReportV01.class.getMethod("getReportData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<CutOffData1> participantNettingCutOffData;
	/**
	 * Provides the latest information related to the status of a netting cut
	 * off held at a central system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CutOffData1
	 * CutOffData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtcptNetgCutOffData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParticipantNettingCutOffData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the latest information related to the status of a netting cut off held at a central system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmParticipantNettingCutOffData = new MMMessageBuildingBlock() {
		{
			xmlTag = "PtcptNetgCutOffData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParticipantNettingCutOffData";
			definition = "Provides the latest information related to the status of a netting cut off held at a central system.";
			minOccurs = 1;
			complexType_lazy = () -> CutOffData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NettingCutOffReferenceDataReportV01.class.getMethod("getParticipantNettingCutOffData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * Additional information that cannot be captured in the structured elements
	 * and/or any other specific block.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NettingCutOffReferenceDataReportV01.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NettingCutOffReferenceDataReportV01";
				definition = "The Netting Cut Off Reference Data Report message is sent to a participant by a central system to provide details of scheduled, changed, existing and previous netting cut off data held at a central system.";
				messageSet_lazy = () -> Arrays.asList(PostTradeForeignExchangeISOLatestversion.mmObject(), PostTradeForeignExchangeMaintenance20162017andSupplement.mmObject());
				rootElement = "Document";
				xmlTag = "NetgCutOffRefDataRpt";
				businessArea_lazy = () -> ReferenceDataLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.reda.NettingCutOffReferenceDataReportV01.mmReportData,
						com.tools20022.repository.area.reda.NettingCutOffReferenceDataReportV01.mmParticipantNettingCutOffData, com.tools20022.repository.area.reda.NettingCutOffReferenceDataReportV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "reda";
						messageFunctionality = "061";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return NettingCutOffReferenceDataReportV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "RptData", required = true)
	public NettingCutOffReportData1 getReportData() {
		return reportData;
	}

	public void setReportData(NettingCutOffReportData1 reportData) {
		this.reportData = reportData;
	}

	@XmlElement(name = "PtcptNetgCutOffData", required = true)
	public List<CutOffData1> getParticipantNettingCutOffData() {
		return participantNettingCutOffData;
	}

	public void setParticipantNettingCutOffData(List<CutOffData1> participantNettingCutOffData) {
		this.participantNettingCutOffData = participantNettingCutOffData;
	}

	@XmlElement(name = "SplmtryData")
	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:reda.061.01.01")
	static public class Document {
		@XmlElement(name = "NetgCutOffRefDataRpt", required = true)
		public NettingCutOffReferenceDataReportV01 messageBody;
	}
}