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
import com.tools20022.repository.msg.FundProcessingPassport1;
import com.tools20022.repository.msg.MessageIdentification1;
import com.tools20022.repository.msgset.InvestmentFundsISOLatestversion;
import com.tools20022.repository.msgset.InvestmentFundsISOPreviousversion;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * <b>Scope</b><br>
 * A report provider, for example, a fund promoter, fund management company,
 * transfer agent, or market data provider, sends the
 * FundProcessingPassportReport message to the report recipient, for, a
 * professional investor, investment fund distributor, market data provider,
 * regulator or other interested party to provide the key reference data for
 * financial instruments to facilitate trading.<br>
 * <b>Usage</b><br>
 * A unique FundProcessingPassportReport should be prepared for each class of
 * unit/share (for which an individual ISIN should have been allocated), in
 * respect of its "home" market.<br>
 * The FundProcessingPassportReport may be used in various models or
 * environments:<br>
 * - stand alone environment, for example, initiated by the Report Provider
 * (fund promoter, fund manager and / or reference data vendors) sent on a
 * regular frequency, or when changes are needed.<br>
 * - in a request / response environment, with the InvestmentFundReportRequest,
 * for example, initiated by report users (data vendors, professional investors,
 * regulators or investment fund distributors) in enabling the user to control
 * the flow and updates of information.<br>
 * - in a reference data vendor environment, for example, market infrastructure
 * and reference data providers may collate and store all fund processing
 * passport information centrally for access via database or regular
 * distribution information. A reference data vendor may assume the role of both
 * report provider and report user.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code reda.004.001.02}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.ReferenceDataLatestVersion
 * ReferenceDataLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.InvestmentFundsISOPreviousversion
 * InvestmentFundsISOPreviousversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.InvestmentFundsISOLatestversion
 * InvestmentFundsISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "FndPrcgPsptRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.FundProcessingPassportReportV02#mmMessageIdentification
 * FundProcessingPassportReportV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.FundProcessingPassportReportV02#mmFundProcessingPassport
 * FundProcessingPassportReportV02.mmFundProcessingPassport}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FundProcessingPassportReportV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nA report provider, for example, a fund promoter, fund management company, transfer agent, or market data provider, sends the FundProcessingPassportReport message to the report recipient, for, a professional investor, investment fund distributor, market data provider, regulator or other interested party to provide the key reference data for financial instruments to facilitate trading.\r\nUsage\r\nA unique FundProcessingPassportReport should be prepared for each class of unit/share (for which an individual ISIN should have been allocated), in respect of its \"home\" market.\r\nThe FundProcessingPassportReport may be used in various models or environments:\r\n- stand alone environment, for example, initiated by the Report Provider (fund promoter, fund manager and / or reference data vendors) sent on a regular frequency, or when changes are needed.\r\n- in a request / response environment, with the InvestmentFundReportRequest, for example, initiated by report users (data vendors, professional investors, regulators or investment fund distributors) in enabling the user to control the flow and updates of information.\r\n- in a reference data vendor environment, for example, market infrastructure and reference data providers may collate and store all fund processing passport information centrally for access via database or regular distribution information. A reference data vendor may assume the role of both report provider and report user."
 * </li>
 * </ul>
 */
public class FundProcessingPassportReportV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected MessageIdentification1 messageIdentification;
	/**
	 * Reference that uniquely identifies a message from a business application
	 * standpoint.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference that uniquely identifies a message from a business application standpoint."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Reference that uniquely identifies a message from a business application standpoint.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}
	};
	protected List<FundProcessingPassport1> fundProcessingPassport;
	/**
	 * Fund Processing Passsport (FPP) is a fully harmonised document with all
	 * key operational information that fund promoters<br>
	 * should provide on their investment funds in order to facilitate their
	 * trading.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FundProcessingPassport1
	 * FundProcessingPassport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FPP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundProcessingPassport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "    Fund Processing Passsport (FPP) is a fully harmonised document with all key operational information that fund promoters\r\n    should provide on their investment funds in order to facilitate their trading. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmFundProcessingPassport = new MMMessageBuildingBlock() {
		{
			xmlTag = "FPP";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundProcessingPassport";
			definition = "    Fund Processing Passsport (FPP) is a fully harmonised document with all key operational information that fund promoters\r\n    should provide on their investment funds in order to facilitate their trading. ";
			minOccurs = 1;
			complexType_lazy = () -> FundProcessingPassport1.mmObject();
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FundProcessingPassportReportV02";
				definition = "Scope\r\nA report provider, for example, a fund promoter, fund management company, transfer agent, or market data provider, sends the FundProcessingPassportReport message to the report recipient, for, a professional investor, investment fund distributor, market data provider, regulator or other interested party to provide the key reference data for financial instruments to facilitate trading.\r\nUsage\r\nA unique FundProcessingPassportReport should be prepared for each class of unit/share (for which an individual ISIN should have been allocated), in respect of its \"home\" market.\r\nThe FundProcessingPassportReport may be used in various models or environments:\r\n- stand alone environment, for example, initiated by the Report Provider (fund promoter, fund manager and / or reference data vendors) sent on a regular frequency, or when changes are needed.\r\n- in a request / response environment, with the InvestmentFundReportRequest, for example, initiated by report users (data vendors, professional investors, regulators or investment fund distributors) in enabling the user to control the flow and updates of information.\r\n- in a reference data vendor environment, for example, market infrastructure and reference data providers may collate and store all fund processing passport information centrally for access via database or regular distribution information. A reference data vendor may assume the role of both report provider and report user.";
				messageSet_lazy = () -> Arrays.asList(InvestmentFundsISOPreviousversion.mmObject(), InvestmentFundsISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "FndPrcgPsptRpt";
				businessArea_lazy = () -> ReferenceDataLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(FundProcessingPassportReportV02.mmMessageIdentification, FundProcessingPassportReportV02.mmFundProcessingPassport);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "reda";
						messageFunctionality = "004";
						version = "02";
						flavour = "001";
					}
				};
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public void setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = messageIdentification;
	}

	public List<FundProcessingPassport1> getFundProcessingPassport() {
		return fundProcessingPassport;
	}

	public void setFundProcessingPassport(List<FundProcessingPassport1> fundProcessingPassport) {
		this.fundProcessingPassport = fundProcessingPassport;
	}
}