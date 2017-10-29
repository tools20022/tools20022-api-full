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
import com.tools20022.repository.datatype.ISOYearMonth;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies the implementation and version.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.MarketPracticeVersion1#Name
 * MarketPracticeVersion1.Name}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketPracticeVersion1#Date
 * MarketPracticeVersion1.Date}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketPracticeVersion1#Number
 * MarketPracticeVersion1.Number}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04#MarketPracticeVersion
 * AccountDetailsConfirmationV04.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV04#MarketPracticeVersion
 * AccountModificationInstructionV04.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV04#MarketPracticeVersion
 * AccountOpeningInstructionV04.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV05#MarketPracticeVersion
 * ReversalOfTransferInConfirmationV05.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV05#MarketPracticeVersion
 * TransferInConfirmationV05.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV04#MarketPracticeVersion
 * TransferInstructionStatusReportV04.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03#MarketPracticeVersion
 * AccountHoldingInformationRequestV03.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV05#MarketPracticeVersion
 * TransferOutInstructionV05.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV04#MarketPracticeVersion
 * AccountHoldingInformationV04.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV05#MarketPracticeVersion
 * PortfolioTransferCancellationRequestV05.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV04#MarketPracticeVersion
 * TransferCancellationStatusReportV04.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV05#MarketPracticeVersion
 * PortfolioTransferInstructionV05.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV05#MarketPracticeVersion
 * TransferInInstructionV05.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV05#MarketPracticeVersion
 * TransferInCancellationRequestV05.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05#MarketPracticeVersion
 * PortfolioTransferConfirmationV05.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV05#MarketPracticeVersion
 * TransferOutConfirmationV05.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForTransferStatusReportV04#MarketPracticeVersion
 * RequestForTransferStatusReportV04.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV05#MarketPracticeVersion
 * ReversalOfTransferOutConfirmationV05.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV05#MarketPracticeVersion
 * TransferOutCancellationRequestV05.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV04#MarketPracticeVersion
 * AccountManagementStatusReportV04.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV05#MarketPracticeVersion
 * AccountOpeningInstructionV05.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV05#MarketPracticeVersion
 * AccountModificationInstructionV05.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#MarketPracticeVersion
 * AccountDetailsConfirmationV05.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV06#MarketPracticeVersion
 * PortfolioTransferCancellationRequestV06.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06#MarketPracticeVersion
 * PortfolioTransferConfirmationV06.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV06#MarketPracticeVersion
 * PortfolioTransferInstructionV06.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV06#MarketPracticeVersion
 * TransferInInstructionV06.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV06#MarketPracticeVersion
 * TransferOutConfirmationV06.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV06#MarketPracticeVersion
 * TransferOutInstructionV06.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV06#MarketPracticeVersion
 * TransferOutCancellationRequestV06.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV06#MarketPracticeVersion
 * TransferInConfirmationV06.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV06#MarketPracticeVersion
 * ReversalOfTransferOutConfirmationV06.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV06#MarketPracticeVersion
 * TransferInCancellationRequestV06.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV06#MarketPracticeVersion
 * ReversalOfTransferInConfirmationV06.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV07#MarketPracticeVersion
 * PortfolioTransferInstructionV07.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV07#MarketPracticeVersion
 * ReversalOfTransferOutConfirmationV07.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV07#MarketPracticeVersion
 * TransferOutCancellationRequestV07.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV05#MarketPracticeVersion
 * AccountHoldingInformationV05.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV07#MarketPracticeVersion
 * PortfolioTransferCancellationRequestV07.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV05#MarketPracticeVersion
 * TransferInstructionStatusReportV05.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV07#MarketPracticeVersion
 * TransferInConfirmationV07.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV06#MarketPracticeVersion
 * AccountOpeningInstructionV06.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV07#MarketPracticeVersion
 * TransferOutConfirmationV07.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForTransferStatusReportV05#MarketPracticeVersion
 * RequestForTransferStatusReportV05.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#MarketPracticeVersion
 * AccountDetailsConfirmationV06.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV07#MarketPracticeVersion
 * TransferInCancellationRequestV07.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07#MarketPracticeVersion
 * PortfolioTransferConfirmationV07.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV05#MarketPracticeVersion
 * TransferCancellationStatusReportV05.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV07#MarketPracticeVersion
 * TransferOutInstructionV07.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV05#MarketPracticeVersion
 * AccountManagementStatusReportV05.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV06#MarketPracticeVersion
 * AccountModificationInstructionV06.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV07#MarketPracticeVersion
 * TransferInInstructionV07.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04#MarketPracticeVersion
 * AccountHoldingInformationRequestV04.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV07#MarketPracticeVersion
 * ReversalOfTransferInConfirmationV07.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#MarketPracticeVersion
 * AccountDetailsConfirmationV07.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV07#MarketPracticeVersion
 * AccountModificationInstructionV07.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV07#MarketPracticeVersion
 * AccountOpeningInstructionV07.MarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV06#MarketPracticeVersion
 * AccountManagementStatusReportV06.MarketPracticeVersion}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MarketPracticeVersion1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the implementation and version."</li>
 * </ul>
 */
