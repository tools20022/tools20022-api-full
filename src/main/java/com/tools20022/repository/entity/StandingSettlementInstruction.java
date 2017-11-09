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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.SettlementStandingInstructionDatabaseCode;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Settlement instruction database information.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="StandingSettlementInstruction"
 * src="doc-files/StandingSettlementInstruction.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FXStandingInstruction1Choice
 * FXStandingInstruction1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStandingInstructionDatabase1Choice
 * SettlementStandingInstructionDatabase1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StandingSettlementInstruction1
 * StandingSettlementInstruction1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StandingSettlementInstruction4
 * StandingSettlementInstruction4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FXStandingInstruction2Choice
 * FXStandingInstruction2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStandingInstructionDatabase2Choice
 * SettlementStandingInstructionDatabase2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StandingSettlementInstruction7
 * StandingSettlementInstruction7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StandingSettlementInstruction2
 * StandingSettlementInstruction2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StandingSettlementInstruction3
 * StandingSettlementInstruction3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StandingSettlementInstruction6
 * StandingSettlementInstruction6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FXStandingInstruction3Choice
 * FXStandingInstruction3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStandingInstructionDatabase3Choice
 * SettlementStandingInstructionDatabase3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StandingSettlementInstruction9
 * StandingSettlementInstruction9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StandingSettlementInstruction5
 * StandingSettlementInstruction5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StandingSettlementInstruction8
 * StandingSettlementInstruction8}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction11
 * StandingSettlementInstruction11}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStandingInstructionDatabase4Choice
 * SettlementStandingInstructionDatabase4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FXStandingInstruction4Choice
 * FXStandingInstruction4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction12
 * StandingSettlementInstruction12}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FXStandingInstruction5Choice
 * FXStandingInstruction5Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStandingInstructionDatabase5Choice
 * SettlementStandingInstructionDatabase5Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Asset#mmStandingSettlementInstruction
 * Asset.mmStandingSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedStandingSettlementInstruction
 * DateTimePeriod.mmRelatedStandingSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Settlement#mmStandingSettlementInstruction
 * Settlement.mmStandingSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#mmStandingSettlementInstructions
 * CollateralAgreement.mmStandingSettlementInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SSIDatabaseProvider#mmStandingSettlementDatabase
 * SSIDatabaseProvider.mmStandingSettlementDatabase}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction1#mmSettlementStandingInstructionDatabase
 * StandingSettlementInstruction1.mmSettlementStandingInstructionDatabase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction4#mmSettlementStandingInstructionDatabase
 * StandingSettlementInstruction4.mmSettlementStandingInstructionDatabase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction7#mmSettlementStandingInstructionDatabase
 * StandingSettlementInstruction7.mmSettlementStandingInstructionDatabase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction2#mmSettlementStandingInstructionDatabase
 * StandingSettlementInstruction2.mmSettlementStandingInstructionDatabase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction3#mmSettlementStandingInstructionDatabase
 * StandingSettlementInstruction3.mmSettlementStandingInstructionDatabase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction6#mmSettlementStandingInstructionDatabase
 * StandingSettlementInstruction6.mmSettlementStandingInstructionDatabase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction9#mmSettlementStandingInstructionDatabase
 * StandingSettlementInstruction9.mmSettlementStandingInstructionDatabase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction5#mmSettlementStandingInstructionDatabase
 * StandingSettlementInstruction5.mmSettlementStandingInstructionDatabase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction8#mmSettlementStandingInstructionDatabase
 * StandingSettlementInstruction8.mmSettlementStandingInstructionDatabase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction11#mmSettlementStandingInstructionDatabase
 * StandingSettlementInstruction11.mmSettlementStandingInstructionDatabase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction12#mmSettlementStandingInstructionDatabase
 * StandingSettlementInstruction12.mmSettlementStandingInstructionDatabase}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AgentCorporateActionStandingInstruction
 * AgentCorporateActionStandingInstruction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#mmSettlement
 * StandingSettlementInstruction.mmSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#mmFXStandingInstruction
 * StandingSettlementInstruction.mmFXStandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#mmSettlementStandingInstructionDatabase
 * StandingSettlementInstruction.mmSettlementStandingInstructionDatabase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#mmIdentification
 * StandingSettlementInstruction.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#mmRelatedCollateralAgreement
 * StandingSettlementInstruction.mmRelatedCollateralAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#mmSSIDatabaseName
 * StandingSettlementInstruction.mmSSIDatabaseName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#mmSSIDatabaseProvider
 * StandingSettlementInstruction.mmSSIDatabaseProvider}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#mmValidityPeriod
 * StandingSettlementInstruction.mmValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#mmCurrency
 * StandingSettlementInstruction.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#mmAsset
 * StandingSettlementInstruction.mmAsset}</li>
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
 * "StandingSettlementInstruction"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Settlement instruction database information."</li>
 * </ul>
 */
