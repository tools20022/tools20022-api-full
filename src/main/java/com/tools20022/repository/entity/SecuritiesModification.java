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
import com.tools20022.repository.codeset.CorporateActionChangeTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Number;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Modification of the reference data of a security or of the organisation that
 * issued it.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesModification"
 * src="doc-files/SecuritiesModification.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#ChangeType
 * SecuritiesModification.ChangeType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#NewOrganisationInformation
 * SecuritiesModification.NewOrganisationInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#RelatedCorporateEvent
 * SecuritiesModification.RelatedCorporateEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#NewSecurityReferenceData
 * SecuritiesModification.NewSecurityReferenceData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#NumberOfSharesIssued
 * SecuritiesModification.NumberOfSharesIssued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#LastTradingDate
 * SecuritiesModification.LastTradingDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#Modification
 * Security.Modification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#SecuritiesModification
 * Organisation.SecuritiesModification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#SecuritiesModification
 * CorporateActionEvent.SecuritiesModification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat2Choice
 * CorporateActionChangeTypeFormat2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat4Choice
 * CorporateActionChangeTypeFormat4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat1Choice
 * CorporateActionChangeTypeFormat1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat3Choice
 * CorporateActionChangeTypeFormat3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeType1FormatChoice
 * CorporateActionChangeType1FormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat5Choice
 * CorporateActionChangeTypeFormat5Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat6Choice
 * CorporateActionChangeTypeFormat6Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat8Choice
 * CorporateActionChangeTypeFormat8Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat7Choice
 * CorporateActionChangeTypeFormat7Choice}</li>
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
 * "SecuritiesModification"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Modification of the reference data of a security or of the organisation that issued it."
 * </li>
 * </ul>
 */
