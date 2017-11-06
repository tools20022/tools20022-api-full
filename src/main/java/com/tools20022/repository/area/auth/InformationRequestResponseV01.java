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

package com.tools20022.repository.area.auth;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.repository.area.AuthoritiesLatestVersion;
import com.tools20022.repository.choice.SearchCriteria1Choice;
import com.tools20022.repository.codeset.StatusResponse1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.ReturnIndicator1;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.AuthoritiesFinancialInvestigationsISOLatestversion;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * This message is sent by the financial institution to the authorities (police,
 * customs, tax authorities, enforcement authorities) to provide a part or all
 * of the requested information.<br>
 * The financial institution previously received a request for financial
 * information in the scope of a financial investigation.<br>
 * <br>
 * Depending on whether the response can be provided STP within the authorities
 * financial investigations messages, the requested information may be <br>
 * • provided in part or in full within the response message itself, or <br>
 * • only referred to in the response message
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AuthoritiesLatestVersion
 * AuthoritiesLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.AuthoritiesFinancialInvestigationsISOLatestversion
 * AuthoritiesFinancialInvestigationsISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "InfReqRspn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InformationRequestResponseV01#mmResponseIdentification
 * InformationRequestResponseV01.mmResponseIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InformationRequestResponseV01#mmInvestigationIdentification
 * InformationRequestResponseV01.mmInvestigationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InformationRequestResponseV01#mmResponseStatus
 * InformationRequestResponseV01.mmResponseStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InformationRequestResponseV01#mmSearchCriteria
 * InformationRequestResponseV01.mmSearchCriteria}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InformationRequestResponseV01#mmReturnIndicator
 * InformationRequestResponseV01.mmReturnIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InformationRequestResponseV01#mmSupplementaryData
 * InformationRequestResponseV01.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code auth.002.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InformationRequestResponseV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "This message is sent by the financial institution to the authorities (police, customs, tax authorities, enforcement authorities) to provide a part or all of the requested information.\r\nThe financial institution previously received a request for financial information in the scope of a financial investigation.\r\n\r\nDepending on whether the response can be provided STP within the authorities financial investigations messages, the requested information may be \r\n•\tprovided in part or in full within the response message itself, or \r\n•\tonly referred to in the response message"
 * </li>
 * </ul>
 */
public class InformationRequestResponseV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected Max35Text responseIdentification;
	/**
	 * Unique identification for the specific investigation as know by the
	 * responding party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RspnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponseIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification for the specific investigation as know by the responding party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmResponseIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "RspnId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponseIdentification";
			definition = "Unique identification for the specific investigation as know by the responding party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text investigationIdentification;
	/**
	 * Unique identification for the specific investigation as known by the
	 * requesting party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstgtnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestigationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification for the specific investigation as known by the requesting party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmInvestigationIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "InvstgtnId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestigationIdentification";
			definition = "Unique identification for the specific investigation as known by the requesting party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected StatusResponse1Code responseStatus;
	/**
	 * Provides the status of the response.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.StatusResponse1Code
	 * StatusResponse1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RspnSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponseStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the status of the response."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmResponseStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "RspnSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponseStatus";
			definition = "Provides the status of the response.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> StatusResponse1Code.mmObject();
		}
	};
	protected SearchCriteria1Choice searchCriteria;
	/**
	 * Specifies the the search criteria for the financial institution to
	 * perform the search on. The search criteria can be an account, a customer
	 * identification or a payment instrument type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SearchCriteria1Choice
	 * SearchCriteria1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SchCrit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SearchCriteria"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the the search criteria for the financial institution to perform the search on. The search criteria can be an account, a customer identification or a payment instrument type."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSearchCriteria = new MMMessageBuildingBlock() {
		{
			xmlTag = "SchCrit";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SearchCriteria";
			definition = "Specifies the the search criteria for the financial institution to perform the search on. The search criteria can be an account, a customer identification or a payment instrument type.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SearchCriteria1Choice.mmObject();
		}
	};
	protected List<ReturnIndicator1> returnIndicator;
	/**
	 * Provides the return indicators and the investigation result.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ReturnIndicator1
	 * ReturnIndicator1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RtrInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the return indicators and the investigation result."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReturnIndicator = new MMMessageBuildingBlock() {
		{
			xmlTag = "RtrInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnIndicator";
			definition = "Provides the return indicators and the investigation result.";
			minOccurs = 1;
			complexType_lazy = () -> ReturnIndicator1.mmObject();
		}
	};
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * Additional information that can not be captured in the structured fields
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
	 * "Additional information that can not be captured in the structured fields and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InformationRequestResponseV01";
				definition = "This message is sent by the financial institution to the authorities (police, customs, tax authorities, enforcement authorities) to provide a part or all of the requested information.\r\nThe financial institution previously received a request for financial information in the scope of a financial investigation.\r\n\r\nDepending on whether the response can be provided STP within the authorities financial investigations messages, the requested information may be \r\n•\tprovided in part or in full within the response message itself, or \r\n•\tonly referred to in the response message";
				messageSet_lazy = () -> Arrays.asList(AuthoritiesFinancialInvestigationsISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "InfReqRspn";
				businessArea_lazy = () -> AuthoritiesLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.InformationRequestResponseV01.mmResponseIdentification,
						com.tools20022.repository.area.auth.InformationRequestResponseV01.mmInvestigationIdentification, com.tools20022.repository.area.auth.InformationRequestResponseV01.mmResponseStatus,
						com.tools20022.repository.area.auth.InformationRequestResponseV01.mmSearchCriteria, com.tools20022.repository.area.auth.InformationRequestResponseV01.mmReturnIndicator,
						com.tools20022.repository.area.auth.InformationRequestResponseV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "auth";
						messageFunctionality = "002";
						version = "01";
						flavour = "001";
					}
				};
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getResponseIdentification() {
		return responseIdentification;
	}

	public void setResponseIdentification(Max35Text responseIdentification) {
		this.responseIdentification = responseIdentification;
	}

	public Max35Text getInvestigationIdentification() {
		return investigationIdentification;
	}

	public void setInvestigationIdentification(Max35Text investigationIdentification) {
		this.investigationIdentification = investigationIdentification;
	}

	public StatusResponse1Code getResponseStatus() {
		return responseStatus;
	}

	public void setResponseStatus(StatusResponse1Code responseStatus) {
		this.responseStatus = responseStatus;
	}

	public SearchCriteria1Choice getSearchCriteria() {
		return searchCriteria;
	}

	public void setSearchCriteria(SearchCriteria1Choice searchCriteria) {
		this.searchCriteria = searchCriteria;
	}

	public List<ReturnIndicator1> getReturnIndicator() {
		return returnIndicator;
	}

	public void setReturnIndicator(List<ReturnIndicator1> returnIndicator) {
		this.returnIndicator = returnIndicator;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}
}