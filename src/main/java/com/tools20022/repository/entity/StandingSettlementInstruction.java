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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.SettlementStandingInstructionDatabaseCode;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#Settlement
 * StandingSettlementInstruction.Settlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#FXStandingInstruction
 * StandingSettlementInstruction.FXStandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#SettlementStandingInstructionDatabase
 * StandingSettlementInstruction.SettlementStandingInstructionDatabase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#Identification
 * StandingSettlementInstruction.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#RelatedCollateralAgreement
 * StandingSettlementInstruction.RelatedCollateralAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#SSIDatabaseName
 * StandingSettlementInstruction.SSIDatabaseName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#SSIDatabaseProvider
 * StandingSettlementInstruction.SSIDatabaseProvider}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#ValidityPeriod
 * StandingSettlementInstruction.ValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#Currency
 * StandingSettlementInstruction.Currency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#Asset
 * StandingSettlementInstruction.Asset}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Asset#StandingSettlementInstruction
 * Asset.StandingSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedStandingSettlementInstruction
 * DateTimePeriod.RelatedStandingSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Settlement#StandingSettlementInstruction
 * Settlement.StandingSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#StandingSettlementInstructions
 * CollateralAgreement.StandingSettlementInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SSIDatabaseProvider#StandingSettlementDatabase
 * SSIDatabaseProvider.StandingSettlementDatabase}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction1#SettlementStandingInstructionDatabase
 * StandingSettlementInstruction1.SettlementStandingInstructionDatabase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction4#SettlementStandingInstructionDatabase
 * StandingSettlementInstruction4.SettlementStandingInstructionDatabase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction7#SettlementStandingInstructionDatabase
 * StandingSettlementInstruction7.SettlementStandingInstructionDatabase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction2#SettlementStandingInstructionDatabase
 * StandingSettlementInstruction2.SettlementStandingInstructionDatabase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction3#SettlementStandingInstructionDatabase
 * StandingSettlementInstruction3.SettlementStandingInstructionDatabase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction6#SettlementStandingInstructionDatabase
 * StandingSettlementInstruction6.SettlementStandingInstructionDatabase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction9#SettlementStandingInstructionDatabase
 * StandingSettlementInstruction9.SettlementStandingInstructionDatabase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction5#SettlementStandingInstructionDatabase
 * StandingSettlementInstruction5.SettlementStandingInstructionDatabase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction8#SettlementStandingInstructionDatabase
 * StandingSettlementInstruction8.SettlementStandingInstructionDatabase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction11#SettlementStandingInstructionDatabase
 * StandingSettlementInstruction11.SettlementStandingInstructionDatabase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction12#SettlementStandingInstructionDatabase
 * StandingSettlementInstruction12.SettlementStandingInstructionDatabase}</li>
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
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	/**
	 * Settlement process to which the settlement instruction database applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Settlement#StandingSettlementInstruction
	 * Settlement.StandingSettlementInstruction}</li>
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
	public static final MMBusinessAssociationEnd Settlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> StandingSettlementInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Settlement";
			definition = "Settlement process to which the settlement instruction database applies.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Settlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Settlement.StandingSettlementInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FXStandingInstruction1Choice#Indicator
	 * FXStandingInstruction1Choice.Indicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FXStandingInstruction1Choice#Proprietary
	 * FXStandingInstruction1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FXStandingInstruction2Choice#Indicator
	 * FXStandingInstruction2Choice.Indicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FXStandingInstruction2Choice#Proprietary
	 * FXStandingInstruction2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FXStandingInstruction3Choice#Indicator
	 * FXStandingInstruction3Choice.Indicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FXStandingInstruction3Choice#Proprietary
	 * FXStandingInstruction3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FXStandingInstruction4Choice#Indicator
	 * FXStandingInstruction4Choice.Indicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FXStandingInstruction4Choice#Proprietary
	 * FXStandingInstruction4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FXStandingInstruction5Choice#Indicator
	 * FXStandingInstruction5Choice.Indicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FXStandingInstruction5Choice#Proprietary
	 * FXStandingInstruction5Choice.Proprietary}</li>
	 * </ul>
	 * </li>
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
	 * name} = "FXStandingInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the forex standing instruction in place should apply."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FXStandingInstruction = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.FXStandingInstruction1Choice.Indicator, com.tools20022.repository.choice.FXStandingInstruction1Choice.Proprietary,
					com.tools20022.repository.choice.FXStandingInstruction2Choice.Indicator, com.tools20022.repository.choice.FXStandingInstruction2Choice.Proprietary,
					com.tools20022.repository.choice.FXStandingInstruction3Choice.Indicator, com.tools20022.repository.choice.FXStandingInstruction3Choice.Proprietary,
					com.tools20022.repository.choice.FXStandingInstruction4Choice.Indicator, com.tools20022.repository.choice.FXStandingInstruction4Choice.Proprietary,
					com.tools20022.repository.choice.FXStandingInstruction5Choice.Indicator, com.tools20022.repository.choice.FXStandingInstruction5Choice.Proprietary);
			elementContext_lazy = () -> StandingSettlementInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FXStandingInstruction";
			definition = "Specifies whether the forex standing instruction in place should apply.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStandingInstructionDatabase1Choice#Code
	 * SettlementStandingInstructionDatabase1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStandingInstructionDatabase1Choice#Proprietary
	 * SettlementStandingInstructionDatabase1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStandingInstructionDatabase2Choice#Code
	 * SettlementStandingInstructionDatabase2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStandingInstructionDatabase2Choice#Proprietary
	 * SettlementStandingInstructionDatabase2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStandingInstructionDatabase3Choice#Code
	 * SettlementStandingInstructionDatabase3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStandingInstructionDatabase3Choice#Proprietary
	 * SettlementStandingInstructionDatabase3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStandingInstructionDatabase4Choice#Code
	 * SettlementStandingInstructionDatabase4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStandingInstructionDatabase4Choice#Proprietary
	 * SettlementStandingInstructionDatabase4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStandingInstructionDatabase5Choice#Code
	 * SettlementStandingInstructionDatabase5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStandingInstructionDatabase5Choice#Proprietary
	 * SettlementStandingInstructionDatabase5Choice.Proprietary}</li>
	 * </ul>
	 * </li>
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
	 * name} = "SettlementStandingInstructionDatabase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies what settlement standing instruction database is to be used to derive the settlement parties involved in the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SettlementStandingInstructionDatabase = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SettlementStandingInstructionDatabase1Choice.Code, com.tools20022.repository.choice.SettlementStandingInstructionDatabase1Choice.Proprietary,
					com.tools20022.repository.choice.SettlementStandingInstructionDatabase2Choice.Code, com.tools20022.repository.choice.SettlementStandingInstructionDatabase2Choice.Proprietary,
					com.tools20022.repository.choice.SettlementStandingInstructionDatabase3Choice.Code, com.tools20022.repository.choice.SettlementStandingInstructionDatabase3Choice.Proprietary,
					com.tools20022.repository.choice.SettlementStandingInstructionDatabase4Choice.Code, com.tools20022.repository.choice.SettlementStandingInstructionDatabase4Choice.Proprietary,
					com.tools20022.repository.choice.SettlementStandingInstructionDatabase5Choice.Code, com.tools20022.repository.choice.SettlementStandingInstructionDatabase5Choice.Proprietary);
			elementContext_lazy = () -> StandingSettlementInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementStandingInstructionDatabase";
			definition = "Specifies what settlement standing instruction database is to be used to derive the settlement parties involved in the transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SettlementStandingInstructionDatabaseCode.mmObject();
		}
	};
	/**
	 * Identification of the standing instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionGeneralInformation1#ClientStandingInstructionIdentification
	 * CorporateActionStandingInstructionGeneralInformation1.
	 * ClientStandingInstructionIdentification}</li>
	 * </ul>
	 * </li>
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
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the standing instruction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionStandingInstructionGeneralInformation1.ClientStandingInstructionIdentification);
			elementContext_lazy = () -> StandingSettlementInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identification of the standing instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Collateral agreement for which standing settlement instructions are
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#StandingSettlementInstructions
	 * CollateralAgreement.StandingSettlementInstructions}</li>
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
	public static final MMBusinessAssociationEnd RelatedCollateralAgreement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> StandingSettlementInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCollateralAgreement";
			definition = "Collateral agreement for which standing settlement instructions are specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CollateralAgreement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralAgreement.StandingSettlementInstructions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute SSIDatabaseName = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> StandingSettlementInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SSIDatabaseName";
			definition = "Specifies the settlement standing instruction database to be used to derive the settlement parties involved in a transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Party which provides information on the parties and accounts to be used
	 * to settle a transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SSIDatabaseProvider#StandingSettlementDatabase
	 * SSIDatabaseProvider.StandingSettlementDatabase}</li>
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
	public static final MMBusinessAssociationEnd SSIDatabaseProvider = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> StandingSettlementInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SSIDatabaseProvider";
			definition = "Party which provides information on the parties and accounts to be used to settle a transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SSIDatabaseProvider.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SSIDatabaseProvider.StandingSettlementDatabase;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Period during which the SSI is valid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedStandingSettlementInstruction
	 * DateTimePeriod.RelatedStandingSettlementInstruction}</li>
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
	public static final MMBusinessAssociationEnd ValidityPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> StandingSettlementInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValidityPeriod";
			definition = "Period during which the SSI is valid.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.RelatedStandingSettlementInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute Currency = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> StandingSettlementInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Currency of the payment to which the SSI applies.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Inidicates the asset for the standing settlement instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Asset#StandingSettlementInstruction
	 * Asset.StandingSettlementInstruction}</li>
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
	public static final MMBusinessAssociationEnd Asset = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> StandingSettlementInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Asset";
			definition = "Inidicates the asset for the standing settlement instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Asset.StandingSettlementInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "StandingSettlementInstruction";
				definition = "Settlement instruction database information.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Asset.StandingSettlementInstruction, com.tools20022.repository.entity.DateTimePeriod.RelatedStandingSettlementInstruction,
						com.tools20022.repository.entity.Settlement.StandingSettlementInstruction, com.tools20022.repository.entity.CollateralAgreement.StandingSettlementInstructions,
						com.tools20022.repository.entity.SSIDatabaseProvider.StandingSettlementDatabase);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StandingSettlementInstruction1.SettlementStandingInstructionDatabase,
						com.tools20022.repository.msg.StandingSettlementInstruction4.SettlementStandingInstructionDatabase, com.tools20022.repository.msg.StandingSettlementInstruction7.SettlementStandingInstructionDatabase,
						com.tools20022.repository.msg.StandingSettlementInstruction2.SettlementStandingInstructionDatabase, com.tools20022.repository.msg.StandingSettlementInstruction3.SettlementStandingInstructionDatabase,
						com.tools20022.repository.msg.StandingSettlementInstruction6.SettlementStandingInstructionDatabase, com.tools20022.repository.msg.StandingSettlementInstruction9.SettlementStandingInstructionDatabase,
						com.tools20022.repository.msg.StandingSettlementInstruction5.SettlementStandingInstructionDatabase, com.tools20022.repository.msg.StandingSettlementInstruction8.SettlementStandingInstructionDatabase,
						com.tools20022.repository.msg.StandingSettlementInstruction11.SettlementStandingInstructionDatabase, com.tools20022.repository.msg.StandingSettlementInstruction12.SettlementStandingInstructionDatabase);
				subType_lazy = () -> Arrays.asList(AgentCorporateActionStandingInstruction.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.StandingSettlementInstruction.Settlement, com.tools20022.repository.entity.StandingSettlementInstruction.FXStandingInstruction,
						com.tools20022.repository.entity.StandingSettlementInstruction.SettlementStandingInstructionDatabase, com.tools20022.repository.entity.StandingSettlementInstruction.Identification,
						com.tools20022.repository.entity.StandingSettlementInstruction.RelatedCollateralAgreement, com.tools20022.repository.entity.StandingSettlementInstruction.SSIDatabaseName,
						com.tools20022.repository.entity.StandingSettlementInstruction.SSIDatabaseProvider, com.tools20022.repository.entity.StandingSettlementInstruction.ValidityPeriod,
						com.tools20022.repository.entity.StandingSettlementInstruction.Currency, com.tools20022.repository.entity.StandingSettlementInstruction.Asset);
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
}