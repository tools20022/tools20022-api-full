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

package com.tools20022.repository.msgset;

import com.tools20022.metamodel.MMMessageSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * This is Funds SR2018. Maintenance is on the funds transfer (sese) messages
 * only.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV08
 * ReversalOfTransferOutConfirmationV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV08
 * TransferInConfirmationV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV08
 * PortfolioTransferInstructionV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV08
 * PortfolioTransferCancellationRequestV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV08
 * TransferOutCancellationRequestV08}</li>
 * <li>{@linkplain com.tools20022.repository.area.sese.TransferInInstructionV08
 * TransferInInstructionV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV08
 * PortfolioTransferConfirmationV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV06
 * AccountHoldingInformationV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV08
 * TransferOutConfirmationV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV08
 * TransferInCancellationRequestV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV08
 * TransferOutInstructionV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV06
 * TransferCancellationStatusReportV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV05
 * AccountHoldingInformationRequestV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV08
 * ReversalOfTransferInConfirmationV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForTransferStatusReportV06
 * RequestForTransferStatusReportV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV06
 * TransferInstructionStatusReportV06}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelCatalogueEntry#getBusinessProcessCatalogue
 * businessProcessCatalogue} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#catalogue
 * GeneratedRepository.catalogue}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "_SR2018_Investment Funds - Maintenance 2017-2018"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "This is Funds SR2018. Maintenance is on the funds transfer (sese) messages only."
 * </li>
 * </ul>
 */
public class _SR2018_InvestmentFundsMaintenance20172018 {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "_SR2018_Investment Funds - Maintenance 2017-2018";
				definition = "This is Funds SR2018. Maintenance is on the funds transfer (sese) messages only.";
				messageDefinition_lazy = () -> Arrays.asList(ReversalOfTransferOutConfirmationV08.mmObject(), TransferInConfirmationV08.mmObject(), PortfolioTransferInstructionV08.mmObject(),
						PortfolioTransferCancellationRequestV08.mmObject(), TransferOutCancellationRequestV08.mmObject(), TransferInInstructionV08.mmObject(), PortfolioTransferConfirmationV08.mmObject(),
						AccountHoldingInformationV06.mmObject(), TransferOutConfirmationV08.mmObject(), TransferInCancellationRequestV08.mmObject(), TransferOutInstructionV08.mmObject(), TransferCancellationStatusReportV06.mmObject(),
						AccountHoldingInformationRequestV05.mmObject(), ReversalOfTransferInConfirmationV08.mmObject(), RequestForTransferStatusReportV06.mmObject(), TransferInstructionStatusReportV06.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}