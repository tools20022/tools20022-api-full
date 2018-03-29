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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.reda.PartyAuditTrailReportV02;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ErrorHandling4;
import com.tools20022.repository.msg.PartyAuditTrailReport3;
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
 * Used to report between the party reference data or an operational error.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyAuditTrailOrOperationalError3Choice#mmPartyAuditTrailReport
 * PartyAuditTrailOrOperationalError3Choice.mmPartyAuditTrailReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyAuditTrailOrOperationalError3Choice#mmOperationalError
 * PartyAuditTrailOrOperationalError3Choice.mmOperationalError}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PartyAuditTrailReportV02#mmReportOrError
 * PartyAuditTrailReportV02.mmReportOrError}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartyAuditTrailOrOperationalError3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Used to report between the party reference data or an operational error."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.PartyAuditTrailOrOperationalError2Choice
 * PartyAuditTrailOrOperationalError2Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PartyAuditTrailOrOperationalError3Choice", propOrder = {"partyAuditTrailReport", "operationalError"})
public class PartyAuditTrailOrOperationalError3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PtyAudtTrlRpt", required = true)
	protected List<PartyAuditTrailReport3> partyAuditTrailReport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyAuditTrailReport3
	 * PartyAuditTrailReport3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PartyAuditTrailOrOperationalError3Choice
	 * PartyAuditTrailOrOperationalError3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtyAudtTrlRpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyAuditTrailReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Report information about party reference data."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.PartyAuditTrailOrOperationalError2Choice#mmPartyAuditTrailReport
	 * PartyAuditTrailOrOperationalError2Choice.mmPartyAuditTrailReport}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PartyAuditTrailOrOperationalError3Choice, List<PartyAuditTrailReport3>> mmPartyAuditTrailReport = new MMMessageAssociationEnd<PartyAuditTrailOrOperationalError3Choice, List<PartyAuditTrailReport3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.PartyAuditTrailOrOperationalError3Choice.mmObject();
			isDerived = false;
			xmlTag = "PtyAudtTrlRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyAuditTrailReport";
			definition = "Report information about party reference data.";
			previousVersion_lazy = () -> PartyAuditTrailOrOperationalError2Choice.mmPartyAuditTrailReport;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyAuditTrailReport3.mmObject();
		}

		@Override
		public List<PartyAuditTrailReport3> getValue(PartyAuditTrailOrOperationalError3Choice obj) {
			return obj.getPartyAuditTrailReport();
		}

		@Override
		public void setValue(PartyAuditTrailOrOperationalError3Choice obj, List<PartyAuditTrailReport3> value) {
			obj.setPartyAuditTrailReport(value);
		}
	};
	@XmlElement(name = "OprlErr", required = true)
	protected List<ErrorHandling4> operationalError;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ErrorHandling4
	 * ErrorHandling4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PartyAuditTrailOrOperationalError3Choice
	 * PartyAuditTrailOrOperationalError3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OprlErr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OperationalError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Operational error resulting from a rejection."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.PartyAuditTrailOrOperationalError2Choice#mmOperationalError
	 * PartyAuditTrailOrOperationalError2Choice.mmOperationalError}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PartyAuditTrailOrOperationalError3Choice, List<ErrorHandling4>> mmOperationalError = new MMMessageAssociationEnd<PartyAuditTrailOrOperationalError3Choice, List<ErrorHandling4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.PartyAuditTrailOrOperationalError3Choice.mmObject();
			isDerived = false;
			xmlTag = "OprlErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OperationalError";
			definition = "Operational error resulting from a rejection.";
			previousVersion_lazy = () -> PartyAuditTrailOrOperationalError2Choice.mmOperationalError;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ErrorHandling4.mmObject();
		}

		@Override
		public List<ErrorHandling4> getValue(PartyAuditTrailOrOperationalError3Choice obj) {
			return obj.getOperationalError();
		}

		@Override
		public void setValue(PartyAuditTrailOrOperationalError3Choice obj, List<ErrorHandling4> value) {
			obj.setOperationalError(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PartyAuditTrailOrOperationalError3Choice.mmPartyAuditTrailReport,
						com.tools20022.repository.choice.PartyAuditTrailOrOperationalError3Choice.mmOperationalError);
				messageBuildingBlock_lazy = () -> Arrays.asList(PartyAuditTrailReportV02.mmReportOrError);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "PartyAuditTrailOrOperationalError3Choice";
				definition = "Used to report between the party reference data or an operational error.";
				previousVersion_lazy = () -> PartyAuditTrailOrOperationalError2Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<PartyAuditTrailReport3> getPartyAuditTrailReport() {
		return partyAuditTrailReport == null ? partyAuditTrailReport = new ArrayList<>() : partyAuditTrailReport;
	}

	public PartyAuditTrailOrOperationalError3Choice setPartyAuditTrailReport(List<PartyAuditTrailReport3> partyAuditTrailReport) {
		this.partyAuditTrailReport = Objects.requireNonNull(partyAuditTrailReport);
		return this;
	}

	public List<ErrorHandling4> getOperationalError() {
		return operationalError == null ? operationalError = new ArrayList<>() : operationalError;
	}

	public PartyAuditTrailOrOperationalError3Choice setOperationalError(List<ErrorHandling4> operationalError) {
		this.operationalError = Objects.requireNonNull(operationalError);
		return this;
	}
}