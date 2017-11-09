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
import com.tools20022.repository.area.sese.PortfolioTransferConfirmationV03;
import com.tools20022.repository.choice.ISAPortfolio2Choice;
import com.tools20022.repository.codeset.ResidualCash1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.InvestmentFundClass;
import com.tools20022.repository.entity.Order;
import com.tools20022.repository.entity.PortfolioTransfer;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Describes the type of product and the assets to be transferred.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer2#mmMasterReference
 * ISATransfer2.mmMasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer2#mmTransferConfirmationIdentification
 * ISATransfer2.mmTransferConfirmationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer2#mmTransferInstructionReference
 * ISATransfer2.mmTransferInstructionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer2#mmActualTransferDate
 * ISATransfer2.mmActualTransferDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer2#mmResidualCash
 * ISATransfer2.mmResidualCash}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer2#mmPortfolio
 * ISATransfer2.mmPortfolio}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer2#mmAllOtherCash
 * ISATransfer2.mmAllOtherCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer2#mmFinancialInstrumentAssetForTransfer
 * ISATransfer2.mmFinancialInstrumentAssetForTransfer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PortfolioTransfer
 * PortfolioTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV03#mmProductTransfer
 * PortfolioTransferConfirmationV03.mmProductTransfer}</li>
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
 * "ISATransfer2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Describes the type of product and the assets to be transferred."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer10 ISATransfer10}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.PEPISATransfer4
 * PEPISATransfer4}</li>
 * </ul>
 */
