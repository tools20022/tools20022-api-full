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
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Form of lawsuit in which a group of shareholders collectively bring a claim
 * to court, mainly because it would be too expensive for each individual
 * shareholder to launch their own lawsuit.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ClassAction" src="doc-files/ClassAction.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClassAction#ClassActionNumber
 * ClassAction.ClassActionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClassAction#LeadPlaintiffDeadline
 * ClassAction.LeadPlaintiffDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClassAction#CourtApprovalDate
 * ClassAction.CourtApprovalDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ClassAction#ClaimPeriod
 * ClassAction.ClaimPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ClassAction#FilingDate
 * ClassAction.FilingDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ClassAction#HearingDate
 * ClassAction.HearingDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ClassAction#CorporateEvent
 * ClassAction.CorporateEvent}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#ClassAction
 * DateTimePeriod.ClassAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#RelatedClassAction
 * CorporateActionEvent.RelatedClassAction}</li>
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
 * "ClassAction"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Form of lawsuit in which a group of shareholders collectively bring a claim to court, mainly because it would be too expensive for each individual shareholder to launch their own lawsuit."
 * </li>
 * </ul>
 */
public class ClassAction {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Reference assigned by a court to a class action.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation8#ClassActionNumber
	 * CorporateActionGeneralInformation8.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation20#ClassActionNumber
	 * CorporateActionGeneralInformation20.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation25#ClassActionNumber
	 * CorporateActionGeneralInformation25.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation32#ClassActionNumber
	 * CorporateActionGeneralInformation32.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation35#ClassActionNumber
	 * CorporateActionGeneralInformation35.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation43#ClassActionNumber
	 * CorporateActionGeneralInformation43.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation53#ClassActionNumber
	 * CorporateActionGeneralInformation53.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation56#ClassActionNumber
	 * CorporateActionGeneralInformation56.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation57#ClassActionNumber
	 * CorporateActionGeneralInformation57.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation9#ClassActionNumber
	 * CorporateActionGeneralInformation9.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation13#ClassActionNumber
	 * CorporateActionGeneralInformation13.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation34#ClassActionNumber
	 * CorporateActionGeneralInformation34.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation42#ClassActionNumber
	 * CorporateActionGeneralInformation42.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation52#ClassActionNumber
	 * CorporateActionGeneralInformation52.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation58#ClassActionNumber
	 * CorporateActionGeneralInformation58.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation4#ClassActionNumber
	 * CorporateActionGeneralInformation4.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation16#ClassActionNumber
	 * CorporateActionGeneralInformation16.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation24#ClassActionNumber
	 * CorporateActionGeneralInformation24.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation29#ClassActionNumber
	 * CorporateActionGeneralInformation29.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation39#ClassActionNumber
	 * CorporateActionGeneralInformation39.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation47#ClassActionNumber
	 * CorporateActionGeneralInformation47.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation50#ClassActionNumber
	 * CorporateActionGeneralInformation50.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation62#ClassActionNumber
	 * CorporateActionGeneralInformation62.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation3#ClassActionNumber
	 * CorporateActionGeneralInformation3.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation17#ClassActionNumber
	 * CorporateActionGeneralInformation17.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation23#ClassActionNumber
	 * CorporateActionGeneralInformation23.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation30#ClassActionNumber
	 * CorporateActionGeneralInformation30.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation38#ClassActionNumber
	 * CorporateActionGeneralInformation38.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation46#ClassActionNumber
	 * CorporateActionGeneralInformation46.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation54#ClassActionNumber
	 * CorporateActionGeneralInformation54.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation64#ClassActionNumber
	 * CorporateActionGeneralInformation64.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation63#ClassActionNumber
	 * CorporateActionGeneralInformation63.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation11#ClassActionNumber
	 * CorporateActionGeneralInformation11.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation19#ClassActionNumber
	 * CorporateActionGeneralInformation19.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation22#ClassActionNumber
	 * CorporateActionGeneralInformation22.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation31#ClassActionNumber
	 * CorporateActionGeneralInformation31.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation37#ClassActionNumber
	 * CorporateActionGeneralInformation37.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation45#ClassActionNumber
	 * CorporateActionGeneralInformation45.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation51#ClassActionNumber
	 * CorporateActionGeneralInformation51.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation67#ClassActionNumber
	 * CorporateActionGeneralInformation67.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation12#ClassActionNumber
	 * CorporateActionGeneralInformation12.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation69#ClassActionNumber
	 * CorporateActionGeneralInformation69.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation70#ClassActionNumber
	 * CorporateActionGeneralInformation70.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation78#ClassActionNumber
	 * CorporateActionGeneralInformation78.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation76#ClassActionNumber
	 * CorporateActionGeneralInformation76.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation79#ClassActionNumber
	 * CorporateActionGeneralInformation79.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation83#ClassActionNumber
	 * CorporateActionGeneralInformation83.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation82#ClassActionNumber
	 * CorporateActionGeneralInformation82.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation89#ClassActionNumber
	 * CorporateActionGeneralInformation89.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation86#ClassActionNumber
	 * CorporateActionGeneralInformation86.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation91#ClassActionNumber
	 * CorporateActionGeneralInformation91.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation87#ClassActionNumber
	 * CorporateActionGeneralInformation87.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation84#ClassActionNumber
	 * CorporateActionGeneralInformation84.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation85#ClassActionNumber
	 * CorporateActionGeneralInformation85.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation93#ClassActionNumber
	 * CorporateActionGeneralInformation93.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation98#ClassActionNumber
	 * CorporateActionGeneralInformation98.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation100#ClassActionNumber
	 * CorporateActionGeneralInformation100.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation99#ClassActionNumber
	 * CorporateActionGeneralInformation99.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation94#ClassActionNumber
	 * CorporateActionGeneralInformation94.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation103#ClassActionNumber
	 * CorporateActionGeneralInformation103.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation109#ClassActionNumber
	 * CorporateActionGeneralInformation109.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation111#ClassActionNumber
	 * CorporateActionGeneralInformation111.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation112#ClassActionNumber
	 * CorporateActionGeneralInformation112.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation105#ClassActionNumber
	 * CorporateActionGeneralInformation105.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation106#ClassActionNumber
	 * CorporateActionGeneralInformation106.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation108#ClassActionNumber
	 * CorporateActionGeneralInformation108.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation114#ClassActionNumber
	 * CorporateActionGeneralInformation114.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation120#ClassActionNumber
	 * CorporateActionGeneralInformation120.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation118#ClassActionNumber
	 * CorporateActionGeneralInformation118.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation123#ClassActionNumber
	 * CorporateActionGeneralInformation123.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation117#ClassActionNumber
	 * CorporateActionGeneralInformation117.ClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation113#ClassActionNumber
	 * CorporateActionGeneralInformation113.ClassActionNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ClassAction ClassAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClassActionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference assigned by a court to a class action."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ClassActionNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionGeneralInformation8.ClassActionNumber, com.tools20022.repository.msg.CorporateActionGeneralInformation20.ClassActionNumber,
					com.tools20022.repository.msg.CorporateActionGeneralInformation25.ClassActionNumber, com.tools20022.repository.msg.CorporateActionGeneralInformation32.ClassActionNumber,
					com.tools20022.repository.msg.CorporateActionGeneralInformation35.ClassActionNumber, com.tools20022.repository.msg.CorporateActionGeneralInformation43.ClassActionNumber,
					com.tools20022.repository.msg.CorporateActionGeneralInformation53.ClassActionNumber, com.tools20022.repository.msg.CorporateActionGeneralInformation56.ClassActionNumber,
					com.tools20022.repository.msg.CorporateActionGeneralInformation57.ClassActionNumber, com.tools20022.repository.msg.CorporateActionGeneralInformation9.ClassActionNumber,
					com.tools20022.repository.msg.CorporateActionGeneralInformation13.ClassActionNumber, com.tools20022.repository.msg.CorporateActionGeneralInformation34.ClassActionNumber,
					com.tools20022.repository.msg.CorporateActionGeneralInformation42.ClassActionNumber, com.tools20022.repository.msg.CorporateActionGeneralInformation52.ClassActionNumber,
					com.tools20022.repository.msg.CorporateActionGeneralInformation58.ClassActionNumber, com.tools20022.repository.msg.CorporateActionGeneralInformation4.ClassActionNumber,
					com.tools20022.repository.msg.CorporateActionGeneralInformation16.ClassActionNumber, com.tools20022.repository.msg.CorporateActionGeneralInformation24.ClassActionNumber,
					com.tools20022.repository.msg.CorporateActionGeneralInformation29.ClassActionNumber, com.tools20022.repository.msg.CorporateActionGeneralInformation39.ClassActionNumber,
					com.tools20022.repository.msg.CorporateActionGeneralInformation47.ClassActionNumber, com.tools20022.repository.msg.CorporateActionGeneralInformation50.ClassActionNumber,
					com.tools20022.repository.msg.CorporateActionGeneralInformation62.ClassActionNumber, com.tools20022.repository.msg.CorporateActionGeneralInformation3.ClassActionNumber,
					com.tools20022.repository.msg.CorporateActionGeneralInformation17.ClassActionNumber, com.tools20022.repository.msg.CorporateActionGeneralInformation23.ClassActionNumber,
					com.tools20022.repository.msg.CorporateActionGeneralInformation30.ClassActionNumber, com.tools20022.repository.msg.CorporateActionGeneralInformation38.ClassActionNumber,
					com.tools20022.repository.msg.CorporateActionGeneralInformation46.ClassActionNumber, com.tools20022.repository.msg.CorporateActionGeneralInformation54.ClassActionNumber,
					com.tools20022.repository.msg.CorporateActionGeneralInformation64.ClassActionNumber, com.tools20022.repository.msg.CorporateActionGeneralInformation63.ClassActionNumber,
					com.tools20022.repository.msg.CorporateActionGeneralInformation11.ClassActionNumber, com.tools20022.repository.msg.CorporateActionGeneralInformation19.ClassActionNumber,
					com.tools20022.repository.msg.CorporateActionGeneralInformation22.ClassActionNumber, com.tools20022.repository.msg.CorporateActionGeneralInformation31.ClassActionNumber,
					com.tools20022.repository.msg.CorporateActionGeneralInformation37.ClassActionNumber, com.tools20022.repository.msg.CorporateActionGeneralInformation45.ClassActionNumber,
					com.tools20022.repository.msg.CorporateActionGeneralInformation51.ClassActionNumber, com.tools20022.repository.msg.CorporateActionGeneralInformation67.ClassActionNumber,
					com.tools20022.repository.msg.CorporateActionGeneralInformation12.ClassActionNumber, com.tools20022.repository.msg.CorporateActionGeneralInformation69.ClassActionNumber,
					com.tools20022.repository.msg.CorporateActionGeneralInformation70.ClassActionNumber, com.tools20022.repository.msg.CorporateActionGeneralInformation78.ClassActionNumber,
					com.tools20022.repository.msg.CorporateActionGeneralInformation76.ClassActionNumber, com.tools20022.repository.msg.CorporateActionGeneralInformation79.ClassActionNumber,
					com.tools20022.repository.msg.CorporateActionGeneralInformation83.ClassActionNumber, com.tools20022.repository.msg.CorporateActionGeneralInformation82.ClassActionNumber,
					com.tools20022.repository.msg.CorporateActionGeneralInformation89.ClassActionNumber, com.tools20022.repository.msg.CorporateActionGeneralInformation86.ClassActionNumber,
					com.tools20022.repository.msg.CorporateActionGeneralInformation91.ClassActionNumber, com.tools20022.repository.msg.CorporateActionGeneralInformation87.ClassActionNumber,
					com.tools20022.repository.msg.CorporateActionGeneralInformation84.ClassActionNumber, com.tools20022.repository.msg.CorporateActionGeneralInformation85.ClassActionNumber,
					com.tools20022.repository.msg.CorporateActionGeneralInformation93.ClassActionNumber, com.tools20022.repository.msg.CorporateActionGeneralInformation98.ClassActionNumber,
					com.tools20022.repository.msg.CorporateActionGeneralInformation100.ClassActionNumber, com.tools20022.repository.msg.CorporateActionGeneralInformation99.ClassActionNumber,
					com.tools20022.repository.msg.CorporateActionGeneralInformation94.ClassActionNumber, com.tools20022.repository.msg.CorporateActionGeneralInformation103.ClassActionNumber,
					com.tools20022.repository.msg.CorporateActionGeneralInformation109.ClassActionNumber, com.tools20022.repository.msg.CorporateActionGeneralInformation111.ClassActionNumber,
					com.tools20022.repository.msg.CorporateActionGeneralInformation112.ClassActionNumber, com.tools20022.repository.msg.CorporateActionGeneralInformation105.ClassActionNumber,
					com.tools20022.repository.msg.CorporateActionGeneralInformation106.ClassActionNumber, com.tools20022.repository.msg.CorporateActionGeneralInformation108.ClassActionNumber,
					com.tools20022.repository.msg.CorporateActionGeneralInformation114.ClassActionNumber, com.tools20022.repository.msg.CorporateActionGeneralInformation120.ClassActionNumber,
					com.tools20022.repository.msg.CorporateActionGeneralInformation118.ClassActionNumber, com.tools20022.repository.msg.CorporateActionGeneralInformation123.ClassActionNumber,
					com.tools20022.repository.msg.CorporateActionGeneralInformation117.ClassActionNumber, com.tools20022.repository.msg.CorporateActionGeneralInformation113.ClassActionNumber);
			elementContext_lazy = () -> ClassAction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClassActionNumber";
			definition = "Reference assigned by a court to a class action.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Last day an investor can become a lead plaintiff.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate8#LeadPlaintiffDeadline
	 * CorporateActionDate8.LeadPlaintiffDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate11#LeadPlaintiffDeadline
	 * CorporateActionDate11.LeadPlaintiffDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#LeadPlaintiffDeadline
	 * CorporateActionDate14.LeadPlaintiffDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#LeadPlaintiffDeadline
	 * CorporateActionDate21.LeadPlaintiffDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#LeadPlaintiffDeadline
	 * CorporateActionDate22.LeadPlaintiffDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#LeadPlaintiffDeadline
	 * CorporateActionDate25.LeadPlaintiffDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#LeadPlaintiffDeadline
	 * CorporateActionDate27.LeadPlaintiffDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#LeadPlaintiffDeadline
	 * CorporateActionDate28.LeadPlaintiffDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#LeadPlaintiffDeadline
	 * CorporateActionDate44.LeadPlaintiffDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#LeadPlaintiffDeadline
	 * CorporateActionDate58.LeadPlaintiffDeadline}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ClassAction ClassAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LeadPlaintiffDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Last day an investor can become a lead plaintiff."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute LeadPlaintiffDeadline = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate8.LeadPlaintiffDeadline, com.tools20022.repository.msg.CorporateActionDate11.LeadPlaintiffDeadline,
					com.tools20022.repository.msg.CorporateActionDate14.LeadPlaintiffDeadline, com.tools20022.repository.msg.CorporateActionDate21.LeadPlaintiffDeadline,
					com.tools20022.repository.msg.CorporateActionDate22.LeadPlaintiffDeadline, com.tools20022.repository.msg.CorporateActionDate25.LeadPlaintiffDeadline,
					com.tools20022.repository.msg.CorporateActionDate27.LeadPlaintiffDeadline, com.tools20022.repository.msg.CorporateActionDate28.LeadPlaintiffDeadline,
					com.tools20022.repository.msg.CorporateActionDate44.LeadPlaintiffDeadline, com.tools20022.repository.msg.CorporateActionDate58.LeadPlaintiffDeadline);
			elementContext_lazy = () -> ClassAction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LeadPlaintiffDeadline";
			definition = "Last day an investor can become a lead plaintiff.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date upon which the High Court provided approval.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#CourtApprovalDate
	 * CorporateActionDate1.CourtApprovalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#CourtApprovalDate
	 * CorporateActionDate13.CourtApprovalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#CourtApprovalDate
	 * CorporateActionDate14.CourtApprovalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#CourtApprovalDate
	 * CorporateActionDate21.CourtApprovalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#CourtApprovalDate
	 * CorporateActionDate22.CourtApprovalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#CourtApprovalDate
	 * CorporateActionDate25.CourtApprovalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#CourtApprovalDate
	 * CorporateActionDate27.CourtApprovalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#CourtApprovalDate
	 * CorporateActionDate28.CourtApprovalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#CourtApprovalDate
	 * CorporateActionDate2.CourtApprovalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#CourtApprovalDate
	 * CorporateActionDate44.CourtApprovalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#CourtApprovalDate
	 * CorporateActionDate58.CourtApprovalDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ClassAction ClassAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CourtApprovalDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date upon which the High Court provided approval."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CourtApprovalDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate1.CourtApprovalDate, com.tools20022.repository.msg.CorporateActionDate13.CourtApprovalDate,
					com.tools20022.repository.msg.CorporateActionDate14.CourtApprovalDate, com.tools20022.repository.msg.CorporateActionDate21.CourtApprovalDate, com.tools20022.repository.msg.CorporateActionDate22.CourtApprovalDate,
					com.tools20022.repository.msg.CorporateActionDate25.CourtApprovalDate, com.tools20022.repository.msg.CorporateActionDate27.CourtApprovalDate, com.tools20022.repository.msg.CorporateActionDate28.CourtApprovalDate,
					com.tools20022.repository.msg.CorporateActionDate2.CourtApprovalDate, com.tools20022.repository.msg.CorporateActionDate44.CourtApprovalDate, com.tools20022.repository.msg.CorporateActionDate58.CourtApprovalDate);
			elementContext_lazy = () -> ClassAction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CourtApprovalDate";
			definition = "Date upon which the High Court provided approval.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Period assigned by the court in a class action. It determines the
	 * client's eligible transactions that will be included in the class action
	 * and used to determine the resulting entitlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#ClassAction
	 * DateTimePeriod.ClassAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod3#ClaimPeriod
	 * CorporateActionPeriod3.ClaimPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6#ClaimPeriod
	 * CorporateActionPeriod6.ClaimPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#ClaimPeriod
	 * CorporateActionPeriod8.ClaimPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#ClaimPeriod
	 * CorporateActionPeriod10.ClaimPeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ClassAction ClassAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClaimPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period assigned by the court in a class action. It determines the client's eligible transactions that will be included in the class action and used to determine the resulting entitlement."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ClaimPeriod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPeriod3.ClaimPeriod, com.tools20022.repository.msg.CorporateActionPeriod6.ClaimPeriod,
					com.tools20022.repository.msg.CorporateActionPeriod8.ClaimPeriod, com.tools20022.repository.msg.CorporateActionPeriod10.ClaimPeriod);
			elementContext_lazy = () -> ClassAction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClaimPeriod";
			definition = "Period assigned by the court in a class action. It determines the client's eligible transactions that will be included in the class action and used to determine the resulting entitlement.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.ClassAction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date on which the action was filed at the applicable court.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#FilingDate
	 * CorporateActionDate22.FilingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#FilingDate
	 * CorporateActionDate25.FilingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#FilingDate
	 * CorporateActionDate27.FilingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#FilingDate
	 * CorporateActionDate28.FilingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#FilingDate
	 * CorporateActionDate44.FilingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#FilingDate
	 * CorporateActionDate58.FilingDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ClassAction ClassAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FilingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the action was filed at the applicable court."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FilingDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate22.FilingDate, com.tools20022.repository.msg.CorporateActionDate25.FilingDate,
					com.tools20022.repository.msg.CorporateActionDate27.FilingDate, com.tools20022.repository.msg.CorporateActionDate28.FilingDate, com.tools20022.repository.msg.CorporateActionDate44.FilingDate,
					com.tools20022.repository.msg.CorporateActionDate58.FilingDate);
			elementContext_lazy = () -> ClassAction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FilingDate";
			definition = "Date on which the action was filed at the applicable court.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date for the hearing between the plaintiff and defendant, as set by the
	 * court.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#HearingDate
	 * CorporateActionDate22.HearingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#HearingDate
	 * CorporateActionDate25.HearingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#HearingDate
	 * CorporateActionDate27.HearingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#HearingDate
	 * CorporateActionDate28.HearingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#HearingDate
	 * CorporateActionDate44.HearingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#HearingDate
	 * CorporateActionDate58.HearingDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ClassAction ClassAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HearingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date for the hearing between the plaintiff and defendant, as set by the court."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute HearingDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate22.HearingDate, com.tools20022.repository.msg.CorporateActionDate25.HearingDate,
					com.tools20022.repository.msg.CorporateActionDate27.HearingDate, com.tools20022.repository.msg.CorporateActionDate28.HearingDate, com.tools20022.repository.msg.CorporateActionDate44.HearingDate,
					com.tools20022.repository.msg.CorporateActionDate58.HearingDate);
			elementContext_lazy = () -> ClassAction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HearingDate";
			definition = "Date for the hearing between the plaintiff and defendant, as set by the court.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Corporate event for which class action is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#RelatedClassAction
	 * CorporateActionEvent.RelatedClassAction}</li>
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
	 * {@linkplain com.tools20022.repository.entity.ClassAction ClassAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Corporate event for which class action is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CorporateEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ClassAction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateEvent";
			definition = "Corporate event for which class action is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionEvent.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.RelatedClassAction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ClassAction";
				definition = "Form of lawsuit in which a group of shareholders collectively bring a claim to court, mainly because it would be too expensive for each individual shareholder to launch their own lawsuit.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.ClassAction, com.tools20022.repository.entity.CorporateActionEvent.RelatedClassAction);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ClassAction.ClassActionNumber, com.tools20022.repository.entity.ClassAction.LeadPlaintiffDeadline,
						com.tools20022.repository.entity.ClassAction.CourtApprovalDate, com.tools20022.repository.entity.ClassAction.ClaimPeriod, com.tools20022.repository.entity.ClassAction.FilingDate,
						com.tools20022.repository.entity.ClassAction.HearingDate, com.tools20022.repository.entity.ClassAction.CorporateEvent);
			}
		});
		return mmObject_lazy.get();
	}
}