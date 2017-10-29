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
import com.tools20022.repository.choice.PartyIdentification2Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.GenericIdentification;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * References a related message or provides another reference, such as a pool
 * reference, linking a set of messages. The party which issued the related
 * reference may be the Sender of the referenced message or a party other than
 * the Sender.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalReference3#Reference
 * AdditionalReference3.Reference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalReference3#ReferenceIssuer
 * AdditionalReference3.ReferenceIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalReference3#MessageName
 * AdditionalReference3.MessageName}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.GenericIdentification
 * GenericIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.InvestmentFundReportRequestV02#PreviousReference
 * InvestmentFundReportRequestV02.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.InvestmentFundReportRequestV02#RelatedReference
 * InvestmentFundReportRequestV02.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02#RelatedReference
 * AccountDetailsConfirmationV02.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03#RelatedReference
 * AccountDetailsConfirmationV03.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01#PoolReference
 * PEPOrISAOrPortfolioInformationV01.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01#PreviousReference
 * PEPOrISAOrPortfolioInformationV01.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01#RelatedReference
 * PEPOrISAOrPortfolioInformationV01.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV02#PoolReference
 * AccountHoldingInformationV02.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV02#PreviousReference
 * AccountHoldingInformationV02.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV02#RelatedReference
 * AccountHoldingInformationV02.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV03#PoolReference
 * AccountHoldingInformationV03.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV03#PreviousReference
 * AccountHoldingInformationV03.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV03#RelatedReference
 * AccountHoldingInformationV03.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV02#RelatedReference
 * AccountManagementStatusReportV02.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV03#RelatedReference
 * AccountManagementStatusReportV03.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV02#PreviousReference
 * AccountModificationInstructionV02.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV03#PreviousReference
 * AccountModificationInstructionV03.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV02#PreviousReference
 * AccountOpeningInstructionV02.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV03#PreviousReference
 * AccountOpeningInstructionV03.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferCancellationRequestV02#PoolReference
 * PEPOrISAOrPortfolioTransferCancellationRequestV02.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferCancellationRequestV02#PreviousReference
 * PEPOrISAOrPortfolioTransferCancellationRequestV02.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferCancellationRequestV02#RelatedReference
 * PEPOrISAOrPortfolioTransferCancellationRequestV02.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV03#PoolReference
 * PortfolioTransferCancellationRequestV03.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV03#PreviousReference
 * PortfolioTransferCancellationRequestV03.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV03#RelatedReference
 * PortfolioTransferCancellationRequestV03.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV04#PoolReference
 * PortfolioTransferCancellationRequestV04.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV04#PreviousReference
 * PortfolioTransferCancellationRequestV04.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV04#RelatedReference
 * PortfolioTransferCancellationRequestV04.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferConfirmationV02#PoolReference
 * PEPOrISAOrPortfolioTransferConfirmationV02.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferConfirmationV02#PreviousReference
 * PEPOrISAOrPortfolioTransferConfirmationV02.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferConfirmationV02#RelatedReference
 * PEPOrISAOrPortfolioTransferConfirmationV02.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV03#PoolReference
 * PortfolioTransferConfirmationV03.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV03#PreviousReference
 * PortfolioTransferConfirmationV03.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV03#RelatedReference
 * PortfolioTransferConfirmationV03.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV04#PoolReference
 * PortfolioTransferConfirmationV04.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV04#PreviousReference
 * PortfolioTransferConfirmationV04.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV04#RelatedReference
 * PortfolioTransferConfirmationV04.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02#PoolReference
 * PEPOrISAOrPortfolioTransferInstructionV02.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02#PreviousReference
 * PEPOrISAOrPortfolioTransferInstructionV02.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02#RelatedReference
 * PEPOrISAOrPortfolioTransferInstructionV02.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV03#PoolReference
 * PortfolioTransferInstructionV03.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV03#PreviousReference
 * PortfolioTransferInstructionV03.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV03#RelatedReference
 * PortfolioTransferInstructionV03.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV04#PoolReference
 * PortfolioTransferInstructionV04.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV04#PreviousReference
 * PortfolioTransferInstructionV04.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV04#RelatedReference
 * PortfolioTransferInstructionV04.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV02#PoolReference
 * PriceReportCancellationV02.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV02#PreviousReference
 * PriceReportCancellationV02.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV03#PoolReference
 * PriceReportCancellationV03.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV03#PreviousReference
 * PriceReportCancellationV03.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV04#PoolReference
 * PriceReportCancellationV04.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV04#PreviousReference
 * PriceReportCancellationV04.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportV02#PoolReference
 * PriceReportV02.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportV02#PreviousReference
 * PriceReportV02.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportV02#RelatedReference
 * PriceReportV02.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportV03#PoolReference
 * PriceReportV03.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportV03#PreviousReference
 * PriceReportV03.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportV03#RelatedReference
 * PriceReportV03.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportV04#PoolReference
 * PriceReportV04.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportV04#PreviousReference
 * PriceReportV04.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportV04#RelatedReference
 * PriceReportV04.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV01#PoolReference
 * FundConfirmedCashForecastReportCancellationV01.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV01#PreviousReference
 * FundConfirmedCashForecastReportCancellationV01.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV01#RelatedReference
 * FundConfirmedCashForecastReportCancellationV01.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV02#PoolReference
 * FundConfirmedCashForecastReportCancellationV02.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV02#PreviousReference
 * FundConfirmedCashForecastReportCancellationV02.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV02#RelatedReference
 * FundConfirmedCashForecastReportCancellationV02.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV02#PoolReference
 * FundConfirmedCashForecastReportV02.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV02#PreviousReference
 * FundConfirmedCashForecastReportV02.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV02#RelatedReference
 * FundConfirmedCashForecastReportV02.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV03#PoolReference
 * FundConfirmedCashForecastReportV03.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV03#PreviousReference
 * FundConfirmedCashForecastReportV03.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV03#RelatedReference
 * FundConfirmedCashForecastReportV03.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV01#PoolReference
 * FundDetailedConfirmedCashForecastReportCancellationV01.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV01#PreviousReference
 * FundDetailedConfirmedCashForecastReportCancellationV01.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV01#RelatedReference
 * FundDetailedConfirmedCashForecastReportCancellationV01.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV02#PoolReference
 * FundDetailedConfirmedCashForecastReportCancellationV02.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV02#PreviousReference
 * FundDetailedConfirmedCashForecastReportCancellationV02.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV02#RelatedReference
 * FundDetailedConfirmedCashForecastReportCancellationV02.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV02#PoolReference
 * FundDetailedConfirmedCashForecastReportV02.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV02#PreviousReference
 * FundDetailedConfirmedCashForecastReportV02.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV02#RelatedReference
 * FundDetailedConfirmedCashForecastReportV02.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV03#PoolReference
 * FundDetailedConfirmedCashForecastReportV03.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV03#PreviousReference
 * FundDetailedConfirmedCashForecastReportV03.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV03#RelatedReference
 * FundDetailedConfirmedCashForecastReportV03.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV02#PoolReference
 * FundDetailedEstimatedCashForecastReportV02.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV02#PreviousReference
 * FundDetailedEstimatedCashForecastReportV02.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV02#RelatedReference
 * FundDetailedEstimatedCashForecastReportV02.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV03#PoolReference
 * FundDetailedEstimatedCashForecastReportV03.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV03#PreviousReference
 * FundDetailedEstimatedCashForecastReportV03.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV03#RelatedReference
 * FundDetailedEstimatedCashForecastReportV03.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV02#PoolReference
 * FundEstimatedCashForecastReportV02.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV02#PreviousReference
 * FundEstimatedCashForecastReportV02.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV02#RelatedReference
 * FundEstimatedCashForecastReportV02.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV03#PoolReference
 * FundEstimatedCashForecastReportV03.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV03#PreviousReference
 * FundEstimatedCashForecastReportV03.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV03#RelatedReference
 * FundEstimatedCashForecastReportV03.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV02#RelatedReference
 * OrderCancellationStatusReportV02.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV02#OtherReference
 * OrderCancellationStatusReportV02.OtherReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV03#RelatedReference
 * OrderCancellationStatusReportV03.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV03#OtherReference
 * OrderCancellationStatusReportV03.OtherReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderConfirmationStatusReportV01#OtherReference
 * OrderConfirmationStatusReportV01.OtherReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderConfirmationStatusReportV01#RelatedReference
 * OrderConfirmationStatusReportV01.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV02#OtherReference
 * OrderInstructionStatusReportV02.OtherReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV02#RelatedReference
 * OrderInstructionStatusReportV02.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV02#MasterReference
 * OrderInstructionStatusReportV02.MasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV03#OtherReference
 * OrderInstructionStatusReportV03.OtherReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV03#RelatedReference
 * OrderInstructionStatusReportV03.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderCancellationInstructionV02#MasterReference
 * RedemptionBulkOrderCancellationInstructionV02.MasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderCancellationInstructionV02#PoolReference
 * RedemptionBulkOrderCancellationInstructionV02.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderCancellationInstructionV02#PreviousReference
 * RedemptionBulkOrderCancellationInstructionV02.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderCancellationRequestV03#PoolReference
 * RedemptionBulkOrderCancellationRequestV03.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderCancellationRequestV03#PreviousReference
 * RedemptionBulkOrderCancellationRequestV03.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationAmendmentV01#PoolReference
 * RedemptionBulkOrderConfirmationAmendmentV01.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationAmendmentV01#PreviousReference
 * RedemptionBulkOrderConfirmationAmendmentV01.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationAmendmentV01#RelatedReference
 * RedemptionBulkOrderConfirmationAmendmentV01.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV01#PoolReference
 * RedemptionBulkOrderConfirmationCancellationInstructionV01.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV01#PreviousReference
 * RedemptionBulkOrderConfirmationCancellationInstructionV01.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV01#RelatedReference
 * RedemptionBulkOrderConfirmationCancellationInstructionV01.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV02#MasterReference
 * RedemptionBulkOrderConfirmationV02.MasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV02#PoolReference
 * RedemptionBulkOrderConfirmationV02.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV02#PreviousReference
 * RedemptionBulkOrderConfirmationV02.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV02#RelatedReference
 * RedemptionBulkOrderConfirmationV02.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV03#PoolReference
 * RedemptionBulkOrderConfirmationV03.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV03#PreviousReference
 * RedemptionBulkOrderConfirmationV03.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV03#RelatedReference
 * RedemptionBulkOrderConfirmationV03.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderV02#MasterReference
 * RedemptionBulkOrderV02.MasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderV02#PoolReference
 * RedemptionBulkOrderV02.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderV02#PreviousReference
 * RedemptionBulkOrderV02.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderV03#PoolReference
 * RedemptionBulkOrderV03.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderV03#PreviousReference
 * RedemptionBulkOrderV03.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionMultipleOrderCancellationInstructionV02#MasterReference
 * RedemptionMultipleOrderCancellationInstructionV02.MasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionMultipleOrderCancellationInstructionV02#PoolReference
 * RedemptionMultipleOrderCancellationInstructionV02.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionMultipleOrderCancellationInstructionV02#PreviousReference
 * RedemptionMultipleOrderCancellationInstructionV02.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderCancellationRequestV03#PoolReference
 * RedemptionOrderCancellationRequestV03.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderCancellationRequestV03#PreviousReference
 * RedemptionOrderCancellationRequestV03.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationAmendmentV01#PoolReference
 * RedemptionOrderConfirmationAmendmentV01.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationAmendmentV01#PreviousReference
 * RedemptionOrderConfirmationAmendmentV01.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationAmendmentV01#RelatedReference
 * RedemptionOrderConfirmationAmendmentV01.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationCancellationInstructionV01#PoolReference
 * RedemptionOrderConfirmationCancellationInstructionV01.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationCancellationInstructionV01#PreviousReference
 * RedemptionOrderConfirmationCancellationInstructionV01.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationCancellationInstructionV01#RelatedReference
 * RedemptionOrderConfirmationCancellationInstructionV01.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionMultipleOrderConfirmationV02#MasterReference
 * RedemptionMultipleOrderConfirmationV02.MasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionMultipleOrderConfirmationV02#PoolReference
 * RedemptionMultipleOrderConfirmationV02.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionMultipleOrderConfirmationV02#PreviousReference
 * RedemptionMultipleOrderConfirmationV02.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionMultipleOrderConfirmationV02#RelatedReference
 * RedemptionMultipleOrderConfirmationV02.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationV03#PoolReference
 * RedemptionOrderConfirmationV03.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationV03#PreviousReference
 * RedemptionOrderConfirmationV03.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationV03#RelatedReference
 * RedemptionOrderConfirmationV03.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionMultipleOrderV02#MasterReference
 * RedemptionMultipleOrderV02.MasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionMultipleOrderV02#PoolReference
 * RedemptionMultipleOrderV02.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionMultipleOrderV02#PreviousReference
 * RedemptionMultipleOrderV02.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderV03#PoolReference
 * RedemptionOrderV03.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderV03#PreviousReference
 * RedemptionOrderV03.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageRejectionV02#RelatedReference
 * SecuritiesMessageRejectionV02.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderCancellationInstructionV02#MasterReference
 * SubscriptionBulkOrderCancellationInstructionV02.MasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderCancellationInstructionV02#PoolReference
 * SubscriptionBulkOrderCancellationInstructionV02.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderCancellationInstructionV02#PreviousReference
 * SubscriptionBulkOrderCancellationInstructionV02.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderCancellationRequestV03#PoolReference
 * SubscriptionBulkOrderCancellationRequestV03.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderCancellationRequestV03#PreviousReference
 * SubscriptionBulkOrderCancellationRequestV03.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationAmendmentV01#PoolReference
 * SubscriptionBulkOrderConfirmationAmendmentV01.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationAmendmentV01#PreviousReference
 * SubscriptionBulkOrderConfirmationAmendmentV01.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationAmendmentV01#RelatedReference
 * SubscriptionBulkOrderConfirmationAmendmentV01.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV01#PoolReference
 * SubscriptionBulkOrderConfirmationCancellationInstructionV01.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV01#PreviousReference
 * SubscriptionBulkOrderConfirmationCancellationInstructionV01.PreviousReference
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV01#RelatedReference
 * SubscriptionBulkOrderConfirmationCancellationInstructionV01.RelatedReference}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV02#MasterReference
 * SubscriptionBulkOrderConfirmationV02.MasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV02#PoolReference
 * SubscriptionBulkOrderConfirmationV02.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV02#PreviousReference
 * SubscriptionBulkOrderConfirmationV02.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV02#RelatedReference
 * SubscriptionBulkOrderConfirmationV02.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV03#PoolReference
 * SubscriptionBulkOrderConfirmationV03.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV03#PreviousReference
 * SubscriptionBulkOrderConfirmationV03.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV03#RelatedReference
 * SubscriptionBulkOrderConfirmationV03.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderV02#MasterReference
 * SubscriptionBulkOrderV02.MasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderV02#PoolReference
 * SubscriptionBulkOrderV02.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderV02#PreviousReference
 * SubscriptionBulkOrderV02.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderV03#PoolReference
 * SubscriptionBulkOrderV03.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderV03#PreviousReference
 * SubscriptionBulkOrderV03.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionMultipleOrderCancellationInstructionV02#MasterReference
 * SubscriptionMultipleOrderCancellationInstructionV02.MasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionMultipleOrderCancellationInstructionV02#PoolReference
 * SubscriptionMultipleOrderCancellationInstructionV02.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionMultipleOrderCancellationInstructionV02#PreviousReference
 * SubscriptionMultipleOrderCancellationInstructionV02.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV03#PoolReference
 * SubscriptionOrderCancellationRequestV03.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV03#PreviousReference
 * SubscriptionOrderCancellationRequestV03.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationAmendmentV01#PoolReference
 * SubscriptionOrderConfirmationAmendmentV01.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationAmendmentV01#PreviousReference
 * SubscriptionOrderConfirmationAmendmentV01.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationAmendmentV01#RelatedReference
 * SubscriptionOrderConfirmationAmendmentV01.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV01#PoolReference
 * SubscriptionOrderConfirmationCancellationInstructionV01.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV01#PreviousReference
 * SubscriptionOrderConfirmationCancellationInstructionV01.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV01#RelatedReference
 * SubscriptionOrderConfirmationCancellationInstructionV01.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionMultipleOrderConfirmationV02#MasterReference
 * SubscriptionMultipleOrderConfirmationV02.MasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionMultipleOrderConfirmationV02#PoolReference
 * SubscriptionMultipleOrderConfirmationV02.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionMultipleOrderConfirmationV02#PreviousReference
 * SubscriptionMultipleOrderConfirmationV02.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionMultipleOrderConfirmationV02#RelatedReference
 * SubscriptionMultipleOrderConfirmationV02.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV03#PoolReference
 * SubscriptionOrderConfirmationV03.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV03#PreviousReference
 * SubscriptionOrderConfirmationV03.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV03#RelatedReference
 * SubscriptionOrderConfirmationV03.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionMultipleOrderV02#MasterReference
 * SubscriptionMultipleOrderV02.MasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionMultipleOrderV02#PoolReference
 * SubscriptionMultipleOrderV02.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionMultipleOrderV02#PreviousReference
 * SubscriptionMultipleOrderV02.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderV03#PoolReference
 * SubscriptionOrderV03.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderV03#PreviousReference
 * SubscriptionOrderV03.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderCancellationInstructionV02#MasterReference
 * SwitchOrderCancellationInstructionV02.MasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderCancellationInstructionV02#PoolReference
 * SwitchOrderCancellationInstructionV02.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderCancellationInstructionV02#PreviousReference
 * SwitchOrderCancellationInstructionV02.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderCancellationRequestV03#PoolReference
 * SwitchOrderCancellationRequestV03.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderCancellationRequestV03#PreviousReference
 * SwitchOrderCancellationRequestV03.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationAmendmentV01#PoolReference
 * SwitchOrderConfirmationAmendmentV01.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationAmendmentV01#PreviousReference
 * SwitchOrderConfirmationAmendmentV01.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationAmendmentV01#RelatedReference
 * SwitchOrderConfirmationAmendmentV01.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01#PoolReference
 * SwitchOrderConfirmationCancellationInstructionV01.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01#PreviousReference
 * SwitchOrderConfirmationCancellationInstructionV01.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01#RelatedReference
 * SwitchOrderConfirmationCancellationInstructionV01.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationV02#MasterReference
 * SwitchOrderConfirmationV02.MasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationV02#PoolReference
 * SwitchOrderConfirmationV02.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationV02#PreviousReference
 * SwitchOrderConfirmationV02.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationV02#RelatedReference
 * SwitchOrderConfirmationV02.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationV03#PoolReference
 * SwitchOrderConfirmationV03.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationV03#PreviousReference
 * SwitchOrderConfirmationV03.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationV03#RelatedReference
 * SwitchOrderConfirmationV03.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV02#MasterReference
 * SwitchOrderV02.MasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV02#PoolReference
 * SwitchOrderV02.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV02#PreviousReference
 * SwitchOrderV02.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV03#PoolReference
 * SwitchOrderV03.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV03#PreviousReference
 * SwitchOrderV03.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV02#RelatedReference
 * TransferCancellationStatusReportV02.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV02#OtherReference
 * TransferCancellationStatusReportV02.OtherReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV03#RelatedReference
 * TransferCancellationStatusReportV03.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV03#OtherReference
 * TransferCancellationStatusReportV03.OtherReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV02#RelatedReference
 * TransferInstructionStatusReportV02.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV02#OtherReference
 * TransferInstructionStatusReportV02.OtherReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV03#RelatedReference
 * TransferInstructionStatusReportV03.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV03#OtherReference
 * TransferInstructionStatusReportV03.OtherReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForPEPOrISAOrPortfolioInformationV01#PoolReference
 * RequestForPEPOrISAOrPortfolioInformationV01.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForPEPOrISAOrPortfolioInformationV01#PreviousReference
 * RequestForPEPOrISAOrPortfolioInformationV01.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForPEPOrISAOrPortfolioInformationV01#RelatedReference
 * RequestForPEPOrISAOrPortfolioInformationV01.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV02#PoolReference
 * AccountHoldingInformationRequestV02.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV02#PreviousReference
 * AccountHoldingInformationRequestV02.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV02#RelatedReference
 * AccountHoldingInformationRequestV02.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCorrectionV02#PoolReference
 * PriceReportCorrectionV02.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCorrectionV02#PreviousReference
 * PriceReportCorrectionV02.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCorrectionV03#PoolReference
 * PriceReportCorrectionV03.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCorrectionV03#PreviousReference
 * PriceReportCorrectionV03.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04#RelatedReference
 * AccountDetailsConfirmationV04.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV04#PreviousReference
 * AccountModificationInstructionV04.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV04#PreviousReference
 * AccountOpeningInstructionV04.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03#PoolReference
 * AccountHoldingInformationRequestV03.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03#PreviousReference
 * AccountHoldingInformationRequestV03.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03#RelatedReference
 * AccountHoldingInformationRequestV03.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV04#PoolReference
 * AccountHoldingInformationV04.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV04#PreviousReference
 * AccountHoldingInformationV04.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV04#RelatedReference
 * AccountHoldingInformationV04.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV05#PoolReference
 * PortfolioTransferCancellationRequestV05.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV05#PreviousReference
 * PortfolioTransferCancellationRequestV05.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV05#RelatedReference
 * PortfolioTransferCancellationRequestV05.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV05#PoolReference
 * PortfolioTransferInstructionV05.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV05#PreviousReference
 * PortfolioTransferInstructionV05.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV05#RelatedReference
 * PortfolioTransferInstructionV05.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05#PoolReference
 * PortfolioTransferConfirmationV05.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05#PreviousReference
 * PortfolioTransferConfirmationV05.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05#RelatedReference
 * PortfolioTransferConfirmationV05.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV04#RelatedReference
 * AccountManagementStatusReportV04.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV04#PoolReference
 * FundDetailedEstimatedCashForecastReportV04.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV04#PreviousReference
 * FundDetailedEstimatedCashForecastReportV04.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV04#RelatedReference
 * FundDetailedEstimatedCashForecastReportV04.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV05#PreviousReference
 * AccountOpeningInstructionV05.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV04#PoolReference
 * FundConfirmedCashForecastReportV04.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV04#PreviousReference
 * FundConfirmedCashForecastReportV04.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV04#RelatedReference
 * FundConfirmedCashForecastReportV04.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV03#PoolReference
 * FundDetailedConfirmedCashForecastReportCancellationV03.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV03#PreviousReference
 * FundDetailedConfirmedCashForecastReportCancellationV03.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV03#RelatedReference
 * FundDetailedConfirmedCashForecastReportCancellationV03.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04#PoolReference
 * FundEstimatedCashForecastReportV04.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04#PreviousReference
 * FundEstimatedCashForecastReportV04.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04#RelatedReference
 * FundEstimatedCashForecastReportV04.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV05#PreviousReference
 * AccountModificationInstructionV05.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageRejectionV03#RelatedReference
 * SecuritiesMessageRejectionV03.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV03#PoolReference
 * FundConfirmedCashForecastReportCancellationV03.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV03#PreviousReference
 * FundConfirmedCashForecastReportCancellationV03.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV03#RelatedReference
 * FundConfirmedCashForecastReportCancellationV03.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#RelatedReference
 * AccountDetailsConfirmationV05.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV06#PoolReference
 * PortfolioTransferCancellationRequestV06.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV06#PreviousReference
 * PortfolioTransferCancellationRequestV06.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV06#RelatedReference
 * PortfolioTransferCancellationRequestV06.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04#PoolReference
 * FundDetailedConfirmedCashForecastReportV04.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04#PreviousReference
 * FundDetailedConfirmedCashForecastReportV04.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04#RelatedReference
 * FundDetailedConfirmedCashForecastReportV04.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06#PoolReference
 * PortfolioTransferConfirmationV06.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06#PreviousReference
 * PortfolioTransferConfirmationV06.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06#RelatedReference
 * PortfolioTransferConfirmationV06.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV06#PoolReference
 * PortfolioTransferInstructionV06.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV06#PreviousReference
 * PortfolioTransferInstructionV06.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV06#RelatedReference
 * PortfolioTransferInstructionV06.RelatedReference}</li>
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
 * "AdditionalReference3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "References a related message or provides another reference, such as a pool reference, linking a set of messages. The party which issued the related reference may be the Sender of the referenced message or a party other than the Sender."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalReference8
 * AdditionalReference8}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class AdditionalReference3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Business reference of a message assigned by the party issuing the
	 * message. This reference must be unique amongst all messages of the same
	 * name sent by the same party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#Identification
	 * GenericIdentification.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ref"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Business reference of a message assigned by the party issuing the message. This reference must be unique amongst all messages of the same name sent by the same party."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference8#Reference
	 * AdditionalReference8.Reference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute Reference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AdditionalReference3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.GenericIdentification.Identification;
			isDerived = false;
			xmlTag = "Ref";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reference";
			definition = "Business reference of a message assigned by the party issuing the message. This reference must be unique amongst all messages of the same name sent by the same party.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AdditionalReference8.Reference);
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Issuer of the reference.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice
	 * PartyIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#Identification
	 * Party.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RefIssr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceIssuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issuer of the reference."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference8#ReferenceIssuer
	 * AdditionalReference8.ReferenceIssuer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute ReferenceIssuer = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AdditionalReference3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			isDerived = false;
			xmlTag = "RefIssr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceIssuer";
			definition = "Issuer of the reference.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AdditionalReference8.ReferenceIssuer);
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> PartyIdentification2Choice.mmObject();
		}
	};
	/**
	 * Name of a message.
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
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of a message."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference8#MessageName
	 * AdditionalReference8.MessageName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute MessageName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AdditionalReference3.mmObject();
			isDerived = false;
			xmlTag = "MsgNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageName";
			definition = "Name of a message.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AdditionalReference8.MessageName);
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AdditionalReference3.Reference, com.tools20022.repository.msg.AdditionalReference3.ReferenceIssuer,
						com.tools20022.repository.msg.AdditionalReference3.MessageName);
				trace_lazy = () -> GenericIdentification.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.reda.InvestmentFundReportRequestV02.PreviousReference, com.tools20022.repository.area.reda.InvestmentFundReportRequestV02.RelatedReference,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02.RelatedReference, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03.RelatedReference,
						com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01.PoolReference, com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01.PreviousReference,
						com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01.RelatedReference, com.tools20022.repository.area.sese.AccountHoldingInformationV02.PoolReference,
						com.tools20022.repository.area.sese.AccountHoldingInformationV02.PreviousReference, com.tools20022.repository.area.sese.AccountHoldingInformationV02.RelatedReference,
						com.tools20022.repository.area.sese.AccountHoldingInformationV03.PoolReference, com.tools20022.repository.area.sese.AccountHoldingInformationV03.PreviousReference,
						com.tools20022.repository.area.sese.AccountHoldingInformationV03.RelatedReference, com.tools20022.repository.area.acmt.AccountManagementStatusReportV02.RelatedReference,
						com.tools20022.repository.area.acmt.AccountManagementStatusReportV03.RelatedReference, com.tools20022.repository.area.acmt.AccountModificationInstructionV02.PreviousReference,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV03.PreviousReference, com.tools20022.repository.area.acmt.AccountOpeningInstructionV02.PreviousReference,
						com.tools20022.repository.area.acmt.AccountOpeningInstructionV03.PreviousReference, com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferCancellationRequestV02.PoolReference,
						com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferCancellationRequestV02.PreviousReference, com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferCancellationRequestV02.RelatedReference,
						com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV03.PoolReference, com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV03.PreviousReference,
						com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV03.RelatedReference, com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV04.PoolReference,
						com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV04.PreviousReference, com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV04.RelatedReference,
						com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferConfirmationV02.PoolReference, com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferConfirmationV02.PreviousReference,
						com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferConfirmationV02.RelatedReference, com.tools20022.repository.area.sese.PortfolioTransferConfirmationV03.PoolReference,
						com.tools20022.repository.area.sese.PortfolioTransferConfirmationV03.PreviousReference, com.tools20022.repository.area.sese.PortfolioTransferConfirmationV03.RelatedReference,
						com.tools20022.repository.area.sese.PortfolioTransferConfirmationV04.PoolReference, com.tools20022.repository.area.sese.PortfolioTransferConfirmationV04.PreviousReference,
						com.tools20022.repository.area.sese.PortfolioTransferConfirmationV04.RelatedReference, com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02.PoolReference,
						com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02.PreviousReference, com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02.RelatedReference,
						com.tools20022.repository.area.sese.PortfolioTransferInstructionV03.PoolReference, com.tools20022.repository.area.sese.PortfolioTransferInstructionV03.PreviousReference,
						com.tools20022.repository.area.sese.PortfolioTransferInstructionV03.RelatedReference, com.tools20022.repository.area.sese.PortfolioTransferInstructionV04.PoolReference,
						com.tools20022.repository.area.sese.PortfolioTransferInstructionV04.PreviousReference, com.tools20022.repository.area.sese.PortfolioTransferInstructionV04.RelatedReference,
						com.tools20022.repository.area.reda.PriceReportCancellationV02.PoolReference, com.tools20022.repository.area.reda.PriceReportCancellationV02.PreviousReference,
						com.tools20022.repository.area.reda.PriceReportCancellationV03.PoolReference, com.tools20022.repository.area.reda.PriceReportCancellationV03.PreviousReference,
						com.tools20022.repository.area.reda.PriceReportCancellationV04.PoolReference, com.tools20022.repository.area.reda.PriceReportCancellationV04.PreviousReference,
						com.tools20022.repository.area.reda.PriceReportV02.PoolReference, com.tools20022.repository.area.reda.PriceReportV02.PreviousReference, com.tools20022.repository.area.reda.PriceReportV02.RelatedReference,
						com.tools20022.repository.area.reda.PriceReportV03.PoolReference, com.tools20022.repository.area.reda.PriceReportV03.PreviousReference, com.tools20022.repository.area.reda.PriceReportV03.RelatedReference,
						com.tools20022.repository.area.reda.PriceReportV04.PoolReference, com.tools20022.repository.area.reda.PriceReportV04.PreviousReference, com.tools20022.repository.area.reda.PriceReportV04.RelatedReference,
						com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV01.PoolReference, com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV01.PreviousReference,
						com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV01.RelatedReference, com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV02.PoolReference,
						com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV02.PreviousReference, com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV02.RelatedReference,
						com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV02.PoolReference, com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV02.PreviousReference,
						com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV02.RelatedReference, com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV03.PoolReference,
						com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV03.PreviousReference, com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV03.RelatedReference,
						com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV01.PoolReference, com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV01.PreviousReference,
						com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV01.RelatedReference, com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV02.PoolReference,
						com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV02.PreviousReference,
						com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV02.RelatedReference, com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV02.PoolReference,
						com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV02.PreviousReference, com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV02.RelatedReference,
						com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV03.PoolReference, com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV03.PreviousReference,
						com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV03.RelatedReference, com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV02.PoolReference,
						com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV02.PreviousReference, com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV02.RelatedReference,
						com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV03.PoolReference, com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV03.PreviousReference,
						com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV03.RelatedReference, com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV02.PoolReference,
						com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV02.PreviousReference, com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV02.RelatedReference,
						com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV03.PoolReference, com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV03.PreviousReference,
						com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV03.RelatedReference, com.tools20022.repository.area.setr.OrderCancellationStatusReportV02.RelatedReference,
						com.tools20022.repository.area.setr.OrderCancellationStatusReportV02.OtherReference, com.tools20022.repository.area.setr.OrderCancellationStatusReportV03.RelatedReference,
						com.tools20022.repository.area.setr.OrderCancellationStatusReportV03.OtherReference, com.tools20022.repository.area.setr.OrderConfirmationStatusReportV01.OtherReference,
						com.tools20022.repository.area.setr.OrderConfirmationStatusReportV01.RelatedReference, com.tools20022.repository.area.setr.OrderInstructionStatusReportV02.OtherReference,
						com.tools20022.repository.area.setr.OrderInstructionStatusReportV02.RelatedReference, com.tools20022.repository.area.setr.OrderInstructionStatusReportV02.MasterReference,
						com.tools20022.repository.area.setr.OrderInstructionStatusReportV03.OtherReference, com.tools20022.repository.area.setr.OrderInstructionStatusReportV03.RelatedReference,
						com.tools20022.repository.area.setr.RedemptionBulkOrderCancellationInstructionV02.MasterReference, com.tools20022.repository.area.setr.RedemptionBulkOrderCancellationInstructionV02.PoolReference,
						com.tools20022.repository.area.setr.RedemptionBulkOrderCancellationInstructionV02.PreviousReference, com.tools20022.repository.area.setr.RedemptionBulkOrderCancellationRequestV03.PoolReference,
						com.tools20022.repository.area.setr.RedemptionBulkOrderCancellationRequestV03.PreviousReference, com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationAmendmentV01.PoolReference,
						com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationAmendmentV01.PreviousReference, com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationAmendmentV01.RelatedReference,
						com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV01.PoolReference,
						com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV01.PreviousReference,
						com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV01.RelatedReference, com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV02.MasterReference,
						com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV02.PoolReference, com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV02.PreviousReference,
						com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV02.RelatedReference, com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV03.PoolReference,
						com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV03.PreviousReference, com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV03.RelatedReference,
						com.tools20022.repository.area.setr.RedemptionBulkOrderV02.MasterReference, com.tools20022.repository.area.setr.RedemptionBulkOrderV02.PoolReference,
						com.tools20022.repository.area.setr.RedemptionBulkOrderV02.PreviousReference, com.tools20022.repository.area.setr.RedemptionBulkOrderV03.PoolReference,
						com.tools20022.repository.area.setr.RedemptionBulkOrderV03.PreviousReference, com.tools20022.repository.area.setr.RedemptionMultipleOrderCancellationInstructionV02.MasterReference,
						com.tools20022.repository.area.setr.RedemptionMultipleOrderCancellationInstructionV02.PoolReference, com.tools20022.repository.area.setr.RedemptionMultipleOrderCancellationInstructionV02.PreviousReference,
						com.tools20022.repository.area.setr.RedemptionOrderCancellationRequestV03.PoolReference, com.tools20022.repository.area.setr.RedemptionOrderCancellationRequestV03.PreviousReference,
						com.tools20022.repository.area.setr.RedemptionOrderConfirmationAmendmentV01.PoolReference, com.tools20022.repository.area.setr.RedemptionOrderConfirmationAmendmentV01.PreviousReference,
						com.tools20022.repository.area.setr.RedemptionOrderConfirmationAmendmentV01.RelatedReference, com.tools20022.repository.area.setr.RedemptionOrderConfirmationCancellationInstructionV01.PoolReference,
						com.tools20022.repository.area.setr.RedemptionOrderConfirmationCancellationInstructionV01.PreviousReference,
						com.tools20022.repository.area.setr.RedemptionOrderConfirmationCancellationInstructionV01.RelatedReference, com.tools20022.repository.area.setr.RedemptionMultipleOrderConfirmationV02.MasterReference,
						com.tools20022.repository.area.setr.RedemptionMultipleOrderConfirmationV02.PoolReference, com.tools20022.repository.area.setr.RedemptionMultipleOrderConfirmationV02.PreviousReference,
						com.tools20022.repository.area.setr.RedemptionMultipleOrderConfirmationV02.RelatedReference, com.tools20022.repository.area.setr.RedemptionOrderConfirmationV03.PoolReference,
						com.tools20022.repository.area.setr.RedemptionOrderConfirmationV03.PreviousReference, com.tools20022.repository.area.setr.RedemptionOrderConfirmationV03.RelatedReference,
						com.tools20022.repository.area.setr.RedemptionMultipleOrderV02.MasterReference, com.tools20022.repository.area.setr.RedemptionMultipleOrderV02.PoolReference,
						com.tools20022.repository.area.setr.RedemptionMultipleOrderV02.PreviousReference, com.tools20022.repository.area.setr.RedemptionOrderV03.PoolReference,
						com.tools20022.repository.area.setr.RedemptionOrderV03.PreviousReference, com.tools20022.repository.area.semt.SecuritiesMessageRejectionV02.RelatedReference,
						com.tools20022.repository.area.setr.SubscriptionBulkOrderCancellationInstructionV02.MasterReference, com.tools20022.repository.area.setr.SubscriptionBulkOrderCancellationInstructionV02.PoolReference,
						com.tools20022.repository.area.setr.SubscriptionBulkOrderCancellationInstructionV02.PreviousReference, com.tools20022.repository.area.setr.SubscriptionBulkOrderCancellationRequestV03.PoolReference,
						com.tools20022.repository.area.setr.SubscriptionBulkOrderCancellationRequestV03.PreviousReference, com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationAmendmentV01.PoolReference,
						com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationAmendmentV01.PreviousReference, com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationAmendmentV01.RelatedReference,
						com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV01.PoolReference,
						com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV01.PreviousReference,
						com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV01.RelatedReference, com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV02.MasterReference,
						com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV02.PoolReference, com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV02.PreviousReference,
						com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV02.RelatedReference, com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV03.PoolReference,
						com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV03.PreviousReference, com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV03.RelatedReference,
						com.tools20022.repository.area.setr.SubscriptionBulkOrderV02.MasterReference, com.tools20022.repository.area.setr.SubscriptionBulkOrderV02.PoolReference,
						com.tools20022.repository.area.setr.SubscriptionBulkOrderV02.PreviousReference, com.tools20022.repository.area.setr.SubscriptionBulkOrderV03.PoolReference,
						com.tools20022.repository.area.setr.SubscriptionBulkOrderV03.PreviousReference, com.tools20022.repository.area.setr.SubscriptionMultipleOrderCancellationInstructionV02.MasterReference,
						com.tools20022.repository.area.setr.SubscriptionMultipleOrderCancellationInstructionV02.PoolReference, com.tools20022.repository.area.setr.SubscriptionMultipleOrderCancellationInstructionV02.PreviousReference,
						com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV03.PoolReference, com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV03.PreviousReference,
						com.tools20022.repository.area.setr.SubscriptionOrderConfirmationAmendmentV01.PoolReference, com.tools20022.repository.area.setr.SubscriptionOrderConfirmationAmendmentV01.PreviousReference,
						com.tools20022.repository.area.setr.SubscriptionOrderConfirmationAmendmentV01.RelatedReference, com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV01.PoolReference,
						com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV01.PreviousReference,
						com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV01.RelatedReference, com.tools20022.repository.area.setr.SubscriptionMultipleOrderConfirmationV02.MasterReference,
						com.tools20022.repository.area.setr.SubscriptionMultipleOrderConfirmationV02.PoolReference, com.tools20022.repository.area.setr.SubscriptionMultipleOrderConfirmationV02.PreviousReference,
						com.tools20022.repository.area.setr.SubscriptionMultipleOrderConfirmationV02.RelatedReference, com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV03.PoolReference,
						com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV03.PreviousReference, com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV03.RelatedReference,
						com.tools20022.repository.area.setr.SubscriptionMultipleOrderV02.MasterReference, com.tools20022.repository.area.setr.SubscriptionMultipleOrderV02.PoolReference,
						com.tools20022.repository.area.setr.SubscriptionMultipleOrderV02.PreviousReference, com.tools20022.repository.area.setr.SubscriptionOrderV03.PoolReference,
						com.tools20022.repository.area.setr.SubscriptionOrderV03.PreviousReference, com.tools20022.repository.area.setr.SwitchOrderCancellationInstructionV02.MasterReference,
						com.tools20022.repository.area.setr.SwitchOrderCancellationInstructionV02.PoolReference, com.tools20022.repository.area.setr.SwitchOrderCancellationInstructionV02.PreviousReference,
						com.tools20022.repository.area.setr.SwitchOrderCancellationRequestV03.PoolReference, com.tools20022.repository.area.setr.SwitchOrderCancellationRequestV03.PreviousReference,
						com.tools20022.repository.area.setr.SwitchOrderConfirmationAmendmentV01.PoolReference, com.tools20022.repository.area.setr.SwitchOrderConfirmationAmendmentV01.PreviousReference,
						com.tools20022.repository.area.setr.SwitchOrderConfirmationAmendmentV01.RelatedReference, com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01.PoolReference,
						com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01.PreviousReference, com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01.RelatedReference,
						com.tools20022.repository.area.setr.SwitchOrderConfirmationV02.MasterReference, com.tools20022.repository.area.setr.SwitchOrderConfirmationV02.PoolReference,
						com.tools20022.repository.area.setr.SwitchOrderConfirmationV02.PreviousReference, com.tools20022.repository.area.setr.SwitchOrderConfirmationV02.RelatedReference,
						com.tools20022.repository.area.setr.SwitchOrderConfirmationV03.PoolReference, com.tools20022.repository.area.setr.SwitchOrderConfirmationV03.PreviousReference,
						com.tools20022.repository.area.setr.SwitchOrderConfirmationV03.RelatedReference, com.tools20022.repository.area.setr.SwitchOrderV02.MasterReference, com.tools20022.repository.area.setr.SwitchOrderV02.PoolReference,
						com.tools20022.repository.area.setr.SwitchOrderV02.PreviousReference, com.tools20022.repository.area.setr.SwitchOrderV03.PoolReference, com.tools20022.repository.area.setr.SwitchOrderV03.PreviousReference,
						com.tools20022.repository.area.sese.TransferCancellationStatusReportV02.RelatedReference, com.tools20022.repository.area.sese.TransferCancellationStatusReportV02.OtherReference,
						com.tools20022.repository.area.sese.TransferCancellationStatusReportV03.RelatedReference, com.tools20022.repository.area.sese.TransferCancellationStatusReportV03.OtherReference,
						com.tools20022.repository.area.sese.TransferInstructionStatusReportV02.RelatedReference, com.tools20022.repository.area.sese.TransferInstructionStatusReportV02.OtherReference,
						com.tools20022.repository.area.sese.TransferInstructionStatusReportV03.RelatedReference, com.tools20022.repository.area.sese.TransferInstructionStatusReportV03.OtherReference,
						com.tools20022.repository.area.sese.RequestForPEPOrISAOrPortfolioInformationV01.PoolReference, com.tools20022.repository.area.sese.RequestForPEPOrISAOrPortfolioInformationV01.PreviousReference,
						com.tools20022.repository.area.sese.RequestForPEPOrISAOrPortfolioInformationV01.RelatedReference, com.tools20022.repository.area.sese.AccountHoldingInformationRequestV02.PoolReference,
						com.tools20022.repository.area.sese.AccountHoldingInformationRequestV02.PreviousReference, com.tools20022.repository.area.sese.AccountHoldingInformationRequestV02.RelatedReference,
						com.tools20022.repository.area.reda.PriceReportCorrectionV02.PoolReference, com.tools20022.repository.area.reda.PriceReportCorrectionV02.PreviousReference,
						com.tools20022.repository.area.reda.PriceReportCorrectionV03.PoolReference, com.tools20022.repository.area.reda.PriceReportCorrectionV03.PreviousReference,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04.RelatedReference, com.tools20022.repository.area.acmt.AccountModificationInstructionV04.PreviousReference,
						com.tools20022.repository.area.acmt.AccountOpeningInstructionV04.PreviousReference, com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03.PoolReference,
						com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03.PreviousReference, com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03.RelatedReference,
						com.tools20022.repository.area.sese.AccountHoldingInformationV04.PoolReference, com.tools20022.repository.area.sese.AccountHoldingInformationV04.PreviousReference,
						com.tools20022.repository.area.sese.AccountHoldingInformationV04.RelatedReference, com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV05.PoolReference,
						com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV05.PreviousReference, com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV05.RelatedReference,
						com.tools20022.repository.area.sese.PortfolioTransferInstructionV05.PoolReference, com.tools20022.repository.area.sese.PortfolioTransferInstructionV05.PreviousReference,
						com.tools20022.repository.area.sese.PortfolioTransferInstructionV05.RelatedReference, com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05.PoolReference,
						com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05.PreviousReference, com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05.RelatedReference,
						com.tools20022.repository.area.acmt.AccountManagementStatusReportV04.RelatedReference, com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV04.PoolReference,
						com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV04.PreviousReference, com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV04.RelatedReference,
						com.tools20022.repository.area.acmt.AccountOpeningInstructionV05.PreviousReference, com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV04.PoolReference,
						com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV04.PreviousReference, com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV04.RelatedReference,
						com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV03.PoolReference, com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV03.PreviousReference,
						com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV03.RelatedReference, com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04.PoolReference,
						com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04.PreviousReference, com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04.RelatedReference,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV05.PreviousReference, com.tools20022.repository.area.semt.SecuritiesMessageRejectionV03.RelatedReference,
						com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV03.PoolReference, com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV03.PreviousReference,
						com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV03.RelatedReference, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05.RelatedReference,
						com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV06.PoolReference, com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV06.PreviousReference,
						com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV06.RelatedReference, com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04.PoolReference,
						com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04.PreviousReference, com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04.RelatedReference,
						com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06.PoolReference, com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06.PreviousReference,
						com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06.RelatedReference, com.tools20022.repository.area.sese.PortfolioTransferInstructionV06.PoolReference,
						com.tools20022.repository.area.sese.PortfolioTransferInstructionV06.PreviousReference, com.tools20022.repository.area.sese.PortfolioTransferInstructionV06.RelatedReference);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AdditionalReference3";
				definition = "References a related message or provides another reference, such as a pool reference, linking a set of messages. The party which issued the related reference may be the Sender of the referenced message or a party other than the Sender.";
				nextVersions_lazy = () -> Arrays.asList(AdditionalReference8.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}