public class ISATransfer2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text masterReference;
	/**
	 * Unique and unambiguous identifier for a group of individual transfers as
	 * assigned by the instructing party. This identifier links the individual
	 * transfers together.
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
	 * {@linkplain com.tools20022.repository.entity.Order#mmMasterIdentification
	 * Order.mmMasterIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer2 ISATransfer2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MstrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a group of individual transfers as assigned by the instructing party. This identifier links the individual transfers together."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMasterReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Order.mmMasterIdentification;
			componentContext_lazy = () -> ISATransfer2.mmObject();
			isDerived = false;
			xmlTag = "MstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterReference";
			definition = "Unique and unambiguous identifier for a group of individual transfers as assigned by the instructing party. This identifier links the individual transfers together.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text transferConfirmationIdentification;
	/**
	 * Identification of the confirmation assigned by the old plan manager to
	 * the transfer of account.
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
	 * {@linkplain com.tools20022.repository.msg.ISATransfer2 ISATransfer2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfConfId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferConfirmationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the confirmation assigned by the old plan manager to the transfer of account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransferConfirmationIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ISATransfer2.mmObject();
			isDerived = false;
			xmlTag = "TrfConfId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferConfirmationIdentification";
			definition = "Identification of the confirmation assigned by the old plan manager to the transfer of account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text transferInstructionReference;
	/**
	 * Identification received by the old plan manager and assigned by the new
	 * plan manager to the transfer of account.
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
	 * {@linkplain com.tools20022.repository.msg.ISATransfer2 ISATransfer2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfInstrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferInstructionReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification received by the old plan manager and assigned by the new plan manager to the transfer of account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransferInstructionReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ISATransfer2.mmObject();
			isDerived = false;
			xmlTag = "TrfInstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferInstructionReference";
			definition = "Identification received by the old plan manager and assigned by the new plan manager to the transfer of account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ISODate actualTransferDate;
	/**
	 * Date when the transfer instruction was executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmTransferDate
	 * PortfolioTransfer.mmTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer2 ISATransfer2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActlTrfDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualTransferDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date when the transfer instruction was executed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmActualTransferDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PortfolioTransfer.mmTransferDate;
			componentContext_lazy = () -> ISATransfer2.mmObject();
			isDerived = false;
			xmlTag = "ActlTrfDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActualTransferDate";
			definition = "Date when the transfer instruction was executed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ResidualCash1Code residualCash;
	/**
	 * Indicates whether there is cash in the account that is awaiting
	 * investment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ResidualCash1Code
	 * ResidualCash1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer2 ISATransfer2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RsdlCsh"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResidualCash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether there is cash in the account that is awaiting investment."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmResidualCash = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ISATransfer2.mmObject();
			isDerived = false;
			xmlTag = "RsdlCsh";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResidualCash";
			definition = "Indicates whether there is cash in the account that is awaiting investment.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ResidualCash1Code.mmObject();
		}
	};
	protected ISAPortfolio2Choice portfolio;
	/**
	 * Specifies portfolio information or government schemes, for example
	 * Individual Savings Account (ISA) in the UK.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.ISAPortfolio2Choice
	 * ISAPortfolio2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmTransferredPortfolio
	 * PortfolioTransfer.mmTransferredPortfolio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer2 ISATransfer2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtfl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Portfolio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies portfolio information or government schemes, for example Individual Savings Account (ISA) in the UK."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPortfolio = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PortfolioTransfer.mmTransferredPortfolio;
			componentContext_lazy = () -> ISATransfer2.mmObject();
			isDerived = false;
			xmlTag = "Prtfl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Portfolio";
			definition = "Specifies portfolio information or government schemes, for example Individual Savings Account (ISA) in the UK.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ISAPortfolio2Choice.mmObject();
		}
	};
	protected YesNoIndicator allOtherCash;
	/**
	 * Indicator that all remaining assets in a portfolio not listed for
	 * transfer should be liquidated and transferred as cash.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer2 ISATransfer2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AllOthrCsh"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllOtherCash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicator that all remaining assets in a portfolio not listed for transfer should be liquidated and transferred as cash."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAllOtherCash = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ISATransfer2.mmObject();
			isDerived = false;
			xmlTag = "AllOthrCsh";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllOtherCash";
			definition = "Indicator that all remaining assets in a portfolio not listed for transfer should be liquidated and transferred as cash.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.FinancialInstrument24> financialInstrumentAssetForTransfer;
	/**
	 * Specifies the underlying assets for the ISA or portfolio.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstrument24
	 * FinancialInstrument24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer2 ISATransfer2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmAsstForTrf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAssetForTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the underlying assets for the ISA or portfolio."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentAssetForTransfer = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundClass.mmObject();
			componentContext_lazy = () -> ISATransfer2.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmAsstForTrf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAssetForTransfer";
			definition = "Specifies the underlying assets for the ISA or portfolio.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrument24.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ISATransfer2.mmMasterReference, ISATransfer2.mmTransferConfirmationIdentification, ISATransfer2.mmTransferInstructionReference, ISATransfer2.mmActualTransferDate,
						ISATransfer2.mmResidualCash, ISATransfer2.mmPortfolio, ISATransfer2.mmAllOtherCash, ISATransfer2.mmFinancialInstrumentAssetForTransfer);
				messageBuildingBlock_lazy = () -> Arrays.asList(PortfolioTransferConfirmationV03.mmProductTransfer);
				trace_lazy = () -> PortfolioTransfer.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ISATransfer2";
				definition = "Describes the type of product and the assets to be transferred.";
				nextVersions_lazy = () -> Arrays.asList(ISATransfer10.mmObject());
				previousVersion_lazy = () -> PEPISATransfer4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getMasterReference() {
		return masterReference;
	}

	public void setMasterReference(Max35Text masterReference) {
		this.masterReference = masterReference;
	}

	public Max35Text getTransferConfirmationIdentification() {
		return transferConfirmationIdentification;
	}

	public void setTransferConfirmationIdentification(Max35Text transferConfirmationIdentification) {
		this.transferConfirmationIdentification = transferConfirmationIdentification;
	}

	public Max35Text getTransferInstructionReference() {
		return transferInstructionReference;
	}

	public void setTransferInstructionReference(Max35Text transferInstructionReference) {
		this.transferInstructionReference = transferInstructionReference;
	}

	public ISODate getActualTransferDate() {
		return actualTransferDate;
	}

	public void setActualTransferDate(ISODate actualTransferDate) {
		this.actualTransferDate = actualTransferDate;
	}

	public ResidualCash1Code getResidualCash() {
		return residualCash;
	}

	public void setResidualCash(ResidualCash1Code residualCash) {
		this.residualCash = residualCash;
	}

	public ISAPortfolio2Choice getPortfolio() {
		return portfolio;
	}

	public void setPortfolio(ISAPortfolio2Choice portfolio) {
		this.portfolio = portfolio;
	}

	public YesNoIndicator getAllOtherCash() {
		return allOtherCash;
	}

	public void setAllOtherCash(YesNoIndicator allOtherCash) {
		this.allOtherCash = allOtherCash;
	}

	public List<FinancialInstrument24> getFinancialInstrumentAssetForTransfer() {
		return financialInstrumentAssetForTransfer;
	}

	public void setFinancialInstrumentAssetForTransfer(List<com.tools20022.repository.msg.FinancialInstrument24> financialInstrumentAssetForTransfer) {
		this.financialInstrumentAssetForTransfer = financialInstrumentAssetForTransfer;
	}
}