public class MarketPracticeVersion1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Market practice, for example, “UKTRANSFERS”, “FINDELSLT”.
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
	 * {@linkplain com.tools20022.repository.msg.MarketPracticeVersion1
	 * MarketPracticeVersion1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market practice, for example, “UKTRANSFERS”, “FINDELSLT”."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute Name = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MarketPracticeVersion1.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Market practice, for example, “UKTRANSFERS”, “FINDELSLT”.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Year and month, for example, 2013-06
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISOYearMonth ISOYearMonth}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarketPracticeVersion1
	 * MarketPracticeVersion1}</li>
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
	 * definition} = "Year and month, for example, 2013-06"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Date = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MarketPracticeVersion1.mmObject();
			isDerived = false;
			xmlTag = "Dt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Date";
			definition = "Year and month, for example, 2013-06";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISOYearMonth.mmObject();
		}
	};
	/**
	 * Version of the market practice.
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
	 * {@linkplain com.tools20022.repository.msg.MarketPracticeVersion1
	 * MarketPracticeVersion1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Number"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Version of the market practice."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Number = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MarketPracticeVersion1.mmObject();
			isDerived = false;
			xmlTag = "Nb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Number";
			definition = "Version of the market practice.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MarketPracticeVersion1.Name, com.tools20022.repository.msg.MarketPracticeVersion1.Date, com.tools20022.repository.msg.MarketPracticeVersion1.Number);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04.MarketPracticeVersion,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV04.MarketPracticeVersion, com.tools20022.repository.area.acmt.AccountOpeningInstructionV04.MarketPracticeVersion,
						com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV05.MarketPracticeVersion, com.tools20022.repository.area.sese.TransferInConfirmationV05.MarketPracticeVersion,
						com.tools20022.repository.area.sese.TransferInstructionStatusReportV04.MarketPracticeVersion, com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03.MarketPracticeVersion,
						com.tools20022.repository.area.sese.TransferOutInstructionV05.MarketPracticeVersion, com.tools20022.repository.area.sese.AccountHoldingInformationV04.MarketPracticeVersion,
						com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV05.MarketPracticeVersion, com.tools20022.repository.area.sese.TransferCancellationStatusReportV04.MarketPracticeVersion,
						com.tools20022.repository.area.sese.PortfolioTransferInstructionV05.MarketPracticeVersion, com.tools20022.repository.area.sese.TransferInInstructionV05.MarketPracticeVersion,
						com.tools20022.repository.area.sese.TransferInCancellationRequestV05.MarketPracticeVersion, com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05.MarketPracticeVersion,
						com.tools20022.repository.area.sese.TransferOutConfirmationV05.MarketPracticeVersion, com.tools20022.repository.area.sese.RequestForTransferStatusReportV04.MarketPracticeVersion,
						com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV05.MarketPracticeVersion, com.tools20022.repository.area.sese.TransferOutCancellationRequestV05.MarketPracticeVersion,
						com.tools20022.repository.area.acmt.AccountManagementStatusReportV04.MarketPracticeVersion, com.tools20022.repository.area.acmt.AccountOpeningInstructionV05.MarketPracticeVersion,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV05.MarketPracticeVersion, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05.MarketPracticeVersion,
						com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV06.MarketPracticeVersion, com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06.MarketPracticeVersion,
						com.tools20022.repository.area.sese.PortfolioTransferInstructionV06.MarketPracticeVersion, com.tools20022.repository.area.sese.TransferInInstructionV06.MarketPracticeVersion,
						com.tools20022.repository.area.sese.TransferOutConfirmationV06.MarketPracticeVersion, com.tools20022.repository.area.sese.TransferOutInstructionV06.MarketPracticeVersion,
						com.tools20022.repository.area.sese.TransferOutCancellationRequestV06.MarketPracticeVersion, com.tools20022.repository.area.sese.TransferInConfirmationV06.MarketPracticeVersion,
						com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV06.MarketPracticeVersion, com.tools20022.repository.area.sese.TransferInCancellationRequestV06.MarketPracticeVersion,
						com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV06.MarketPracticeVersion, com.tools20022.repository.area.sese.PortfolioTransferInstructionV07.MarketPracticeVersion,
						com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV07.MarketPracticeVersion, com.tools20022.repository.area.sese.TransferOutCancellationRequestV07.MarketPracticeVersion,
						com.tools20022.repository.area.sese.AccountHoldingInformationV05.MarketPracticeVersion, com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV07.MarketPracticeVersion,
						com.tools20022.repository.area.sese.TransferInstructionStatusReportV05.MarketPracticeVersion, com.tools20022.repository.area.sese.TransferInConfirmationV07.MarketPracticeVersion,
						com.tools20022.repository.area.acmt.AccountOpeningInstructionV06.MarketPracticeVersion, com.tools20022.repository.area.sese.TransferOutConfirmationV07.MarketPracticeVersion,
						com.tools20022.repository.area.sese.RequestForTransferStatusReportV05.MarketPracticeVersion, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06.MarketPracticeVersion,
						com.tools20022.repository.area.sese.TransferInCancellationRequestV07.MarketPracticeVersion, com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07.MarketPracticeVersion,
						com.tools20022.repository.area.sese.TransferCancellationStatusReportV05.MarketPracticeVersion, com.tools20022.repository.area.sese.TransferOutInstructionV07.MarketPracticeVersion,
						com.tools20022.repository.area.acmt.AccountManagementStatusReportV05.MarketPracticeVersion, com.tools20022.repository.area.acmt.AccountModificationInstructionV06.MarketPracticeVersion,
						com.tools20022.repository.area.sese.TransferInInstructionV07.MarketPracticeVersion, com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04.MarketPracticeVersion,
						com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV07.MarketPracticeVersion, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07.MarketPracticeVersion,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV07.MarketPracticeVersion, com.tools20022.repository.area.acmt.AccountOpeningInstructionV07.MarketPracticeVersion,
						com.tools20022.repository.area.acmt.AccountManagementStatusReportV06.MarketPracticeVersion);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MarketPracticeVersion1";
				definition = "Identifies the implementation and version.";
			}
		});
		return mmObject_lazy.get();
	}
}