public class StandingSettlementInstruction {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.Settlement> settlement;
	/**
	 * Settlement process to which the settlement instruction database applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Settlement#mmStandingSettlementInstruction
	 * Settlement.mmStandingSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Settlement
	 * Settlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction
	 * StandingSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement process to which the settlement instruction database applies."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSettlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> StandingSettlementInstruction.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Settlement";
			definition = "Settlement process to which the settlement instruction database applies.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Settlement.mmStandingSettlementInstruction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Settlement.mmObject();
		}
	};
	protected YesNoIndicator fXStandingInstruction;
	/**
	 * Specifies whether the forex standing instruction in place should apply.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction
	 * StandingSettlementInstruction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FXStandingInstruction1Choice#mmIndicator
	 * FXStandingInstruction1Choice.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FXStandingInstruction1Choice#mmProprietary
	 * FXStandingInstruction1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FXStandingInstruction2Choice#mmIndicator
	 * FXStandingInstruction2Choice.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FXStandingInstruction2Choice#mmProprietary
	 * FXStandingInstruction2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FXStandingInstruction3Choice#mmIndicator
	 * FXStandingInstruction3Choice.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FXStandingInstruction3Choice#mmProprietary
	 * FXStandingInstruction3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FXStandingInstruction4Choice#mmIndicator
	 * FXStandingInstruction4Choice.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FXStandingInstruction4Choice#mmProprietary
	 * FXStandingInstruction4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FXStandingInstruction5Choice#mmIndicator
	 * FXStandingInstruction5Choice.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FXStandingInstruction5Choice#mmProprietary
	 * FXStandingInstruction5Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXStandingInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the forex standing instruction in place should apply."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFXStandingInstruction = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FXStandingInstruction1Choice.mmIndicator, FXStandingInstruction1Choice.mmProprietary, FXStandingInstruction2Choice.mmIndicator, FXStandingInstruction2Choice.mmProprietary,
					FXStandingInstruction3Choice.mmIndicator, FXStandingInstruction3Choice.mmProprietary, FXStandingInstruction4Choice.mmIndicator, FXStandingInstruction4Choice.mmProprietary, FXStandingInstruction5Choice.mmIndicator,
					FXStandingInstruction5Choice.mmProprietary);
			elementContext_lazy = () -> StandingSettlementInstruction.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FXStandingInstruction";
			definition = "Specifies whether the forex standing instruction in place should apply.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected SettlementStandingInstructionDatabaseCode settlementStandingInstructionDatabase;
	/**
	 * Specifies what settlement standing instruction database is to be used to
	 * derive the settlement parties involved in the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementStandingInstructionDatabaseCode
	 * SettlementStandingInstructionDatabaseCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction
	 * StandingSettlementInstruction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStandingInstructionDatabase1Choice#mmCode
	 * SettlementStandingInstructionDatabase1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStandingInstructionDatabase1Choice#mmProprietary
	 * SettlementStandingInstructionDatabase1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStandingInstructionDatabase2Choice#mmCode
	 * SettlementStandingInstructionDatabase2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStandingInstructionDatabase2Choice#mmProprietary
	 * SettlementStandingInstructionDatabase2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStandingInstructionDatabase3Choice#mmCode
	 * SettlementStandingInstructionDatabase3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStandingInstructionDatabase3Choice#mmProprietary
	 * SettlementStandingInstructionDatabase3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStandingInstructionDatabase4Choice#mmCode
	 * SettlementStandingInstructionDatabase4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStandingInstructionDatabase4Choice#mmProprietary
	 * SettlementStandingInstructionDatabase4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStandingInstructionDatabase5Choice#mmCode
	 * SettlementStandingInstructionDatabase5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStandingInstructionDatabase5Choice#mmProprietary
	 * SettlementStandingInstructionDatabase5Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStandingInstructionDatabase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies what settlement standing instruction database is to be used to derive the settlement parties involved in the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSettlementStandingInstructionDatabase = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementStandingInstructionDatabase1Choice.mmCode, SettlementStandingInstructionDatabase1Choice.mmProprietary, SettlementStandingInstructionDatabase2Choice.mmCode,
					SettlementStandingInstructionDatabase2Choice.mmProprietary, SettlementStandingInstructionDatabase3Choice.mmCode, SettlementStandingInstructionDatabase3Choice.mmProprietary,
					SettlementStandingInstructionDatabase4Choice.mmCode, SettlementStandingInstructionDatabase4Choice.mmProprietary, SettlementStandingInstructionDatabase5Choice.mmCode,
					SettlementStandingInstructionDatabase5Choice.mmProprietary);
			elementContext_lazy = () -> StandingSettlementInstruction.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementStandingInstructionDatabase";
			definition = "Specifies what settlement standing instruction database is to be used to derive the settlement parties involved in the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementStandingInstructionDatabaseCode.mmObject();
		}
	};
	protected Max35Text identification;
	/**
	 * Identification of the standing instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction
	 * StandingSettlementInstruction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionGeneralInformation1#mmClientStandingInstructionIdentification
	 * CorporateActionStandingInstructionGeneralInformation1.
	 * mmClientStandingInstructionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the standing instruction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionStandingInstructionGeneralInformation1.mmClientStandingInstructionIdentification);
			elementContext_lazy = () -> StandingSettlementInstruction.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identification of the standing instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected CollateralAgreement relatedCollateralAgreement;
	/**
	 * Collateral agreement for which standing settlement instructions are
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#mmStandingSettlementInstructions
	 * CollateralAgreement.mmStandingSettlementInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CollateralAgreement
	 * CollateralAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction
	 * StandingSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCollateralAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collateral agreement for which standing settlement instructions are specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedCollateralAgreement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> StandingSettlementInstruction.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCollateralAgreement";
			definition = "Collateral agreement for which standing settlement instructions are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralAgreement.mmStandingSettlementInstructions;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralAgreement.mmObject();
		}
	};
	protected Max350Text sSIDatabaseName;
	/**
	 * Specifies the settlement standing instruction database to be used to
	 * derive the settlement parties involved in a transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction
	 * StandingSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SSIDatabaseName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the settlement standing instruction database to be used to derive the settlement parties involved in a transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSSIDatabaseName = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> StandingSettlementInstruction.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SSIDatabaseName";
			definition = "Specifies the settlement standing instruction database to be used to derive the settlement parties involved in a transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected SSIDatabaseProvider sSIDatabaseProvider;
	/**
	 * Party which provides information on the parties and accounts to be used
	 * to settle a transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SSIDatabaseProvider#mmStandingSettlementDatabase
	 * SSIDatabaseProvider.mmStandingSettlementDatabase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SSIDatabaseProvider
	 * SSIDatabaseProvider}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction
	 * StandingSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SSIDatabaseProvider"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party which provides information on the parties and accounts to be used to settle a transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSSIDatabaseProvider = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> StandingSettlementInstruction.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SSIDatabaseProvider";
			definition = "Party which provides information on the parties and accounts to be used to settle a transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SSIDatabaseProvider.mmStandingSettlementDatabase;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SSIDatabaseProvider.mmObject();
		}
	};
	protected DateTimePeriod validityPeriod;
	/**
	 * Period during which the SSI is valid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedStandingSettlementInstruction
	 * DateTimePeriod.mmRelatedStandingSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction
	 * StandingSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period during which the SSI is valid."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmValidityPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> StandingSettlementInstruction.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValidityPeriod";
			definition = "Period during which the SSI is valid.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmRelatedStandingSettlementInstruction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected CurrencyCode currency;
	/**
	 * Currency of the payment to which the SSI applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction
	 * StandingSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency of the payment to which the SSI applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCurrency = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> StandingSettlementInstruction.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Currency of the payment to which the SSI applies.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	protected Asset asset;
	/**
	 * Inidicates the asset for the standing settlement instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmStandingSettlementInstruction
	 * Asset.mmStandingSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction
	 * StandingSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Asset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Inidicates the asset for the standing settlement instruction."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAsset = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> StandingSettlementInstruction.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Asset";
			definition = "Inidicates the asset for the standing settlement instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Asset.mmStandingSettlementInstruction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StandingSettlementInstruction";
				definition = "Settlement instruction database information.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Asset.mmStandingSettlementInstruction, com.tools20022.repository.entity.DateTimePeriod.mmRelatedStandingSettlementInstruction,
						com.tools20022.repository.entity.Settlement.mmStandingSettlementInstruction, com.tools20022.repository.entity.CollateralAgreement.mmStandingSettlementInstructions,
						com.tools20022.repository.entity.SSIDatabaseProvider.mmStandingSettlementDatabase);
				derivationElement_lazy = () -> Arrays.asList(StandingSettlementInstruction1.mmSettlementStandingInstructionDatabase, StandingSettlementInstruction4.mmSettlementStandingInstructionDatabase,
						StandingSettlementInstruction7.mmSettlementStandingInstructionDatabase, StandingSettlementInstruction2.mmSettlementStandingInstructionDatabase, StandingSettlementInstruction3.mmSettlementStandingInstructionDatabase,
						StandingSettlementInstruction6.mmSettlementStandingInstructionDatabase, StandingSettlementInstruction9.mmSettlementStandingInstructionDatabase, StandingSettlementInstruction5.mmSettlementStandingInstructionDatabase,
						StandingSettlementInstruction8.mmSettlementStandingInstructionDatabase, StandingSettlementInstruction11.mmSettlementStandingInstructionDatabase,
						StandingSettlementInstruction12.mmSettlementStandingInstructionDatabase);
				subType_lazy = () -> Arrays.asList(AgentCorporateActionStandingInstruction.mmObject());
				element_lazy = () -> Arrays.asList(StandingSettlementInstruction.mmSettlement, StandingSettlementInstruction.mmFXStandingInstruction, StandingSettlementInstruction.mmSettlementStandingInstructionDatabase,
						StandingSettlementInstruction.mmIdentification, StandingSettlementInstruction.mmRelatedCollateralAgreement, StandingSettlementInstruction.mmSSIDatabaseName, StandingSettlementInstruction.mmSSIDatabaseProvider,
						StandingSettlementInstruction.mmValidityPeriod, StandingSettlementInstruction.mmCurrency, StandingSettlementInstruction.mmAsset);
				derivationComponent_lazy = () -> Arrays.asList(FXStandingInstruction1Choice.mmObject(), SettlementStandingInstructionDatabase1Choice.mmObject(), StandingSettlementInstruction1.mmObject(),
						StandingSettlementInstruction4.mmObject(), FXStandingInstruction2Choice.mmObject(), SettlementStandingInstructionDatabase2Choice.mmObject(), StandingSettlementInstruction7.mmObject(),
						StandingSettlementInstruction2.mmObject(), StandingSettlementInstruction3.mmObject(), StandingSettlementInstruction6.mmObject(), FXStandingInstruction3Choice.mmObject(),
						SettlementStandingInstructionDatabase3Choice.mmObject(), StandingSettlementInstruction9.mmObject(), StandingSettlementInstruction5.mmObject(), StandingSettlementInstruction8.mmObject(),
						StandingSettlementInstruction11.mmObject(), SettlementStandingInstructionDatabase4Choice.mmObject(), FXStandingInstruction4Choice.mmObject(), StandingSettlementInstruction12.mmObject(),
						FXStandingInstruction5Choice.mmObject(), SettlementStandingInstructionDatabase5Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public List<Settlement> getSettlement() {
		return settlement;
	}

	public void setSettlement(List<com.tools20022.repository.entity.Settlement> settlement) {
		this.settlement = settlement;
	}

	public YesNoIndicator getFXStandingInstruction() {
		return fXStandingInstruction;
	}

	public void setFXStandingInstruction(YesNoIndicator fXStandingInstruction) {
		this.fXStandingInstruction = fXStandingInstruction;
	}

	public SettlementStandingInstructionDatabaseCode getSettlementStandingInstructionDatabase() {
		return settlementStandingInstructionDatabase;
	}

	public void setSettlementStandingInstructionDatabase(SettlementStandingInstructionDatabaseCode settlementStandingInstructionDatabase) {
		this.settlementStandingInstructionDatabase = settlementStandingInstructionDatabase;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}

	public CollateralAgreement getRelatedCollateralAgreement() {
		return relatedCollateralAgreement;
	}

	public void setRelatedCollateralAgreement(com.tools20022.repository.entity.CollateralAgreement relatedCollateralAgreement) {
		this.relatedCollateralAgreement = relatedCollateralAgreement;
	}

	public Max350Text getSSIDatabaseName() {
		return sSIDatabaseName;
	}

	public void setSSIDatabaseName(Max350Text sSIDatabaseName) {
		this.sSIDatabaseName = sSIDatabaseName;
	}

	public SSIDatabaseProvider getSSIDatabaseProvider() {
		return sSIDatabaseProvider;
	}

	public void setSSIDatabaseProvider(com.tools20022.repository.entity.SSIDatabaseProvider sSIDatabaseProvider) {
		this.sSIDatabaseProvider = sSIDatabaseProvider;
	}

	public DateTimePeriod getValidityPeriod() {
		return validityPeriod;
	}

	public void setValidityPeriod(com.tools20022.repository.entity.DateTimePeriod validityPeriod) {
		this.validityPeriod = validityPeriod;
	}

	public CurrencyCode getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyCode currency) {
		this.currency = currency;
	}

	public Asset getAsset() {
		return asset;
	}

	public void setAsset(com.tools20022.repository.entity.Asset asset) {
		this.asset = asset;
	}
}