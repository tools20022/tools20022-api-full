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
import com.tools20022.repository.area.acmt.*;
import com.tools20022.repository.area.camt.*;
import com.tools20022.repository.area.reda.*;
import com.tools20022.repository.area.semt.SecuritiesMessageRejectionV02;
import com.tools20022.repository.area.semt.SecuritiesMessageRejectionV03;
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.area.setr.*;
import com.tools20022.repository.choice.PartyIdentification2Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalReference3#mmReference
 * AdditionalReference3.mmReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalReference3#mmReferenceIssuer
 * AdditionalReference3.mmReferenceIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalReference3#mmMessageName
 * AdditionalReference3.mmMessageName}</li>
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
 * {@linkplain com.tools20022.repository.area.reda.InvestmentFundReportRequestV02#mmPreviousReference
 * InvestmentFundReportRequestV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.InvestmentFundReportRequestV02#mmRelatedReference
 * InvestmentFundReportRequestV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02#mmRelatedReference
 * AccountDetailsConfirmationV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03#mmRelatedReference
 * AccountDetailsConfirmationV03.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01#mmPoolReference
 * PEPOrISAOrPortfolioInformationV01.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01#mmPreviousReference
 * PEPOrISAOrPortfolioInformationV01.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01#mmRelatedReference
 * PEPOrISAOrPortfolioInformationV01.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV02#mmPoolReference
 * AccountHoldingInformationV02.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV02#mmPreviousReference
 * AccountHoldingInformationV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV02#mmRelatedReference
 * AccountHoldingInformationV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV03#mmPoolReference
 * AccountHoldingInformationV03.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV03#mmPreviousReference
 * AccountHoldingInformationV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV03#mmRelatedReference
 * AccountHoldingInformationV03.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV02#mmRelatedReference
 * AccountManagementStatusReportV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV03#mmRelatedReference
 * AccountManagementStatusReportV03.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV02#mmPreviousReference
 * AccountModificationInstructionV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV03#mmPreviousReference
 * AccountModificationInstructionV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV02#mmPreviousReference
 * AccountOpeningInstructionV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV03#mmPreviousReference
 * AccountOpeningInstructionV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferCancellationRequestV02#mmPoolReference
 * PEPOrISAOrPortfolioTransferCancellationRequestV02.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferCancellationRequestV02#mmPreviousReference
 * PEPOrISAOrPortfolioTransferCancellationRequestV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferCancellationRequestV02#mmRelatedReference
 * PEPOrISAOrPortfolioTransferCancellationRequestV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV03#mmPoolReference
 * PortfolioTransferCancellationRequestV03.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV03#mmPreviousReference
 * PortfolioTransferCancellationRequestV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV03#mmRelatedReference
 * PortfolioTransferCancellationRequestV03.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV04#mmPoolReference
 * PortfolioTransferCancellationRequestV04.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV04#mmPreviousReference
 * PortfolioTransferCancellationRequestV04.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV04#mmRelatedReference
 * PortfolioTransferCancellationRequestV04.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferConfirmationV02#mmPoolReference
 * PEPOrISAOrPortfolioTransferConfirmationV02.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferConfirmationV02#mmPreviousReference
 * PEPOrISAOrPortfolioTransferConfirmationV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferConfirmationV02#mmRelatedReference
 * PEPOrISAOrPortfolioTransferConfirmationV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV03#mmPoolReference
 * PortfolioTransferConfirmationV03.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV03#mmPreviousReference
 * PortfolioTransferConfirmationV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV03#mmRelatedReference
 * PortfolioTransferConfirmationV03.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV04#mmPoolReference
 * PortfolioTransferConfirmationV04.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV04#mmPreviousReference
 * PortfolioTransferConfirmationV04.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV04#mmRelatedReference
 * PortfolioTransferConfirmationV04.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02#mmPoolReference
 * PEPOrISAOrPortfolioTransferInstructionV02.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02#mmPreviousReference
 * PEPOrISAOrPortfolioTransferInstructionV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02#mmRelatedReference
 * PEPOrISAOrPortfolioTransferInstructionV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV03#mmPoolReference
 * PortfolioTransferInstructionV03.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV03#mmPreviousReference
 * PortfolioTransferInstructionV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV03#mmRelatedReference
 * PortfolioTransferInstructionV03.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV04#mmPoolReference
 * PortfolioTransferInstructionV04.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV04#mmPreviousReference
 * PortfolioTransferInstructionV04.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV04#mmRelatedReference
 * PortfolioTransferInstructionV04.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV02#mmPoolReference
 * PriceReportCancellationV02.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV02#mmPreviousReference
 * PriceReportCancellationV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV03#mmPoolReference
 * PriceReportCancellationV03.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV03#mmPreviousReference
 * PriceReportCancellationV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV04#mmPoolReference
 * PriceReportCancellationV04.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV04#mmPreviousReference
 * PriceReportCancellationV04.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportV02#mmPoolReference
 * PriceReportV02.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportV02#mmPreviousReference
 * PriceReportV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportV02#mmRelatedReference
 * PriceReportV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportV03#mmPoolReference
 * PriceReportV03.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportV03#mmPreviousReference
 * PriceReportV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportV03#mmRelatedReference
 * PriceReportV03.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportV04#mmPoolReference
 * PriceReportV04.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportV04#mmPreviousReference
 * PriceReportV04.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportV04#mmRelatedReference
 * PriceReportV04.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV01#mmPoolReference
 * FundConfirmedCashForecastReportCancellationV01.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV01#mmPreviousReference
 * FundConfirmedCashForecastReportCancellationV01.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV01#mmRelatedReference
 * FundConfirmedCashForecastReportCancellationV01.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV02#mmPoolReference
 * FundConfirmedCashForecastReportCancellationV02.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV02#mmPreviousReference
 * FundConfirmedCashForecastReportCancellationV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV02#mmRelatedReference
 * FundConfirmedCashForecastReportCancellationV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV02#mmPoolReference
 * FundConfirmedCashForecastReportV02.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV02#mmPreviousReference
 * FundConfirmedCashForecastReportV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV02#mmRelatedReference
 * FundConfirmedCashForecastReportV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV03#mmPoolReference
 * FundConfirmedCashForecastReportV03.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV03#mmPreviousReference
 * FundConfirmedCashForecastReportV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV03#mmRelatedReference
 * FundConfirmedCashForecastReportV03.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV01#mmPoolReference
 * FundDetailedConfirmedCashForecastReportCancellationV01.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV01#mmPreviousReference
 * FundDetailedConfirmedCashForecastReportCancellationV01.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV01#mmRelatedReference
 * FundDetailedConfirmedCashForecastReportCancellationV01.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV02#mmPoolReference
 * FundDetailedConfirmedCashForecastReportCancellationV02.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV02#mmPreviousReference
 * FundDetailedConfirmedCashForecastReportCancellationV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV02#mmRelatedReference
 * FundDetailedConfirmedCashForecastReportCancellationV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV02#mmPoolReference
 * FundDetailedConfirmedCashForecastReportV02.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV02#mmPreviousReference
 * FundDetailedConfirmedCashForecastReportV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV02#mmRelatedReference
 * FundDetailedConfirmedCashForecastReportV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV03#mmPoolReference
 * FundDetailedConfirmedCashForecastReportV03.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV03#mmPreviousReference
 * FundDetailedConfirmedCashForecastReportV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV03#mmRelatedReference
 * FundDetailedConfirmedCashForecastReportV03.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV02#mmPoolReference
 * FundDetailedEstimatedCashForecastReportV02.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV02#mmPreviousReference
 * FundDetailedEstimatedCashForecastReportV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV02#mmRelatedReference
 * FundDetailedEstimatedCashForecastReportV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV03#mmPoolReference
 * FundDetailedEstimatedCashForecastReportV03.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV03#mmPreviousReference
 * FundDetailedEstimatedCashForecastReportV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV03#mmRelatedReference
 * FundDetailedEstimatedCashForecastReportV03.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV02#mmPoolReference
 * FundEstimatedCashForecastReportV02.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV02#mmPreviousReference
 * FundEstimatedCashForecastReportV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV02#mmRelatedReference
 * FundEstimatedCashForecastReportV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV03#mmPoolReference
 * FundEstimatedCashForecastReportV03.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV03#mmPreviousReference
 * FundEstimatedCashForecastReportV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV03#mmRelatedReference
 * FundEstimatedCashForecastReportV03.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV02#mmRelatedReference
 * OrderCancellationStatusReportV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV02#mmOtherReference
 * OrderCancellationStatusReportV02.mmOtherReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV03#mmRelatedReference
 * OrderCancellationStatusReportV03.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV03#mmOtherReference
 * OrderCancellationStatusReportV03.mmOtherReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderConfirmationStatusReportV01#mmOtherReference
 * OrderConfirmationStatusReportV01.mmOtherReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderConfirmationStatusReportV01#mmRelatedReference
 * OrderConfirmationStatusReportV01.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV02#mmOtherReference
 * OrderInstructionStatusReportV02.mmOtherReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV02#mmRelatedReference
 * OrderInstructionStatusReportV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV02#mmMasterReference
 * OrderInstructionStatusReportV02.mmMasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV03#mmOtherReference
 * OrderInstructionStatusReportV03.mmOtherReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV03#mmRelatedReference
 * OrderInstructionStatusReportV03.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderCancellationInstructionV02#mmMasterReference
 * RedemptionBulkOrderCancellationInstructionV02.mmMasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderCancellationInstructionV02#mmPoolReference
 * RedemptionBulkOrderCancellationInstructionV02.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderCancellationInstructionV02#mmPreviousReference
 * RedemptionBulkOrderCancellationInstructionV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderCancellationRequestV03#mmPoolReference
 * RedemptionBulkOrderCancellationRequestV03.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderCancellationRequestV03#mmPreviousReference
 * RedemptionBulkOrderCancellationRequestV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationAmendmentV01#mmPoolReference
 * RedemptionBulkOrderConfirmationAmendmentV01.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationAmendmentV01#mmPreviousReference
 * RedemptionBulkOrderConfirmationAmendmentV01.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationAmendmentV01#mmRelatedReference
 * RedemptionBulkOrderConfirmationAmendmentV01.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV01#mmPoolReference
 * RedemptionBulkOrderConfirmationCancellationInstructionV01.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV01#mmPreviousReference
 * RedemptionBulkOrderConfirmationCancellationInstructionV01.mmPreviousReference
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV01#mmRelatedReference
 * RedemptionBulkOrderConfirmationCancellationInstructionV01.mmRelatedReference}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV02#mmMasterReference
 * RedemptionBulkOrderConfirmationV02.mmMasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV02#mmPoolReference
 * RedemptionBulkOrderConfirmationV02.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV02#mmPreviousReference
 * RedemptionBulkOrderConfirmationV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV02#mmRelatedReference
 * RedemptionBulkOrderConfirmationV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV03#mmPoolReference
 * RedemptionBulkOrderConfirmationV03.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV03#mmPreviousReference
 * RedemptionBulkOrderConfirmationV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV03#mmRelatedReference
 * RedemptionBulkOrderConfirmationV03.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderV02#mmMasterReference
 * RedemptionBulkOrderV02.mmMasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderV02#mmPoolReference
 * RedemptionBulkOrderV02.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderV02#mmPreviousReference
 * RedemptionBulkOrderV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderV03#mmPoolReference
 * RedemptionBulkOrderV03.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderV03#mmPreviousReference
 * RedemptionBulkOrderV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionMultipleOrderCancellationInstructionV02#mmMasterReference
 * RedemptionMultipleOrderCancellationInstructionV02.mmMasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionMultipleOrderCancellationInstructionV02#mmPoolReference
 * RedemptionMultipleOrderCancellationInstructionV02.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionMultipleOrderCancellationInstructionV02#mmPreviousReference
 * RedemptionMultipleOrderCancellationInstructionV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderCancellationRequestV03#mmPoolReference
 * RedemptionOrderCancellationRequestV03.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderCancellationRequestV03#mmPreviousReference
 * RedemptionOrderCancellationRequestV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationAmendmentV01#mmPoolReference
 * RedemptionOrderConfirmationAmendmentV01.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationAmendmentV01#mmPreviousReference
 * RedemptionOrderConfirmationAmendmentV01.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationAmendmentV01#mmRelatedReference
 * RedemptionOrderConfirmationAmendmentV01.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationCancellationInstructionV01#mmPoolReference
 * RedemptionOrderConfirmationCancellationInstructionV01.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationCancellationInstructionV01#mmPreviousReference
 * RedemptionOrderConfirmationCancellationInstructionV01.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationCancellationInstructionV01#mmRelatedReference
 * RedemptionOrderConfirmationCancellationInstructionV01.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionMultipleOrderConfirmationV02#mmMasterReference
 * RedemptionMultipleOrderConfirmationV02.mmMasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionMultipleOrderConfirmationV02#mmPoolReference
 * RedemptionMultipleOrderConfirmationV02.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionMultipleOrderConfirmationV02#mmPreviousReference
 * RedemptionMultipleOrderConfirmationV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionMultipleOrderConfirmationV02#mmRelatedReference
 * RedemptionMultipleOrderConfirmationV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationV03#mmPoolReference
 * RedemptionOrderConfirmationV03.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationV03#mmPreviousReference
 * RedemptionOrderConfirmationV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationV03#mmRelatedReference
 * RedemptionOrderConfirmationV03.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionMultipleOrderV02#mmMasterReference
 * RedemptionMultipleOrderV02.mmMasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionMultipleOrderV02#mmPoolReference
 * RedemptionMultipleOrderV02.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionMultipleOrderV02#mmPreviousReference
 * RedemptionMultipleOrderV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderV03#mmPoolReference
 * RedemptionOrderV03.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderV03#mmPreviousReference
 * RedemptionOrderV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageRejectionV02#mmRelatedReference
 * SecuritiesMessageRejectionV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderCancellationInstructionV02#mmMasterReference
 * SubscriptionBulkOrderCancellationInstructionV02.mmMasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderCancellationInstructionV02#mmPoolReference
 * SubscriptionBulkOrderCancellationInstructionV02.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderCancellationInstructionV02#mmPreviousReference
 * SubscriptionBulkOrderCancellationInstructionV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderCancellationRequestV03#mmPoolReference
 * SubscriptionBulkOrderCancellationRequestV03.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderCancellationRequestV03#mmPreviousReference
 * SubscriptionBulkOrderCancellationRequestV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationAmendmentV01#mmPoolReference
 * SubscriptionBulkOrderConfirmationAmendmentV01.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationAmendmentV01#mmPreviousReference
 * SubscriptionBulkOrderConfirmationAmendmentV01.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationAmendmentV01#mmRelatedReference
 * SubscriptionBulkOrderConfirmationAmendmentV01.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV01#mmPoolReference
 * SubscriptionBulkOrderConfirmationCancellationInstructionV01.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV01#mmPreviousReference
 * SubscriptionBulkOrderConfirmationCancellationInstructionV01.
 * mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV01#mmRelatedReference
 * SubscriptionBulkOrderConfirmationCancellationInstructionV01.
 * mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV02#mmMasterReference
 * SubscriptionBulkOrderConfirmationV02.mmMasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV02#mmPoolReference
 * SubscriptionBulkOrderConfirmationV02.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV02#mmPreviousReference
 * SubscriptionBulkOrderConfirmationV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV02#mmRelatedReference
 * SubscriptionBulkOrderConfirmationV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV03#mmPoolReference
 * SubscriptionBulkOrderConfirmationV03.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV03#mmPreviousReference
 * SubscriptionBulkOrderConfirmationV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV03#mmRelatedReference
 * SubscriptionBulkOrderConfirmationV03.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderV02#mmMasterReference
 * SubscriptionBulkOrderV02.mmMasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderV02#mmPoolReference
 * SubscriptionBulkOrderV02.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderV02#mmPreviousReference
 * SubscriptionBulkOrderV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderV03#mmPoolReference
 * SubscriptionBulkOrderV03.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderV03#mmPreviousReference
 * SubscriptionBulkOrderV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionMultipleOrderCancellationInstructionV02#mmMasterReference
 * SubscriptionMultipleOrderCancellationInstructionV02.mmMasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionMultipleOrderCancellationInstructionV02#mmPoolReference
 * SubscriptionMultipleOrderCancellationInstructionV02.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionMultipleOrderCancellationInstructionV02#mmPreviousReference
 * SubscriptionMultipleOrderCancellationInstructionV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV03#mmPoolReference
 * SubscriptionOrderCancellationRequestV03.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV03#mmPreviousReference
 * SubscriptionOrderCancellationRequestV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationAmendmentV01#mmPoolReference
 * SubscriptionOrderConfirmationAmendmentV01.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationAmendmentV01#mmPreviousReference
 * SubscriptionOrderConfirmationAmendmentV01.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationAmendmentV01#mmRelatedReference
 * SubscriptionOrderConfirmationAmendmentV01.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV01#mmPoolReference
 * SubscriptionOrderConfirmationCancellationInstructionV01.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV01#mmPreviousReference
 * SubscriptionOrderConfirmationCancellationInstructionV01.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV01#mmRelatedReference
 * SubscriptionOrderConfirmationCancellationInstructionV01.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionMultipleOrderConfirmationV02#mmMasterReference
 * SubscriptionMultipleOrderConfirmationV02.mmMasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionMultipleOrderConfirmationV02#mmPoolReference
 * SubscriptionMultipleOrderConfirmationV02.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionMultipleOrderConfirmationV02#mmPreviousReference
 * SubscriptionMultipleOrderConfirmationV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionMultipleOrderConfirmationV02#mmRelatedReference
 * SubscriptionMultipleOrderConfirmationV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV03#mmPoolReference
 * SubscriptionOrderConfirmationV03.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV03#mmPreviousReference
 * SubscriptionOrderConfirmationV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV03#mmRelatedReference
 * SubscriptionOrderConfirmationV03.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionMultipleOrderV02#mmMasterReference
 * SubscriptionMultipleOrderV02.mmMasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionMultipleOrderV02#mmPoolReference
 * SubscriptionMultipleOrderV02.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionMultipleOrderV02#mmPreviousReference
 * SubscriptionMultipleOrderV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderV03#mmPoolReference
 * SubscriptionOrderV03.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderV03#mmPreviousReference
 * SubscriptionOrderV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderCancellationInstructionV02#mmMasterReference
 * SwitchOrderCancellationInstructionV02.mmMasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderCancellationInstructionV02#mmPoolReference
 * SwitchOrderCancellationInstructionV02.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderCancellationInstructionV02#mmPreviousReference
 * SwitchOrderCancellationInstructionV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderCancellationRequestV03#mmPoolReference
 * SwitchOrderCancellationRequestV03.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderCancellationRequestV03#mmPreviousReference
 * SwitchOrderCancellationRequestV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationAmendmentV01#mmPoolReference
 * SwitchOrderConfirmationAmendmentV01.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationAmendmentV01#mmPreviousReference
 * SwitchOrderConfirmationAmendmentV01.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationAmendmentV01#mmRelatedReference
 * SwitchOrderConfirmationAmendmentV01.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01#mmPoolReference
 * SwitchOrderConfirmationCancellationInstructionV01.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01#mmPreviousReference
 * SwitchOrderConfirmationCancellationInstructionV01.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01#mmRelatedReference
 * SwitchOrderConfirmationCancellationInstructionV01.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationV02#mmMasterReference
 * SwitchOrderConfirmationV02.mmMasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationV02#mmPoolReference
 * SwitchOrderConfirmationV02.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationV02#mmPreviousReference
 * SwitchOrderConfirmationV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationV02#mmRelatedReference
 * SwitchOrderConfirmationV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationV03#mmPoolReference
 * SwitchOrderConfirmationV03.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationV03#mmPreviousReference
 * SwitchOrderConfirmationV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationV03#mmRelatedReference
 * SwitchOrderConfirmationV03.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV02#mmMasterReference
 * SwitchOrderV02.mmMasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV02#mmPoolReference
 * SwitchOrderV02.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV02#mmPreviousReference
 * SwitchOrderV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV03#mmPoolReference
 * SwitchOrderV03.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV03#mmPreviousReference
 * SwitchOrderV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV02#mmRelatedReference
 * TransferCancellationStatusReportV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV02#mmOtherReference
 * TransferCancellationStatusReportV02.mmOtherReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV03#mmRelatedReference
 * TransferCancellationStatusReportV03.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV03#mmOtherReference
 * TransferCancellationStatusReportV03.mmOtherReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV02#mmRelatedReference
 * TransferInstructionStatusReportV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV02#mmOtherReference
 * TransferInstructionStatusReportV02.mmOtherReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV03#mmRelatedReference
 * TransferInstructionStatusReportV03.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV03#mmOtherReference
 * TransferInstructionStatusReportV03.mmOtherReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForPEPOrISAOrPortfolioInformationV01#mmPoolReference
 * RequestForPEPOrISAOrPortfolioInformationV01.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForPEPOrISAOrPortfolioInformationV01#mmPreviousReference
 * RequestForPEPOrISAOrPortfolioInformationV01.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForPEPOrISAOrPortfolioInformationV01#mmRelatedReference
 * RequestForPEPOrISAOrPortfolioInformationV01.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV02#mmPoolReference
 * AccountHoldingInformationRequestV02.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV02#mmPreviousReference
 * AccountHoldingInformationRequestV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV02#mmRelatedReference
 * AccountHoldingInformationRequestV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCorrectionV02#mmPoolReference
 * PriceReportCorrectionV02.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCorrectionV02#mmPreviousReference
 * PriceReportCorrectionV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCorrectionV03#mmPoolReference
 * PriceReportCorrectionV03.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCorrectionV03#mmPreviousReference
 * PriceReportCorrectionV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04#mmRelatedReference
 * AccountDetailsConfirmationV04.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV04#mmPreviousReference
 * AccountModificationInstructionV04.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV04#mmPreviousReference
 * AccountOpeningInstructionV04.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03#mmPoolReference
 * AccountHoldingInformationRequestV03.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03#mmPreviousReference
 * AccountHoldingInformationRequestV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03#mmRelatedReference
 * AccountHoldingInformationRequestV03.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV04#mmPoolReference
 * AccountHoldingInformationV04.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV04#mmPreviousReference
 * AccountHoldingInformationV04.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV04#mmRelatedReference
 * AccountHoldingInformationV04.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV05#mmPoolReference
 * PortfolioTransferCancellationRequestV05.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV05#mmPreviousReference
 * PortfolioTransferCancellationRequestV05.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV05#mmRelatedReference
 * PortfolioTransferCancellationRequestV05.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV05#mmPoolReference
 * PortfolioTransferInstructionV05.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV05#mmPreviousReference
 * PortfolioTransferInstructionV05.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV05#mmRelatedReference
 * PortfolioTransferInstructionV05.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05#mmPoolReference
 * PortfolioTransferConfirmationV05.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05#mmPreviousReference
 * PortfolioTransferConfirmationV05.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05#mmRelatedReference
 * PortfolioTransferConfirmationV05.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV04#mmRelatedReference
 * AccountManagementStatusReportV04.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV04#mmPoolReference
 * FundDetailedEstimatedCashForecastReportV04.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV04#mmPreviousReference
 * FundDetailedEstimatedCashForecastReportV04.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV04#mmRelatedReference
 * FundDetailedEstimatedCashForecastReportV04.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV05#mmPreviousReference
 * AccountOpeningInstructionV05.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV04#mmPoolReference
 * FundConfirmedCashForecastReportV04.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV04#mmPreviousReference
 * FundConfirmedCashForecastReportV04.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV04#mmRelatedReference
 * FundConfirmedCashForecastReportV04.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV03#mmPoolReference
 * FundDetailedConfirmedCashForecastReportCancellationV03.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV03#mmPreviousReference
 * FundDetailedConfirmedCashForecastReportCancellationV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV03#mmRelatedReference
 * FundDetailedConfirmedCashForecastReportCancellationV03.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04#mmPoolReference
 * FundEstimatedCashForecastReportV04.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04#mmPreviousReference
 * FundEstimatedCashForecastReportV04.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04#mmRelatedReference
 * FundEstimatedCashForecastReportV04.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV05#mmPreviousReference
 * AccountModificationInstructionV05.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageRejectionV03#mmRelatedReference
 * SecuritiesMessageRejectionV03.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV03#mmPoolReference
 * FundConfirmedCashForecastReportCancellationV03.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV03#mmPreviousReference
 * FundConfirmedCashForecastReportCancellationV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV03#mmRelatedReference
 * FundConfirmedCashForecastReportCancellationV03.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmRelatedReference
 * AccountDetailsConfirmationV05.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV06#mmPoolReference
 * PortfolioTransferCancellationRequestV06.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV06#mmPreviousReference
 * PortfolioTransferCancellationRequestV06.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV06#mmRelatedReference
 * PortfolioTransferCancellationRequestV06.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04#mmPoolReference
 * FundDetailedConfirmedCashForecastReportV04.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04#mmPreviousReference
 * FundDetailedConfirmedCashForecastReportV04.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04#mmRelatedReference
 * FundDetailedConfirmedCashForecastReportV04.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06#mmPoolReference
 * PortfolioTransferConfirmationV06.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06#mmPreviousReference
 * PortfolioTransferConfirmationV06.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06#mmRelatedReference
 * PortfolioTransferConfirmationV06.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV06#mmPoolReference
 * PortfolioTransferInstructionV06.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV06#mmPreviousReference
 * PortfolioTransferInstructionV06.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV06#mmRelatedReference
 * PortfolioTransferInstructionV06.mmRelatedReference}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AdditionalReference3", propOrder = {"reference", "referenceIssuer", "messageName"})