public class SecuritiesModification {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Type of changes affecting the security form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeTypeCode
	 * CorporateActionChangeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat2Choice#Code
	 * CorporateActionChangeTypeFormat2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat2Choice#Proprietary
	 * CorporateActionChangeTypeFormat2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption5#ChangeType
	 * CorporateActionOption5.ChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat4Choice#Code
	 * CorporateActionChangeTypeFormat4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat4Choice#Proprietary
	 * CorporateActionChangeTypeFormat4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption13#ChangeType
	 * CorporateActionOption13.ChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption25#ChangeType
	 * CorporateActionOption25.ChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption30#ChangeType
	 * CorporateActionOption30.ChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption38#ChangeType
	 * CorporateActionOption38.ChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption47#ChangeType
	 * CorporateActionOption47.ChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption57#ChangeType
	 * CorporateActionOption57.ChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption58#ChangeType
	 * CorporateActionOption58.ChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat1Choice#Code
	 * CorporateActionChangeTypeFormat1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat1Choice#Proprietary
	 * CorporateActionChangeTypeFormat1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction3#ChangeType
	 * CorporateAction3.ChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat3Choice#Code
	 * CorporateActionChangeTypeFormat3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat3Choice#Proprietary
	 * CorporateActionChangeTypeFormat3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction4#ChangeType
	 * CorporateAction4.ChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5#ChangeType
	 * CorporateAction5.ChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction6#ChangeType
	 * CorporateAction6.ChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction7#ChangeType
	 * CorporateAction7.ChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction8#ChangeType
	 * CorporateAction8.ChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10#ChangeType
	 * CorporateAction10.ChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction11#ChangeType
	 * CorporateAction11.ChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeType1FormatChoice#Code
	 * CorporateActionChangeType1FormatChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeType1FormatChoice#Proprietary
	 * CorporateActionChangeType1FormatChoice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#ChangeType
	 * CorporateAction2.ChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption103#ChangeType
	 * CorporateActionOption103.ChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#ChangeType
	 * CorporateAction12.ChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption107#ChangeType
	 * CorporateActionOption107.ChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction17#ChangeType
	 * CorporateAction17.ChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption118#ChangeType
	 * CorporateActionOption118.ChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#ChangeType
	 * CorporateAction31.ChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat5Choice#Code
	 * CorporateActionChangeTypeFormat5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat5Choice#Proprietary
	 * CorporateActionChangeTypeFormat5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat6Choice#Code
	 * CorporateActionChangeTypeFormat6Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat6Choice#Proprietary
	 * CorporateActionChangeTypeFormat6Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption123#ChangeType
	 * CorporateActionOption123.ChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction40#ChangeType
	 * CorporateAction40.ChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat8Choice#Code
	 * CorporateActionChangeTypeFormat8Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat8Choice#Proprietary
	 * CorporateActionChangeTypeFormat8Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat7Choice#Code
	 * CorporateActionChangeTypeFormat7Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat7Choice#Proprietary
	 * CorporateActionChangeTypeFormat7Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption131#ChangeType
	 * CorporateActionOption131.ChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption134#ChangeType
	 * CorporateActionOption134.ChangeType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification
	 * SecuritiesModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of changes affecting the security form."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ChangeType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CorporateActionChangeTypeFormat2Choice.Code, com.tools20022.repository.choice.CorporateActionChangeTypeFormat2Choice.Proprietary,
					com.tools20022.repository.msg.CorporateActionOption5.ChangeType, com.tools20022.repository.choice.CorporateActionChangeTypeFormat4Choice.Code,
					com.tools20022.repository.choice.CorporateActionChangeTypeFormat4Choice.Proprietary, com.tools20022.repository.msg.CorporateActionOption13.ChangeType, com.tools20022.repository.msg.CorporateActionOption25.ChangeType,
					com.tools20022.repository.msg.CorporateActionOption30.ChangeType, com.tools20022.repository.msg.CorporateActionOption38.ChangeType, com.tools20022.repository.msg.CorporateActionOption47.ChangeType,
					com.tools20022.repository.msg.CorporateActionOption57.ChangeType, com.tools20022.repository.msg.CorporateActionOption58.ChangeType, com.tools20022.repository.choice.CorporateActionChangeTypeFormat1Choice.Code,
					com.tools20022.repository.choice.CorporateActionChangeTypeFormat1Choice.Proprietary, com.tools20022.repository.msg.CorporateAction3.ChangeType,
					com.tools20022.repository.choice.CorporateActionChangeTypeFormat3Choice.Code, com.tools20022.repository.choice.CorporateActionChangeTypeFormat3Choice.Proprietary,
					com.tools20022.repository.msg.CorporateAction4.ChangeType, com.tools20022.repository.msg.CorporateAction5.ChangeType, com.tools20022.repository.msg.CorporateAction6.ChangeType,
					com.tools20022.repository.msg.CorporateAction7.ChangeType, com.tools20022.repository.msg.CorporateAction8.ChangeType, com.tools20022.repository.msg.CorporateAction10.ChangeType,
					com.tools20022.repository.msg.CorporateAction11.ChangeType, com.tools20022.repository.choice.CorporateActionChangeType1FormatChoice.Code,
					com.tools20022.repository.choice.CorporateActionChangeType1FormatChoice.Proprietary, com.tools20022.repository.msg.CorporateAction2.ChangeType, com.tools20022.repository.msg.CorporateActionOption103.ChangeType,
					com.tools20022.repository.msg.CorporateAction12.ChangeType, com.tools20022.repository.msg.CorporateActionOption107.ChangeType, com.tools20022.repository.msg.CorporateAction17.ChangeType,
					com.tools20022.repository.msg.CorporateActionOption118.ChangeType, com.tools20022.repository.msg.CorporateAction31.ChangeType, com.tools20022.repository.choice.CorporateActionChangeTypeFormat5Choice.Code,
					com.tools20022.repository.choice.CorporateActionChangeTypeFormat5Choice.Proprietary, com.tools20022.repository.choice.CorporateActionChangeTypeFormat6Choice.Code,
					com.tools20022.repository.choice.CorporateActionChangeTypeFormat6Choice.Proprietary, com.tools20022.repository.msg.CorporateActionOption123.ChangeType, com.tools20022.repository.msg.CorporateAction40.ChangeType,
					com.tools20022.repository.choice.CorporateActionChangeTypeFormat8Choice.Code, com.tools20022.repository.choice.CorporateActionChangeTypeFormat8Choice.Proprietary,
					com.tools20022.repository.choice.CorporateActionChangeTypeFormat7Choice.Code, com.tools20022.repository.choice.CorporateActionChangeTypeFormat7Choice.Proprietary,
					com.tools20022.repository.msg.CorporateActionOption131.ChangeType, com.tools20022.repository.msg.CorporateActionOption134.ChangeType);
			elementContext_lazy = () -> SecuritiesModification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChangeType";
			definition = "Type of changes affecting the security form.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CorporateActionChangeTypeCode.mmObject();
		}
	};
	/**
	 * New name of a company following a name change.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#SecuritiesModification
	 * Organisation.SecuritiesModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Organisation
	 * Organisation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction3#NewPlaceOfIncorporation
	 * CorporateAction3.NewPlaceOfIncorporation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction4#NewPlaceOfIncorporation
	 * CorporateAction4.NewPlaceOfIncorporation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5#NewPlaceOfIncorporation
	 * CorporateAction5.NewPlaceOfIncorporation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction6#NewPlaceOfIncorporation
	 * CorporateAction6.NewPlaceOfIncorporation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction7#NewPlaceOfIncorporation
	 * CorporateAction7.NewPlaceOfIncorporation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction8#NewPlaceOfIncorporation
	 * CorporateAction8.NewPlaceOfIncorporation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10#NewPlaceOfIncorporation
	 * CorporateAction10.NewPlaceOfIncorporation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction11#NewPlaceOfIncorporation
	 * CorporateAction11.NewPlaceOfIncorporation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#NewPlaceOfIncorporation
	 * CorporateAction2.NewPlaceOfIncorporation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#NewPlaceOfIncorporation
	 * CorporateAction12.NewPlaceOfIncorporation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction17#NewPlaceOfIncorporation
	 * CorporateAction17.NewPlaceOfIncorporation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#NewPlaceOfIncorporation
	 * CorporateAction31.NewPlaceOfIncorporation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction40#NewPlaceOfIncorporation
	 * CorporateAction40.NewPlaceOfIncorporation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification
	 * SecuritiesModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewOrganisationInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "New name of a company following a name change."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd NewOrganisationInformation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateAction3.NewPlaceOfIncorporation, com.tools20022.repository.msg.CorporateAction4.NewPlaceOfIncorporation,
					com.tools20022.repository.msg.CorporateAction5.NewPlaceOfIncorporation, com.tools20022.repository.msg.CorporateAction6.NewPlaceOfIncorporation, com.tools20022.repository.msg.CorporateAction7.NewPlaceOfIncorporation,
					com.tools20022.repository.msg.CorporateAction8.NewPlaceOfIncorporation, com.tools20022.repository.msg.CorporateAction10.NewPlaceOfIncorporation, com.tools20022.repository.msg.CorporateAction11.NewPlaceOfIncorporation,
					com.tools20022.repository.msg.CorporateAction2.NewPlaceOfIncorporation, com.tools20022.repository.msg.CorporateAction12.NewPlaceOfIncorporation, com.tools20022.repository.msg.CorporateAction17.NewPlaceOfIncorporation,
					com.tools20022.repository.msg.CorporateAction31.NewPlaceOfIncorporation, com.tools20022.repository.msg.CorporateAction40.NewPlaceOfIncorporation);
			elementContext_lazy = () -> SecuritiesModification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NewOrganisationInformation";
			definition = "New name of a company following a name change.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Organisation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Organisation.SecuritiesModification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the parameters of the event related to the modification of the
	 * securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#SecuritiesModification
	 * CorporateActionEvent.SecuritiesModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification
	 * SecuritiesModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCorporateEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the parameters of the event related to the modification of the securities."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedCorporateEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesModification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateEvent";
			definition = "Specifies the parameters of the event related to the modification of the securities.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionEvent.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.SecuritiesModification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the updated information of the new security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#Modification
	 * Security.Modification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification
	 * SecuritiesModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewSecurityReferenceData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the updated information of the new security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd NewSecurityReferenceData = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesModification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NewSecurityReferenceData";
			definition = "Specifies the updated information of the new security.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Security.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Security.Modification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * The number of shares the issuer is creating as part of the event
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification
	 * SecuritiesModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfSharesIssued"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The number of shares the issuer is creating as part of the event"</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NumberOfSharesIssued = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesModification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NumberOfSharesIssued";
			definition = "The number of shares the issuer is creating as part of the event";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Date/time at which the securities to be reorganised will cease to be
	 * tradeable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification
	 * SecuritiesModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastTradingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the securities to be reorganised will cease to be tradeable."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute LastTradingDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesModification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LastTradingDate";
			definition = "Date/time at which the securities to be reorganised will cease to be tradeable.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesModification";
				definition = "Modification of the reference data of a security or of the organisation that issued it.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.Modification, com.tools20022.repository.entity.Organisation.SecuritiesModification,
						com.tools20022.repository.entity.CorporateActionEvent.SecuritiesModification);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesModification.ChangeType, com.tools20022.repository.entity.SecuritiesModification.NewOrganisationInformation,
						com.tools20022.repository.entity.SecuritiesModification.RelatedCorporateEvent, com.tools20022.repository.entity.SecuritiesModification.NewSecurityReferenceData,
						com.tools20022.repository.entity.SecuritiesModification.NumberOfSharesIssued, com.tools20022.repository.entity.SecuritiesModification.LastTradingDate);
				derivationComponent_lazy = () -> Arrays.asList(CorporateActionChangeTypeFormat2Choice.mmObject(), CorporateActionChangeTypeFormat4Choice.mmObject(), CorporateActionChangeTypeFormat1Choice.mmObject(),
						CorporateActionChangeTypeFormat3Choice.mmObject(), CorporateActionChangeType1FormatChoice.mmObject(), CorporateActionChangeTypeFormat5Choice.mmObject(), CorporateActionChangeTypeFormat6Choice.mmObject(),
						CorporateActionChangeTypeFormat8Choice.mmObject(), CorporateActionChangeTypeFormat7Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}