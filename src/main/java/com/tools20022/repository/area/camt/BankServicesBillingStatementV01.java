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

package com.tools20022.repository.area.camt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.repository.area.CashManagementPreviousVersion;
import com.tools20022.repository.msg.ReportHeader3;
import com.tools20022.repository.msg.StatementGroup1;
import com.tools20022.repository.msgset.BankServicesBillingISOPreviousversion;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Scope The BankServicesBillingStatement message is used to send from a
 * Financial Institution (FI) to its wholesale customers (corporations,
 * governments, institutions, etc.), information describing the FI’s billing of
 * services rendered in the form of an electronic statement in a standardised
 * format. The BankServicesBillingStatement is a periodic (usually end of month)
 * recounting of all service chargeable events that occurred during a reporting
 * cycle, typically a calendar month, along with detailed tax and currency
 * translation information. Account balance information, although strongly
 * recommended, is not required. Usage The BankServicesBillingStatement message
 * is designed to provide details related to invoices (or an advice of debit)
 * which a financial institution may supply to its customers. The
 * BankServicesBillingStatement is not expressly designed to be an invoice, nor
 * to replace invoices currently in use. The message may be used as an invoice
 * by agreement between the sender and the receiver. No regulatory or
 * legislative requirements were considered when creating this message standard.
 * Users of the BankServicesBillingStatment message are cautioned to be aware of
 * any regulatory or legal requirement for invoices before replacing existing
 * invoices. The BankServicesBillingStatement message can supply the detail
 * supporting separate invoices or debits but it is not the invoice or advice of
 * debit of record. The BankServicesBillingStatement message must accurately
 * reflect all the charge and tax related events that occurred during the
 * calendar month and how the FI and taxing authorities were compensated for
 * these events. The BSB does not ask the Financial Institution to revise its
 * established pricing and billing procedures. How, when and what the customer
 * is actually charged for remains in place. The BankServicesBillingStatement
 * message asks the Financial Institution to aggregate and report what actually
 * happened during the calendar month. The BankServicesBillingStatement message
 * is intended for use with the ISO 20022 Business Application Header.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementPreviousVersion
 * CashManagementPreviousVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.BankServicesBillingISOPreviousversion
 * BankServicesBillingISOPreviousversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "BkSvcsBllgStmt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankServicesBillingStatementV01#ReportHeader
 * BankServicesBillingStatementV01.ReportHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankServicesBillingStatementV01#BillingStatementGroup
 * BankServicesBillingStatementV01.BillingStatementGroup}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} =
 * {@linkplain com.tools20022.repository.area.camt.BankServicesBillingStatementV01#identifier
 * BankServicesBillingStatementV01.identifier}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BankServicesBillingStatementV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\nThe BankServicesBillingStatement message is used to send from a Financial Institution (FI) to its wholesale customers (corporations, governments, institutions, etc.), information describing the FI’s billing of services rendered in the form of an electronic statement in a standardised format. The BankServicesBillingStatement is a periodic (usually end of month) recounting of all service chargeable events that occurred during a reporting cycle, typically a calendar month, along with detailed tax and currency translation information. Account balance information, although strongly recommended, is not required.\nUsage\nThe BankServicesBillingStatement message is designed to provide details related to invoices (or an advice of debit) which a financial institution may supply to its customers. The BankServicesBillingStatement is not expressly designed to be an invoice, nor to replace invoices currently in use. The message may be used as an invoice by agreement between the sender and the receiver. No regulatory or legislative requirements were considered when creating this message standard. Users of the BankServicesBillingStatment message are cautioned to be aware of any regulatory or legal requirement for invoices before replacing existing invoices.\nThe BankServicesBillingStatement message can supply the detail supporting separate invoices or debits but it is not the\ninvoice or advice of debit of record. The BankServicesBillingStatement message must accurately reflect all the charge and tax related events that occurred during the calendar month and how the FI and taxing authorities were compensated\nfor these events. The BSB does not ask the Financial Institution to revise its established pricing and billing procedures. \nHow, when and what the customer is actually charged for remains in place. The BankServicesBillingStatement message asks the Financial Institution to aggregate and report what actually happened during the calendar month.\nThe BankServicesBillingStatement message is intended for use with the ISO 20022 Business Application Header."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankServicesBillingStatementV02
 * BankServicesBillingStatementV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class BankServicesBillingStatementV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Provides header details on the billing statement report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.ReportHeader3
	 * ReportHeader3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptHdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides header details on the billing statement report."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.BankServicesBillingStatementV02#ReportHeader
	 * BankServicesBillingStatementV02.ReportHeader}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock ReportHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "RptHdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportHeader";
			definition = "Provides header details on the billing statement report.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.BankServicesBillingStatementV02.ReportHeader);
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> ReportHeader3.mmObject();
		}
	};
	/**
	 * Group of bank services billing statements with the same sender and
	 * receiver characteristics.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.StatementGroup1
	 * StatementGroup1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BllgStmtGrp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BillingStatementGroup"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Group of bank services billing statements with the same sender and receiver characteristics."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.BankServicesBillingStatementV02#BillingStatementGroup
	 * BankServicesBillingStatementV02.BillingStatementGroup}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock BillingStatementGroup = new MMMessageBuildingBlock() {
		{
			xmlTag = "BllgStmtGrp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BillingStatementGroup";
			definition = "Group of bank services billing statements with the same sender and receiver characteristics.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.BankServicesBillingStatementV02.BillingStatementGroup);
			minOccurs = 1;
			complexType_lazy = () -> StatementGroup1.mmObject();
		}
	};
	/**
	 * An instance of MessageDefinitionIdentifier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getVersion
	 * version} = "01"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getBusinessArea
	 * businessArea} = "camt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getMessageFunctionality
	 * messageFunctionality} = "086"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getFlavour
	 * flavour} = "001"</li>
	 * </ul>
	 */
	public static final MMMessageDefinitionIdentifier identifier = new MMMessageDefinitionIdentifier() {
		{
			businessArea = "camt";
			messageFunctionality = "086";
			version = "01";
			flavour = "001";
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BankServicesBillingStatementV01";
				definition = "Scope\nThe BankServicesBillingStatement message is used to send from a Financial Institution (FI) to its wholesale customers (corporations, governments, institutions, etc.), information describing the FI’s billing of services rendered in the form of an electronic statement in a standardised format. The BankServicesBillingStatement is a periodic (usually end of month) recounting of all service chargeable events that occurred during a reporting cycle, typically a calendar month, along with detailed tax and currency translation information. Account balance information, although strongly recommended, is not required.\nUsage\nThe BankServicesBillingStatement message is designed to provide details related to invoices (or an advice of debit) which a financial institution may supply to its customers. The BankServicesBillingStatement is not expressly designed to be an invoice, nor to replace invoices currently in use. The message may be used as an invoice by agreement between the sender and the receiver. No regulatory or legislative requirements were considered when creating this message standard. Users of the BankServicesBillingStatment message are cautioned to be aware of any regulatory or legal requirement for invoices before replacing existing invoices.\nThe BankServicesBillingStatement message can supply the detail supporting separate invoices or debits but it is not the\ninvoice or advice of debit of record. The BankServicesBillingStatement message must accurately reflect all the charge and tax related events that occurred during the calendar month and how the FI and taxing authorities were compensated\nfor these events. The BSB does not ask the Financial Institution to revise its established pricing and billing procedures. \nHow, when and what the customer is actually charged for remains in place. The BankServicesBillingStatement message asks the Financial Institution to aggregate and report what actually happened during the calendar month.\nThe BankServicesBillingStatement message is intended for use with the ISO 20022 Business Application Header.";
				nextVersions_lazy = () -> Arrays.asList(BankServicesBillingStatementV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject(), BankServicesBillingISOPreviousversion.mmObject());
				rootElement = "Document";
				xmlTag = "BkSvcsBllgStmt";
				businessArea_lazy = () -> CashManagementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.BankServicesBillingStatementV01.ReportHeader, com.tools20022.repository.area.camt.BankServicesBillingStatementV01.BillingStatementGroup);
				messageDefinitionIdentifier_lazy = () -> com.tools20022.repository.area.camt.BankServicesBillingStatementV01.identifier;
			}
		});
		return mmObject_lazy.get();
	}
}