public class AdditionalReference3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Ref", required = true)
	protected Max35Text reference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference8#mmReference
	 * AdditionalReference8.mmReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalReference3.mmObject();
			isDerived = false;
			xmlTag = "Ref";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reference";
			definition = "Business reference of a message assigned by the party issuing the message. This reference must be unique amongst all messages of the same name sent by the same party.";
			nextVersions_lazy = () -> Arrays.asList(AdditionalReference8.mmReference);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "RefIssr")
	protected PartyIdentification2Choice referenceIssuer;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference8#mmReferenceIssuer
	 * AdditionalReference8.mmReferenceIssuer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReferenceIssuer = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalReference3.mmObject();
			isDerived = false;
			xmlTag = "RefIssr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceIssuer";
			definition = "Issuer of the reference.";
			nextVersions_lazy = () -> Arrays.asList(AdditionalReference8.mmReferenceIssuer);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification2Choice.mmObject();
		}
	};
	@XmlElement(name = "MsgNm")
	protected Max35Text messageName;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference8#mmMessageName
	 * AdditionalReference8.mmMessageName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMessageName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalReference3.mmObject();
			isDerived = false;
			xmlTag = "MsgNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageName";
			definition = "Name of a message.";
			nextVersions_lazy = () -> Arrays.asList(AdditionalReference8.mmMessageName);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AdditionalReference3.mmReference, com.tools20022.repository.msg.AdditionalReference3.mmReferenceIssuer,
						com.tools20022.repository.msg.AdditionalReference3.mmMessageName);
				messageBuildingBlock_lazy = () -> Arrays.asList(InvestmentFundReportRequestV02.mmPreviousReference, InvestmentFundReportRequestV02.mmRelatedReference, AccountDetailsConfirmationV02.mmRelatedReference,
						AccountDetailsConfirmationV03.mmRelatedReference, PEPOrISAOrPortfolioInformationV01.mmPoolReference, PEPOrISAOrPortfolioInformationV01.mmPreviousReference, PEPOrISAOrPortfolioInformationV01.mmRelatedReference,
						AccountHoldingInformationV02.mmPoolReference, AccountHoldingInformationV02.mmPreviousReference, AccountHoldingInformationV02.mmRelatedReference, AccountHoldingInformationV03.mmPoolReference,
						AccountHoldingInformationV03.mmPreviousReference, AccountHoldingInformationV03.mmRelatedReference, AccountManagementStatusReportV02.mmRelatedReference, AccountManagementStatusReportV03.mmRelatedReference,
						AccountModificationInstructionV02.mmPreviousReference, AccountModificationInstructionV03.mmPreviousReference, AccountOpeningInstructionV02.mmPreviousReference, AccountOpeningInstructionV03.mmPreviousReference,
						PEPOrISAOrPortfolioTransferCancellationRequestV02.mmPoolReference, PEPOrISAOrPortfolioTransferCancellationRequestV02.mmPreviousReference, PEPOrISAOrPortfolioTransferCancellationRequestV02.mmRelatedReference,
						PortfolioTransferCancellationRequestV03.mmPoolReference, PortfolioTransferCancellationRequestV03.mmPreviousReference, PortfolioTransferCancellationRequestV03.mmRelatedReference,
						PortfolioTransferCancellationRequestV04.mmPoolReference, PortfolioTransferCancellationRequestV04.mmPreviousReference, PortfolioTransferCancellationRequestV04.mmRelatedReference,
						PEPOrISAOrPortfolioTransferConfirmationV02.mmPoolReference, PEPOrISAOrPortfolioTransferConfirmationV02.mmPreviousReference, PEPOrISAOrPortfolioTransferConfirmationV02.mmRelatedReference,
						PortfolioTransferConfirmationV03.mmPoolReference, PortfolioTransferConfirmationV03.mmPreviousReference, PortfolioTransferConfirmationV03.mmRelatedReference, PortfolioTransferConfirmationV04.mmPoolReference,
						PortfolioTransferConfirmationV04.mmPreviousReference, PortfolioTransferConfirmationV04.mmRelatedReference, PEPOrISAOrPortfolioTransferInstructionV02.mmPoolReference,
						PEPOrISAOrPortfolioTransferInstructionV02.mmPreviousReference, PEPOrISAOrPortfolioTransferInstructionV02.mmRelatedReference, PortfolioTransferInstructionV03.mmPoolReference,
						PortfolioTransferInstructionV03.mmPreviousReference, PortfolioTransferInstructionV03.mmRelatedReference, PortfolioTransferInstructionV04.mmPoolReference, PortfolioTransferInstructionV04.mmPreviousReference,
						PortfolioTransferInstructionV04.mmRelatedReference, PriceReportCancellationV02.mmPoolReference, PriceReportCancellationV02.mmPreviousReference, PriceReportCancellationV03.mmPoolReference,
						PriceReportCancellationV03.mmPreviousReference, PriceReportCancellationV04.mmPoolReference, PriceReportCancellationV04.mmPreviousReference, PriceReportV02.mmPoolReference, PriceReportV02.mmPreviousReference,
						PriceReportV02.mmRelatedReference, PriceReportV03.mmPoolReference, PriceReportV03.mmPreviousReference, PriceReportV03.mmRelatedReference, PriceReportV04.mmPoolReference, PriceReportV04.mmPreviousReference,
						PriceReportV04.mmRelatedReference, FundConfirmedCashForecastReportCancellationV01.mmPoolReference, FundConfirmedCashForecastReportCancellationV01.mmPreviousReference,
						FundConfirmedCashForecastReportCancellationV01.mmRelatedReference, FundConfirmedCashForecastReportCancellationV02.mmPoolReference, FundConfirmedCashForecastReportCancellationV02.mmPreviousReference,
						FundConfirmedCashForecastReportCancellationV02.mmRelatedReference, FundConfirmedCashForecastReportV02.mmPoolReference, FundConfirmedCashForecastReportV02.mmPreviousReference,
						FundConfirmedCashForecastReportV02.mmRelatedReference, FundConfirmedCashForecastReportV03.mmPoolReference, FundConfirmedCashForecastReportV03.mmPreviousReference,
						FundConfirmedCashForecastReportV03.mmRelatedReference, FundDetailedConfirmedCashForecastReportCancellationV01.mmPoolReference, FundDetailedConfirmedCashForecastReportCancellationV01.mmPreviousReference,
						FundDetailedConfirmedCashForecastReportCancellationV01.mmRelatedReference, FundDetailedConfirmedCashForecastReportCancellationV02.mmPoolReference,
						FundDetailedConfirmedCashForecastReportCancellationV02.mmPreviousReference, FundDetailedConfirmedCashForecastReportCancellationV02.mmRelatedReference, FundDetailedConfirmedCashForecastReportV02.mmPoolReference,
						FundDetailedConfirmedCashForecastReportV02.mmPreviousReference, FundDetailedConfirmedCashForecastReportV02.mmRelatedReference, FundDetailedConfirmedCashForecastReportV03.mmPoolReference,
						FundDetailedConfirmedCashForecastReportV03.mmPreviousReference, FundDetailedConfirmedCashForecastReportV03.mmRelatedReference, FundDetailedEstimatedCashForecastReportV02.mmPoolReference,
						FundDetailedEstimatedCashForecastReportV02.mmPreviousReference, FundDetailedEstimatedCashForecastReportV02.mmRelatedReference, FundDetailedEstimatedCashForecastReportV03.mmPoolReference,
						FundDetailedEstimatedCashForecastReportV03.mmPreviousReference, FundDetailedEstimatedCashForecastReportV03.mmRelatedReference, FundEstimatedCashForecastReportV02.mmPoolReference,
						FundEstimatedCashForecastReportV02.mmPreviousReference, FundEstimatedCashForecastReportV02.mmRelatedReference, FundEstimatedCashForecastReportV03.mmPoolReference,
						FundEstimatedCashForecastReportV03.mmPreviousReference, FundEstimatedCashForecastReportV03.mmRelatedReference, OrderCancellationStatusReportV02.mmRelatedReference, OrderCancellationStatusReportV02.mmOtherReference,
						OrderCancellationStatusReportV03.mmRelatedReference, OrderCancellationStatusReportV03.mmOtherReference, OrderConfirmationStatusReportV01.mmOtherReference, OrderConfirmationStatusReportV01.mmRelatedReference,
						OrderInstructionStatusReportV02.mmOtherReference, OrderInstructionStatusReportV02.mmRelatedReference, OrderInstructionStatusReportV02.mmMasterReference, OrderInstructionStatusReportV03.mmOtherReference,
						OrderInstructionStatusReportV03.mmRelatedReference, RedemptionBulkOrderCancellationInstructionV02.mmMasterReference, RedemptionBulkOrderCancellationInstructionV02.mmPoolReference,
						RedemptionBulkOrderCancellationInstructionV02.mmPreviousReference, RedemptionBulkOrderCancellationRequestV03.mmPoolReference, RedemptionBulkOrderCancellationRequestV03.mmPreviousReference,
						RedemptionBulkOrderConfirmationAmendmentV01.mmPoolReference, RedemptionBulkOrderConfirmationAmendmentV01.mmPreviousReference, RedemptionBulkOrderConfirmationAmendmentV01.mmRelatedReference,
						RedemptionBulkOrderConfirmationCancellationInstructionV01.mmPoolReference, RedemptionBulkOrderConfirmationCancellationInstructionV01.mmPreviousReference,
						RedemptionBulkOrderConfirmationCancellationInstructionV01.mmRelatedReference, RedemptionBulkOrderConfirmationV02.mmMasterReference, RedemptionBulkOrderConfirmationV02.mmPoolReference,
						RedemptionBulkOrderConfirmationV02.mmPreviousReference, RedemptionBulkOrderConfirmationV02.mmRelatedReference, RedemptionBulkOrderConfirmationV03.mmPoolReference,
						RedemptionBulkOrderConfirmationV03.mmPreviousReference, RedemptionBulkOrderConfirmationV03.mmRelatedReference, RedemptionBulkOrderV02.mmMasterReference, RedemptionBulkOrderV02.mmPoolReference,
						RedemptionBulkOrderV02.mmPreviousReference, RedemptionBulkOrderV03.mmPoolReference, RedemptionBulkOrderV03.mmPreviousReference, RedemptionMultipleOrderCancellationInstructionV02.mmMasterReference,
						RedemptionMultipleOrderCancellationInstructionV02.mmPoolReference, RedemptionMultipleOrderCancellationInstructionV02.mmPreviousReference, RedemptionOrderCancellationRequestV03.mmPoolReference,
						RedemptionOrderCancellationRequestV03.mmPreviousReference, RedemptionOrderConfirmationAmendmentV01.mmPoolReference, RedemptionOrderConfirmationAmendmentV01.mmPreviousReference,
						RedemptionOrderConfirmationAmendmentV01.mmRelatedReference, RedemptionOrderConfirmationCancellationInstructionV01.mmPoolReference, RedemptionOrderConfirmationCancellationInstructionV01.mmPreviousReference,
						RedemptionOrderConfirmationCancellationInstructionV01.mmRelatedReference, RedemptionMultipleOrderConfirmationV02.mmMasterReference, RedemptionMultipleOrderConfirmationV02.mmPoolReference,
						RedemptionMultipleOrderConfirmationV02.mmPreviousReference, RedemptionMultipleOrderConfirmationV02.mmRelatedReference, RedemptionOrderConfirmationV03.mmPoolReference,
						RedemptionOrderConfirmationV03.mmPreviousReference, RedemptionOrderConfirmationV03.mmRelatedReference, RedemptionMultipleOrderV02.mmMasterReference, RedemptionMultipleOrderV02.mmPoolReference,
						RedemptionMultipleOrderV02.mmPreviousReference, RedemptionOrderV03.mmPoolReference, RedemptionOrderV03.mmPreviousReference, SecuritiesMessageRejectionV02.mmRelatedReference,
						SubscriptionBulkOrderCancellationInstructionV02.mmMasterReference, SubscriptionBulkOrderCancellationInstructionV02.mmPoolReference, SubscriptionBulkOrderCancellationInstructionV02.mmPreviousReference,
						SubscriptionBulkOrderCancellationRequestV03.mmPoolReference, SubscriptionBulkOrderCancellationRequestV03.mmPreviousReference, SubscriptionBulkOrderConfirmationAmendmentV01.mmPoolReference,
						SubscriptionBulkOrderConfirmationAmendmentV01.mmPreviousReference, SubscriptionBulkOrderConfirmationAmendmentV01.mmRelatedReference, SubscriptionBulkOrderConfirmationCancellationInstructionV01.mmPoolReference,
						SubscriptionBulkOrderConfirmationCancellationInstructionV01.mmPreviousReference, SubscriptionBulkOrderConfirmationCancellationInstructionV01.mmRelatedReference,
						SubscriptionBulkOrderConfirmationV02.mmMasterReference, SubscriptionBulkOrderConfirmationV02.mmPoolReference, SubscriptionBulkOrderConfirmationV02.mmPreviousReference,
						SubscriptionBulkOrderConfirmationV02.mmRelatedReference, SubscriptionBulkOrderConfirmationV03.mmPoolReference, SubscriptionBulkOrderConfirmationV03.mmPreviousReference,
						SubscriptionBulkOrderConfirmationV03.mmRelatedReference, SubscriptionBulkOrderV02.mmMasterReference, SubscriptionBulkOrderV02.mmPoolReference, SubscriptionBulkOrderV02.mmPreviousReference,
						SubscriptionBulkOrderV03.mmPoolReference, SubscriptionBulkOrderV03.mmPreviousReference, SubscriptionMultipleOrderCancellationInstructionV02.mmMasterReference,
						SubscriptionMultipleOrderCancellationInstructionV02.mmPoolReference, SubscriptionMultipleOrderCancellationInstructionV02.mmPreviousReference, SubscriptionOrderCancellationRequestV03.mmPoolReference,
						SubscriptionOrderCancellationRequestV03.mmPreviousReference, SubscriptionOrderConfirmationAmendmentV01.mmPoolReference, SubscriptionOrderConfirmationAmendmentV01.mmPreviousReference,
						SubscriptionOrderConfirmationAmendmentV01.mmRelatedReference, SubscriptionOrderConfirmationCancellationInstructionV01.mmPoolReference, SubscriptionOrderConfirmationCancellationInstructionV01.mmPreviousReference,
						SubscriptionOrderConfirmationCancellationInstructionV01.mmRelatedReference, SubscriptionMultipleOrderConfirmationV02.mmMasterReference, SubscriptionMultipleOrderConfirmationV02.mmPoolReference,
						SubscriptionMultipleOrderConfirmationV02.mmPreviousReference, SubscriptionMultipleOrderConfirmationV02.mmRelatedReference, SubscriptionOrderConfirmationV03.mmPoolReference,
						SubscriptionOrderConfirmationV03.mmPreviousReference, SubscriptionOrderConfirmationV03.mmRelatedReference, SubscriptionMultipleOrderV02.mmMasterReference, SubscriptionMultipleOrderV02.mmPoolReference,
						SubscriptionMultipleOrderV02.mmPreviousReference, SubscriptionOrderV03.mmPoolReference, SubscriptionOrderV03.mmPreviousReference, SwitchOrderCancellationInstructionV02.mmMasterReference,
						SwitchOrderCancellationInstructionV02.mmPoolReference, SwitchOrderCancellationInstructionV02.mmPreviousReference, SwitchOrderCancellationRequestV03.mmPoolReference,
						SwitchOrderCancellationRequestV03.mmPreviousReference, SwitchOrderConfirmationAmendmentV01.mmPoolReference, SwitchOrderConfirmationAmendmentV01.mmPreviousReference,
						SwitchOrderConfirmationAmendmentV01.mmRelatedReference, SwitchOrderConfirmationCancellationInstructionV01.mmPoolReference, SwitchOrderConfirmationCancellationInstructionV01.mmPreviousReference,
						SwitchOrderConfirmationCancellationInstructionV01.mmRelatedReference, SwitchOrderConfirmationV02.mmMasterReference, SwitchOrderConfirmationV02.mmPoolReference, SwitchOrderConfirmationV02.mmPreviousReference,
						SwitchOrderConfirmationV02.mmRelatedReference, SwitchOrderConfirmationV03.mmPoolReference, SwitchOrderConfirmationV03.mmPreviousReference, SwitchOrderConfirmationV03.mmRelatedReference,
						SwitchOrderV02.mmMasterReference, SwitchOrderV02.mmPoolReference, SwitchOrderV02.mmPreviousReference, SwitchOrderV03.mmPoolReference, SwitchOrderV03.mmPreviousReference,
						TransferCancellationStatusReportV02.mmRelatedReference, TransferCancellationStatusReportV02.mmOtherReference, TransferCancellationStatusReportV03.mmRelatedReference,
						TransferCancellationStatusReportV03.mmOtherReference, TransferInstructionStatusReportV02.mmRelatedReference, TransferInstructionStatusReportV02.mmOtherReference,
						TransferInstructionStatusReportV03.mmRelatedReference, TransferInstructionStatusReportV03.mmOtherReference, RequestForPEPOrISAOrPortfolioInformationV01.mmPoolReference,
						RequestForPEPOrISAOrPortfolioInformationV01.mmPreviousReference, RequestForPEPOrISAOrPortfolioInformationV01.mmRelatedReference, AccountHoldingInformationRequestV02.mmPoolReference,
						AccountHoldingInformationRequestV02.mmPreviousReference, AccountHoldingInformationRequestV02.mmRelatedReference, PriceReportCorrectionV02.mmPoolReference, PriceReportCorrectionV02.mmPreviousReference,
						PriceReportCorrectionV03.mmPoolReference, PriceReportCorrectionV03.mmPreviousReference, AccountDetailsConfirmationV04.mmRelatedReference, AccountModificationInstructionV04.mmPreviousReference,
						AccountOpeningInstructionV04.mmPreviousReference, AccountHoldingInformationRequestV03.mmPoolReference, AccountHoldingInformationRequestV03.mmPreviousReference, AccountHoldingInformationRequestV03.mmRelatedReference,
						AccountHoldingInformationV04.mmPoolReference, AccountHoldingInformationV04.mmPreviousReference, AccountHoldingInformationV04.mmRelatedReference, PortfolioTransferCancellationRequestV05.mmPoolReference,
						PortfolioTransferCancellationRequestV05.mmPreviousReference, PortfolioTransferCancellationRequestV05.mmRelatedReference, PortfolioTransferInstructionV05.mmPoolReference,
						PortfolioTransferInstructionV05.mmPreviousReference, PortfolioTransferInstructionV05.mmRelatedReference, PortfolioTransferConfirmationV05.mmPoolReference, PortfolioTransferConfirmationV05.mmPreviousReference,
						PortfolioTransferConfirmationV05.mmRelatedReference, AccountManagementStatusReportV04.mmRelatedReference, FundDetailedEstimatedCashForecastReportV04.mmPoolReference,
						FundDetailedEstimatedCashForecastReportV04.mmPreviousReference, FundDetailedEstimatedCashForecastReportV04.mmRelatedReference, AccountOpeningInstructionV05.mmPreviousReference,
						FundConfirmedCashForecastReportV04.mmPoolReference, FundConfirmedCashForecastReportV04.mmPreviousReference, FundConfirmedCashForecastReportV04.mmRelatedReference,
						FundDetailedConfirmedCashForecastReportCancellationV03.mmPoolReference, FundDetailedConfirmedCashForecastReportCancellationV03.mmPreviousReference,
						FundDetailedConfirmedCashForecastReportCancellationV03.mmRelatedReference, FundEstimatedCashForecastReportV04.mmPoolReference, FundEstimatedCashForecastReportV04.mmPreviousReference,
						FundEstimatedCashForecastReportV04.mmRelatedReference, AccountModificationInstructionV05.mmPreviousReference, SecuritiesMessageRejectionV03.mmRelatedReference,
						FundConfirmedCashForecastReportCancellationV03.mmPoolReference, FundConfirmedCashForecastReportCancellationV03.mmPreviousReference, FundConfirmedCashForecastReportCancellationV03.mmRelatedReference,
						AccountDetailsConfirmationV05.mmRelatedReference, PortfolioTransferCancellationRequestV06.mmPoolReference, PortfolioTransferCancellationRequestV06.mmPreviousReference,
						PortfolioTransferCancellationRequestV06.mmRelatedReference, FundDetailedConfirmedCashForecastReportV04.mmPoolReference, FundDetailedConfirmedCashForecastReportV04.mmPreviousReference,
						FundDetailedConfirmedCashForecastReportV04.mmRelatedReference, PortfolioTransferConfirmationV06.mmPoolReference, PortfolioTransferConfirmationV06.mmPreviousReference,
						PortfolioTransferConfirmationV06.mmRelatedReference, PortfolioTransferInstructionV06.mmPoolReference, PortfolioTransferInstructionV06.mmPreviousReference, PortfolioTransferInstructionV06.mmRelatedReference);
				trace_lazy = () -> GenericIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AdditionalReference3";
				definition = "References a related message or provides another reference, such as a pool reference, linking a set of messages. The party which issued the related reference may be the Sender of the referenced message or a party other than the Sender.";
				nextVersions_lazy = () -> Arrays.asList(AdditionalReference8.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getReference() {
		return reference;
	}

	public AdditionalReference3 setReference(Max35Text reference) {
		this.reference = Objects.requireNonNull(reference);
		return this;
	}

	public Optional<PartyIdentification2Choice> getReferenceIssuer() {
		return referenceIssuer == null ? Optional.empty() : Optional.of(referenceIssuer);
	}

	public AdditionalReference3 setReferenceIssuer(PartyIdentification2Choice referenceIssuer) {
		this.referenceIssuer = referenceIssuer;
		return this;
	}

	public Optional<Max35Text> getMessageName() {
		return messageName == null ? Optional.empty() : Optional.of(messageName);
	}

	public AdditionalReference3 setMessageName(Max35Text messageName) {
		this.messageName = messageName;
		return this;
	}
}