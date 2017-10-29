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
import com.tools20022.repository.choice.CorporateActionEventReference1Choice;
import com.tools20022.repository.choice.CorporateActionEventReference2Choice;
import com.tools20022.repository.choice.CorporateActionEventReference3Choice;
import com.tools20022.repository.choice.CorporateActionEventReference4Choice;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.CorporateActionEventReference1;
import com.tools20022.repository.msg.CorporateActionEventReference2;
import com.tools20022.repository.msg.CorporateActionEventReference3;
import com.tools20022.repository.msg.CorporateActionEventReference4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the official date and identification of the event.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CorporateActionEventRegistration"
 * src="doc-files/CorporateActionEventRegistration.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration#CorporateActionEventIdentification
 * CorporateActionEventRegistration.CorporateActionEventIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration#OfficialCorporateActionEventIdentification
 * CorporateActionEventRegistration.OfficialCorporateActionEventIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration#OfficialAnnouncementPublicationDate
 * CorporateActionEventRegistration.OfficialAnnouncementPublicationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration#CorporateActionEvent
 * CorporateActionEventRegistration.CorporateActionEvent}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#CorporateActionEventRegistration
 * CorporateActionEvent.CorporateActionEventRegistration}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionEventReference1Choice
 * CorporateActionEventReference1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionEventReference1
 * CorporateActionEventReference1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionEventReference2Choice
 * CorporateActionEventReference2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionEventReference2
 * CorporateActionEventReference2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionEventReference3
 * CorporateActionEventReference3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionEventReference3Choice
 * CorporateActionEventReference3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionEventReference4
 * CorporateActionEventReference4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionEventReference4Choice
 * CorporateActionEventReference4Choice}</li>
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
 * "CorporateActionEventRegistration"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the official date and identification of the event."</li>
 * </ul>
 */
public class CorporateActionEventRegistration {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identification given to the event.
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
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters6#CorporateActionEventIdentification
	 * SettlementTypeAndAdditionalParameters6.CorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters5#CorporateActionEventIdentification
	 * SettlementTypeAndAdditionalParameters5.CorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters7#CorporateActionEventIdentification
	 * SettlementTypeAndAdditionalParameters7.CorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters8#CorporateActionEventIdentification
	 * SettlementTypeAndAdditionalParameters8.CorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation8#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation8.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation20#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation20.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation25#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation25.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation32#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation32.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation35#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation35.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation43#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation43.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation53#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation53.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation56#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation56.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation57#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation57.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation9#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation9.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation13#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation13.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation34#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation34.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation42#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation42.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation52#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation52.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation58#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation58.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventReference1Choice#LinkedCorporateActionIdentification
	 * CorporateActionEventReference1Choice.LinkedCorporateActionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReference1#EventIdentification
	 * CorporateActionEventReference1.EventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation6#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation6.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventReference2Choice#LinkedCorporateActionIdentification
	 * CorporateActionEventReference2Choice.LinkedCorporateActionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReference2#EventIdentification
	 * CorporateActionEventReference2.EventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation15#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation15.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation21#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation21.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation28#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation28.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation36#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation36.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation44#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation44.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation55#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation55.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation61#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation61.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation7#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation7.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation26#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation26.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation33#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation33.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation27#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation27.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation41#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation41.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation49#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation49.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation68#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation68.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation1#CorporateActionEventIdentification
	 * EventInformation1.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation2#CorporateActionEventIdentification
	 * EventInformation2.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation3#CorporateActionEventIdentification
	 * EventInformation3.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation4#CorporateActionEventIdentification
	 * EventInformation4.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation5#CorporateActionEventIdentification
	 * EventInformation5.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation6#CorporateActionEventIdentification
	 * EventInformation6.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation4#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation4.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation16#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation16.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation24#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation24.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation29#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation29.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation39#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation39.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation47#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation47.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation50#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation50.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation62#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation62.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation3#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation3.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation17#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation17.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation23#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation23.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation30#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation30.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation38#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation38.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation46#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation46.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation54#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation54.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation64#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation64.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation63#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation63.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation11#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation11.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation19#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation19.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation22#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation22.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation31#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation31.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation37#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation37.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation45#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation45.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation51#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation51.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation67#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation67.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters3#CorporateActionEventIdentification
	 * AdditionalParameters3.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters7#CorporateActionEventIdentification
	 * AdditionalParameters7.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters8#CorporateActionEventIdentification
	 * AdditionalParameters8.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters9#CorporateActionEventIdentification
	 * AdditionalParameters9.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters10#CorporateActionEventIdentification
	 * AdditionalParameters10.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters11#CorporateActionEventIdentification
	 * AdditionalParameters11.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters3#CorporateActionEventIdentification
	 * TransactionTypeAndAdditionalParameters3.
	 * CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters6#CorporateActionEventIdentification
	 * TransactionTypeAndAdditionalParameters6.
	 * CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification1#CorporateActionEventIdentification
	 * SettlementTypeAndIdentification1.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification8#CorporateActionEventIdentification
	 * SettlementTypeAndIdentification8.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification9#CorporateActionEventIdentification
	 * SettlementTypeAndIdentification9.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification11#CorporateActionEventIdentification
	 * SettlementTypeAndIdentification11.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification15#CorporateActionEventIdentification
	 * SettlementTypeAndIdentification15.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification17#CorporateActionEventIdentification
	 * SettlementTypeAndIdentification17.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification10#CorporateActionEventIdentification
	 * SettlementTypeAndIdentification10.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification12#CorporateActionEventIdentification
	 * SettlementTypeAndIdentification12.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters1#CorporateActionEventIdentification
	 * SettlementTypeAndAdditionalParameters1.CorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters4#CorporateActionEventIdentification
	 * SettlementTypeAndAdditionalParameters4.CorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters9#CorporateActionEventIdentification
	 * SettlementTypeAndAdditionalParameters9.CorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters10#CorporateActionEventIdentification
	 * SettlementTypeAndAdditionalParameters10.
	 * CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails5#CorporateActionEventIdentification
	 * TransactionDetails5.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails9#CorporateActionEventIdentification
	 * TransactionDetails9.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails22#CorporateActionEventIdentification
	 * TransactionDetails22.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails23#CorporateActionEventIdentification
	 * TransactionDetails23.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails36#CorporateActionEventIdentification
	 * TransactionDetails36.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails47#CorporateActionEventIdentification
	 * TransactionDetails47.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails53#CorporateActionEventIdentification
	 * TransactionDetails53.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails58#CorporateActionEventIdentification
	 * TransactionDetails58.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction7#CorporateActionEventIdentification
	 * Transaction7.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction8#CorporateActionEventIdentification
	 * Transaction8.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction9#CorporateActionEventIdentification
	 * Transaction9.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction10#CorporateActionEventIdentification
	 * Transaction10.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction14#CorporateActionEventIdentification
	 * Transaction14.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction12#CorporateActionEventIdentification
	 * Transaction12.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction15#CorporateActionEventIdentification
	 * Transaction15.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction16#CorporateActionEventIdentification
	 * Transaction16.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction20#CorporateActionEventIdentification
	 * Transaction20.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction19#CorporateActionEventIdentification
	 * Transaction19.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction23#CorporateActionEventIdentification
	 * Transaction23.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction22#CorporateActionEventIdentification
	 * Transaction22.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction28#CorporateActionEventIdentification
	 * Transaction28.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction27#CorporateActionEventIdentification
	 * Transaction27.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction30#CorporateActionEventIdentification
	 * Transaction30.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction31#CorporateActionEventIdentification
	 * Transaction31.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction6#CorporateActionEventIdentification
	 * Transaction6.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction11#CorporateActionEventIdentification
	 * Transaction11.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction13#CorporateActionEventIdentification
	 * Transaction13.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction17#CorporateActionEventIdentification
	 * Transaction17.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction18#CorporateActionEventIdentification
	 * Transaction18.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction21#CorporateActionEventIdentification
	 * Transaction21.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction29#CorporateActionEventIdentification
	 * Transaction29.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction32#CorporateActionEventIdentification
	 * Transaction32.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification2#CorporateActionEventIdentification
	 * Identification2.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction9#EventIdentification
	 * CorporateAction9.EventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation2#IssuerCorporateActionIdentification
	 * CorporateActionInformation2.IssuerCorporateActionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation2#CorporateActionProcessingIdentification
	 * CorporateActionInformation2.CorporateActionProcessingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation1#IssuerCorporateActionIdentification
	 * CorporateActionInformation1.IssuerCorporateActionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation1#CorporateActionProcessingIdentification
	 * CorporateActionInformation1.CorporateActionProcessingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#CorporateActionEventIdentification
	 * SecuritiesFinancingTransactionDetails2.CorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#CorporateActionEventIdentification
	 * SecuritiesFinancingTransactionDetails8.CorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification7#CorporateActionEventIdentification
	 * Identification7.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification6#CorporateActionEventIdentification
	 * Identification6.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation10#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation10.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation18#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation18.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation40#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation40.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation48#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation48.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#CorporateActionEventIdentification
	 * SecuritiesFinancingTransactionDetails6.CorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#CorporateActionEventIdentification
	 * SecuritiesFinancingTransactionDetails10.
	 * CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#CorporateActionEventIdentification
	 * SecuritiesFinancingTransactionDetails17.
	 * CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#CorporateActionEventIdentification
	 * SecuritiesFinancingTransactionDetails18.
	 * CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification5#CorporateActionEventIdentification
	 * Identification5.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification8#CorporateActionEventIdentification
	 * Identification8.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification11#CorporateActionEventIdentification
	 * Identification11.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification13#CorporateActionEventIdentification
	 * Identification13.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification9#CorporateActionEventIdentification
	 * Identification9.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation14#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation14.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovement1#CorporateActionEventIdentification
	 * IntraBalanceMovement1.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction25#CorporateActionEventIdentification
	 * Transaction25.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References36Choice#CorporateActionEventIdentification
	 * References36Choice.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References35Choice#CorporateActionEventIdentification
	 * References35Choice.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation12#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation12.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation5#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation5.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification3#CorporateActionEventIdentification
	 * Identification3.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters16#CorporateActionEventIdentification
	 * AdditionalParameters16.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails61#CorporateActionEventIdentification
	 * TransactionDetails61.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction34#CorporateActionEventIdentification
	 * Transaction34.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#CorporateActionEventIdentification
	 * SecuritiesFinancingTransactionDetails21.
	 * CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction35#CorporateActionEventIdentification
	 * Transaction35.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction36#CorporateActionEventIdentification
	 * Transaction36.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation71#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation71.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation69#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation69.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation70#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation70.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation78#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation78.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation77#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation77.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation76#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation76.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#CorporateActionEventIdentification
	 * SecuritiesFinancingTransactionDetails22.
	 * CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction38#CorporateActionEventIdentification
	 * Transaction38.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails66#CorporateActionEventIdentification
	 * TransactionDetails66.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction39#CorporateActionEventIdentification
	 * Transaction39.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction37#CorporateActionEventIdentification
	 * Transaction37.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#CorporateActionEventIdentification
	 * SecuritiesFinancingTransactionDetails24.
	 * CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction41#CorporateActionEventIdentification
	 * Transaction41.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails70#CorporateActionEventIdentification
	 * TransactionDetails70.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction40#CorporateActionEventIdentification
	 * Transaction40.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation79#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation79.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation83#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation83.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation82#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation82.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction43#CorporateActionEventIdentification
	 * Transaction43.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails71#CorporateActionEventIdentification
	 * TransactionDetails71.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#CorporateActionEventIdentification
	 * SecuritiesFinancingTransactionDetails25.
	 * CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction42#CorporateActionEventIdentification
	 * Transaction42.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction47#CorporateActionEventIdentification
	 * Transaction47.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#CorporateActionEventIdentification
	 * SecuritiesFinancingTransactionDetails26.
	 * CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails79#CorporateActionEventIdentification
	 * TransactionDetails79.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction45#CorporateActionEventIdentification
	 * Transaction45.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction46#CorporateActionEventIdentification
	 * Transaction46.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification19#CorporateActionEventIdentification
	 * SettlementTypeAndIdentification19.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters10#CorporateActionEventIdentification
	 * TransactionTypeAndAdditionalParameters10.
	 * CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters11#CorporateActionEventIdentification
	 * SettlementTypeAndAdditionalParameters11.
	 * CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters21#CorporateActionEventIdentification
	 * AdditionalParameters21.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters14#CorporateActionEventIdentification
	 * SettlementTypeAndAdditionalParameters14.
	 * CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification15#CorporateActionEventIdentification
	 * Identification15.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters13#CorporateActionEventIdentification
	 * SettlementTypeAndAdditionalParameters13.
	 * CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation92#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation92.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReference3#EventIdentification
	 * CorporateActionEventReference3.EventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation89#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation89.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation88#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation88.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation86#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation86.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation91#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation91.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation87#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation87.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation84#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation84.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation85#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation85.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation90#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation90.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventReference3Choice#LinkedCorporateActionIdentification
	 * CorporateActionEventReference3Choice.LinkedCorporateActionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation7#CorporateActionEventIdentification
	 * EventInformation7.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation93#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation93.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation98#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation98.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation100#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation100.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation102#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation102.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation97#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation97.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReference4#EventIdentification
	 * CorporateActionEventReference4.EventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation99#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation99.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation94#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation94.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation103#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation103.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventReference4Choice#LinkedCorporateActionIdentification
	 * CorporateActionEventReference4Choice.LinkedCorporateActionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation8#CorporateActionEventIdentification
	 * EventInformation8.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#CorporateActionEventIdentification
	 * SecuritiesFinancingTransactionDetails33.
	 * CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction49#CorporateActionEventIdentification
	 * Transaction49.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters12#CorporateActionEventIdentification
	 * TransactionTypeAndAdditionalParameters12.
	 * CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters25#CorporateActionEventIdentification
	 * AdditionalParameters25.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters16#CorporateActionEventIdentification
	 * SettlementTypeAndAdditionalParameters16.
	 * CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification24#CorporateActionEventIdentification
	 * SettlementTypeAndIdentification24.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails87#CorporateActionEventIdentification
	 * TransactionDetails87.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification24#CorporateActionEventIdentification
	 * Identification24.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction50#CorporateActionEventIdentification
	 * Transaction50.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction48#CorporateActionEventIdentification
	 * Transaction48.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters18#CorporateActionEventIdentification
	 * SettlementTypeAndAdditionalParameters18.
	 * CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters17#CorporateActionEventIdentification
	 * SettlementTypeAndAdditionalParameters17.
	 * CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation104#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation104.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation109#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation109.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation111#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation111.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation112#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation112.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation110#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation110.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation105#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation105.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation107#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation107.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation106#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation106.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation108#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation108.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation9#CorporateActionEventIdentification
	 * EventInformation9.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters19#CorporateActionEventIdentification
	 * SettlementTypeAndAdditionalParameters19.
	 * CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction53#CorporateActionEventIdentification
	 * Transaction53.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#CorporateActionEventIdentification
	 * TransactionDetails97.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters16#CorporateActionEventIdentification
	 * TransactionTypeAndAdditionalParameters16.
	 * CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#CorporateActionEventIdentification
	 * SecuritiesFinancingTransactionDetails35.
	 * CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction54#CorporateActionEventIdentification
	 * Transaction54.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction52#CorporateActionEventIdentification
	 * Transaction52.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters19#CorporateActionEventIdentification
	 * TransactionTypeAndAdditionalParameters19.
	 * CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation114#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation114.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation120#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation120.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation115#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation115.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation118#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation118.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction57#CorporateActionEventIdentification
	 * Transaction57.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation121#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation121.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation123#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation123.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation117#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation117.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#CorporateActionEventIdentification
	 * SecuritiesFinancingTransactionDetails36.
	 * CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation113#CorporateActionEventIdentification
	 * CorporateActionGeneralInformation113.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters20#CorporateActionEventIdentification
	 * SettlementTypeAndAdditionalParameters20.
	 * CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation10#CorporateActionEventIdentification
	 * EventInformation10.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction56#CorporateActionEventIdentification
	 * Transaction56.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails100#CorporateActionEventIdentification
	 * TransactionDetails100.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction55#CorporateActionEventIdentification
	 * Transaction55.CorporateActionEventIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration
	 * CorporateActionEventRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEventIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification given to the event."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CorporateActionEventIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters6.CorporateActionEventIdentification,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters5.CorporateActionEventIdentification, com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters7.CorporateActionEventIdentification,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters8.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation8.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation20.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation25.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation32.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation35.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation43.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation53.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation56.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation57.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation9.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation13.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation34.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation42.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation52.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation58.CorporateActionEventIdentification,
					com.tools20022.repository.choice.CorporateActionEventReference1Choice.LinkedCorporateActionIdentification, com.tools20022.repository.msg.CorporateActionEventReference1.EventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation6.CorporateActionEventIdentification, com.tools20022.repository.choice.CorporateActionEventReference2Choice.LinkedCorporateActionIdentification,
					com.tools20022.repository.msg.CorporateActionEventReference2.EventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation15.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation21.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation28.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation36.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation44.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation55.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation61.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation7.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation26.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation33.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation27.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation41.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation49.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation68.CorporateActionEventIdentification, com.tools20022.repository.msg.EventInformation1.CorporateActionEventIdentification,
					com.tools20022.repository.msg.EventInformation2.CorporateActionEventIdentification, com.tools20022.repository.msg.EventInformation3.CorporateActionEventIdentification,
					com.tools20022.repository.msg.EventInformation4.CorporateActionEventIdentification, com.tools20022.repository.msg.EventInformation5.CorporateActionEventIdentification,
					com.tools20022.repository.msg.EventInformation6.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation4.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation16.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation24.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation29.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation39.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation47.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation50.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation62.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation3.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation17.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation23.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation30.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation38.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation46.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation54.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation64.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation63.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation11.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation19.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation22.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation31.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation37.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation45.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation51.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation67.CorporateActionEventIdentification,
					com.tools20022.repository.msg.AdditionalParameters3.CorporateActionEventIdentification, com.tools20022.repository.msg.AdditionalParameters7.CorporateActionEventIdentification,
					com.tools20022.repository.msg.AdditionalParameters8.CorporateActionEventIdentification, com.tools20022.repository.msg.AdditionalParameters9.CorporateActionEventIdentification,
					com.tools20022.repository.msg.AdditionalParameters10.CorporateActionEventIdentification, com.tools20022.repository.msg.AdditionalParameters11.CorporateActionEventIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters3.CorporateActionEventIdentification, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters6.CorporateActionEventIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification1.CorporateActionEventIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification8.CorporateActionEventIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification9.CorporateActionEventIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification11.CorporateActionEventIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification15.CorporateActionEventIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification17.CorporateActionEventIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification10.CorporateActionEventIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification12.CorporateActionEventIdentification,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters1.CorporateActionEventIdentification, com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters4.CorporateActionEventIdentification,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters9.CorporateActionEventIdentification, com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters10.CorporateActionEventIdentification,
					com.tools20022.repository.msg.TransactionDetails5.CorporateActionEventIdentification, com.tools20022.repository.msg.TransactionDetails9.CorporateActionEventIdentification,
					com.tools20022.repository.msg.TransactionDetails22.CorporateActionEventIdentification, com.tools20022.repository.msg.TransactionDetails23.CorporateActionEventIdentification,
					com.tools20022.repository.msg.TransactionDetails36.CorporateActionEventIdentification, com.tools20022.repository.msg.TransactionDetails47.CorporateActionEventIdentification,
					com.tools20022.repository.msg.TransactionDetails53.CorporateActionEventIdentification, com.tools20022.repository.msg.TransactionDetails58.CorporateActionEventIdentification,
					com.tools20022.repository.msg.Transaction7.CorporateActionEventIdentification, com.tools20022.repository.msg.Transaction8.CorporateActionEventIdentification,
					com.tools20022.repository.msg.Transaction9.CorporateActionEventIdentification, com.tools20022.repository.msg.Transaction10.CorporateActionEventIdentification,
					com.tools20022.repository.msg.Transaction14.CorporateActionEventIdentification, com.tools20022.repository.msg.Transaction12.CorporateActionEventIdentification,
					com.tools20022.repository.msg.Transaction15.CorporateActionEventIdentification, com.tools20022.repository.msg.Transaction16.CorporateActionEventIdentification,
					com.tools20022.repository.msg.Transaction20.CorporateActionEventIdentification, com.tools20022.repository.msg.Transaction19.CorporateActionEventIdentification,
					com.tools20022.repository.msg.Transaction23.CorporateActionEventIdentification, com.tools20022.repository.msg.Transaction22.CorporateActionEventIdentification,
					com.tools20022.repository.msg.Transaction28.CorporateActionEventIdentification, com.tools20022.repository.msg.Transaction27.CorporateActionEventIdentification,
					com.tools20022.repository.msg.Transaction30.CorporateActionEventIdentification, com.tools20022.repository.msg.Transaction31.CorporateActionEventIdentification,
					com.tools20022.repository.msg.Transaction6.CorporateActionEventIdentification, com.tools20022.repository.msg.Transaction11.CorporateActionEventIdentification,
					com.tools20022.repository.msg.Transaction13.CorporateActionEventIdentification, com.tools20022.repository.msg.Transaction17.CorporateActionEventIdentification,
					com.tools20022.repository.msg.Transaction18.CorporateActionEventIdentification, com.tools20022.repository.msg.Transaction21.CorporateActionEventIdentification,
					com.tools20022.repository.msg.Transaction29.CorporateActionEventIdentification, com.tools20022.repository.msg.Transaction32.CorporateActionEventIdentification,
					com.tools20022.repository.msg.Identification2.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateAction9.EventIdentification,
					com.tools20022.repository.msg.CorporateActionInformation2.IssuerCorporateActionIdentification, com.tools20022.repository.msg.CorporateActionInformation2.CorporateActionProcessingIdentification,
					com.tools20022.repository.msg.CorporateActionInformation1.IssuerCorporateActionIdentification, com.tools20022.repository.msg.CorporateActionInformation1.CorporateActionProcessingIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.CorporateActionEventIdentification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.CorporateActionEventIdentification,
					com.tools20022.repository.msg.Identification7.CorporateActionEventIdentification, com.tools20022.repository.msg.Identification6.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation10.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation18.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation40.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation48.CorporateActionEventIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.CorporateActionEventIdentification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.CorporateActionEventIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.CorporateActionEventIdentification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.CorporateActionEventIdentification,
					com.tools20022.repository.msg.Identification5.CorporateActionEventIdentification, com.tools20022.repository.msg.Identification8.CorporateActionEventIdentification,
					com.tools20022.repository.msg.Identification11.CorporateActionEventIdentification, com.tools20022.repository.msg.Identification13.CorporateActionEventIdentification,
					com.tools20022.repository.msg.Identification9.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation14.CorporateActionEventIdentification,
					com.tools20022.repository.msg.IntraBalanceMovement1.CorporateActionEventIdentification, com.tools20022.repository.msg.Transaction25.CorporateActionEventIdentification,
					com.tools20022.repository.choice.References36Choice.CorporateActionEventIdentification, com.tools20022.repository.choice.References35Choice.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation12.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation5.CorporateActionEventIdentification,
					com.tools20022.repository.msg.Identification3.CorporateActionEventIdentification, com.tools20022.repository.msg.AdditionalParameters16.CorporateActionEventIdentification,
					com.tools20022.repository.msg.TransactionDetails61.CorporateActionEventIdentification, com.tools20022.repository.msg.Transaction34.CorporateActionEventIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.CorporateActionEventIdentification, com.tools20022.repository.msg.Transaction35.CorporateActionEventIdentification,
					com.tools20022.repository.msg.Transaction36.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation71.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation69.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation70.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation78.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation77.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation76.CorporateActionEventIdentification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.CorporateActionEventIdentification,
					com.tools20022.repository.msg.Transaction38.CorporateActionEventIdentification, com.tools20022.repository.msg.TransactionDetails66.CorporateActionEventIdentification,
					com.tools20022.repository.msg.Transaction39.CorporateActionEventIdentification, com.tools20022.repository.msg.Transaction37.CorporateActionEventIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.CorporateActionEventIdentification, com.tools20022.repository.msg.Transaction41.CorporateActionEventIdentification,
					com.tools20022.repository.msg.TransactionDetails70.CorporateActionEventIdentification, com.tools20022.repository.msg.Transaction40.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation79.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation83.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation82.CorporateActionEventIdentification, com.tools20022.repository.msg.Transaction43.CorporateActionEventIdentification,
					com.tools20022.repository.msg.TransactionDetails71.CorporateActionEventIdentification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.CorporateActionEventIdentification,
					com.tools20022.repository.msg.Transaction42.CorporateActionEventIdentification, com.tools20022.repository.msg.Transaction47.CorporateActionEventIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.CorporateActionEventIdentification, com.tools20022.repository.msg.TransactionDetails79.CorporateActionEventIdentification,
					com.tools20022.repository.msg.Transaction45.CorporateActionEventIdentification, com.tools20022.repository.msg.Transaction46.CorporateActionEventIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification19.CorporateActionEventIdentification, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters10.CorporateActionEventIdentification,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters11.CorporateActionEventIdentification, com.tools20022.repository.msg.AdditionalParameters21.CorporateActionEventIdentification,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters14.CorporateActionEventIdentification, com.tools20022.repository.msg.Identification15.CorporateActionEventIdentification,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters13.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation92.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionEventReference3.EventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation89.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation88.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation86.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation91.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation87.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation84.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation85.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation90.CorporateActionEventIdentification, com.tools20022.repository.choice.CorporateActionEventReference3Choice.LinkedCorporateActionIdentification,
					com.tools20022.repository.msg.EventInformation7.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation93.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation98.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation100.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation102.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation97.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionEventReference4.EventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation99.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation94.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation103.CorporateActionEventIdentification,
					com.tools20022.repository.choice.CorporateActionEventReference4Choice.LinkedCorporateActionIdentification, com.tools20022.repository.msg.EventInformation8.CorporateActionEventIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.CorporateActionEventIdentification, com.tools20022.repository.msg.Transaction49.CorporateActionEventIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters12.CorporateActionEventIdentification, com.tools20022.repository.msg.AdditionalParameters25.CorporateActionEventIdentification,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters16.CorporateActionEventIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification24.CorporateActionEventIdentification,
					com.tools20022.repository.msg.TransactionDetails87.CorporateActionEventIdentification, com.tools20022.repository.msg.Identification24.CorporateActionEventIdentification,
					com.tools20022.repository.msg.Transaction50.CorporateActionEventIdentification, com.tools20022.repository.msg.Transaction48.CorporateActionEventIdentification,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters18.CorporateActionEventIdentification, com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters17.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation104.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation109.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation111.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation112.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation110.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation105.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation107.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation106.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation108.CorporateActionEventIdentification, com.tools20022.repository.msg.EventInformation9.CorporateActionEventIdentification,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters19.CorporateActionEventIdentification, com.tools20022.repository.msg.Transaction53.CorporateActionEventIdentification,
					com.tools20022.repository.msg.TransactionDetails97.CorporateActionEventIdentification, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters16.CorporateActionEventIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.CorporateActionEventIdentification, com.tools20022.repository.msg.Transaction54.CorporateActionEventIdentification,
					com.tools20022.repository.msg.Transaction52.CorporateActionEventIdentification, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters19.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation114.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation120.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation115.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation118.CorporateActionEventIdentification,
					com.tools20022.repository.msg.Transaction57.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation121.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation123.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation117.CorporateActionEventIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.CorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation113.CorporateActionEventIdentification,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters20.CorporateActionEventIdentification, com.tools20022.repository.msg.EventInformation10.CorporateActionEventIdentification,
					com.tools20022.repository.msg.Transaction56.CorporateActionEventIdentification, com.tools20022.repository.msg.TransactionDetails100.CorporateActionEventIdentification,
					com.tools20022.repository.msg.Transaction55.CorporateActionEventIdentification);
			elementContext_lazy = () -> CorporateActionEventRegistration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionEventIdentification";
			definition = "Identification given to the event.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identification of a corporate action assigned by an official central
	 * body/entity within a given market.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation8#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation8.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation20#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation20.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation25#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation25.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation32#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation32.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation35#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation35.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation43#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation43.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation53#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation53.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation56#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation56.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation57#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation57.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation9#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation9.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation13#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation13.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation34#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation34.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation42#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation42.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation52#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation52.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation58#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation58.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventReference1Choice#LinkedOfficialCorporateActionEventIdentification
	 * CorporateActionEventReference1Choice.
	 * LinkedOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation6#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation6.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventReference2Choice#LinkedOfficialCorporateActionEventIdentification
	 * CorporateActionEventReference2Choice.
	 * LinkedOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation15#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation15.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation21#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation21.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation28#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation28.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation36#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation36.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation44#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation44.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation55#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation55.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation61#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation61.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation7#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation7.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation26#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation26.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation33#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation33.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation27#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation27.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation41#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation41.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation49#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation49.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation68#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation68.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation1#OfficialCorporateActionEventIdentification
	 * EventInformation1.OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation2#OfficialCorporateActionEventIdentification
	 * EventInformation2.OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation3#OfficialCorporateActionEventIdentification
	 * EventInformation3.OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation4#OfficialCorporateActionEventIdentification
	 * EventInformation4.OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation5#OfficialCorporateActionEventIdentification
	 * EventInformation5.OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation6#OfficialCorporateActionEventIdentification
	 * EventInformation6.OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation4#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation4.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation16#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation16.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation24#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation24.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation29#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation29.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation39#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation39.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation47#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation47.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation50#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation50.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation62#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation62.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation3#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation3.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation17#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation17.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation23#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation23.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation30#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation30.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation38#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation38.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation46#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation46.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation54#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation54.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation64#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation64.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation63#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation63.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation11#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation11.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation19#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation19.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation22#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation22.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation31#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation31.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation37#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation37.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation45#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation45.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation51#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation51.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation67#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation67.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation10#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation10.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation18#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation18.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation40#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation40.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation48#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation48.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation14#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation14.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation12#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation12.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation5#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation5.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation71#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation71.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation69#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation69.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation70#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation70.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation78#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation78.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation77#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation77.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation76#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation76.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation79#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation79.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation83#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation83.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation82#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation82.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation92#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation92.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation89#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation89.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation88#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation88.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation86#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation86.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation91#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation91.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation87#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation87.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation84#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation84.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation85#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation85.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation90#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation90.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventReference3Choice#LinkedOfficialCorporateActionEventIdentification
	 * CorporateActionEventReference3Choice.
	 * LinkedOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation7#OfficialCorporateActionEventIdentification
	 * EventInformation7.OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation93#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation93.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation98#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation98.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation100#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation100.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation102#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation102.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation97#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation97.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation99#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation99.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation94#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation94.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation103#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation103.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventReference4Choice#LinkedOfficialCorporateActionEventIdentification
	 * CorporateActionEventReference4Choice.
	 * LinkedOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation8#OfficialCorporateActionEventIdentification
	 * EventInformation8.OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation104#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation104.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation109#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation109.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation111#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation111.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation112#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation112.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation110#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation110.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation105#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation105.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation107#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation107.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation106#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation106.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation108#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation108.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation9#OfficialCorporateActionEventIdentification
	 * EventInformation9.OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation114#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation114.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation120#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation120.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation115#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation115.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation118#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation118.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation121#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation121.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation123#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation123.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation117#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation117.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation113#OfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation113.
	 * OfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation10#OfficialCorporateActionEventIdentification
	 * EventInformation10.OfficialCorporateActionEventIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration
	 * CorporateActionEventRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a corporate action assigned by an official central body/entity within a given market."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OfficialCorporateActionEventIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionGeneralInformation8.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation20.OfficialCorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation25.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation32.OfficialCorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation35.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation43.OfficialCorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation53.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation56.OfficialCorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation57.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation9.OfficialCorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation13.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation34.OfficialCorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation42.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation52.OfficialCorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation58.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.choice.CorporateActionEventReference1Choice.LinkedOfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation6.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.choice.CorporateActionEventReference2Choice.LinkedOfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation15.OfficialCorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation21.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation28.OfficialCorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation36.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation44.OfficialCorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation55.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation61.OfficialCorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation7.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation26.OfficialCorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation33.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation27.OfficialCorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation41.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation49.OfficialCorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation68.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.EventInformation1.OfficialCorporateActionEventIdentification, com.tools20022.repository.msg.EventInformation2.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.EventInformation3.OfficialCorporateActionEventIdentification, com.tools20022.repository.msg.EventInformation4.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.EventInformation5.OfficialCorporateActionEventIdentification, com.tools20022.repository.msg.EventInformation6.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation4.OfficialCorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation16.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation24.OfficialCorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation29.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation39.OfficialCorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation47.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation50.OfficialCorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation62.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation3.OfficialCorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation17.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation23.OfficialCorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation30.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation38.OfficialCorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation46.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation54.OfficialCorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation64.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation63.OfficialCorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation11.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation19.OfficialCorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation22.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation31.OfficialCorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation37.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation45.OfficialCorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation51.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation67.OfficialCorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation10.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation18.OfficialCorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation40.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation48.OfficialCorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation14.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation12.OfficialCorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation5.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation71.OfficialCorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation69.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation70.OfficialCorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation78.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation77.OfficialCorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation76.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation79.OfficialCorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation83.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation82.OfficialCorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation92.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation89.OfficialCorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation88.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation86.OfficialCorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation91.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation87.OfficialCorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation84.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation85.OfficialCorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation90.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.choice.CorporateActionEventReference3Choice.LinkedOfficialCorporateActionEventIdentification, com.tools20022.repository.msg.EventInformation7.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation93.OfficialCorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation98.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation100.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation102.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation97.OfficialCorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation99.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation94.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation103.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.choice.CorporateActionEventReference4Choice.LinkedOfficialCorporateActionEventIdentification, com.tools20022.repository.msg.EventInformation8.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation104.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation109.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation111.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation112.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation110.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation105.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation107.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation106.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation108.OfficialCorporateActionEventIdentification, com.tools20022.repository.msg.EventInformation9.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation114.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation120.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation115.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation118.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation121.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation123.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation117.OfficialCorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionGeneralInformation113.OfficialCorporateActionEventIdentification, com.tools20022.repository.msg.EventInformation10.OfficialCorporateActionEventIdentification);
			elementContext_lazy = () -> CorporateActionEventRegistration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OfficialCorporateActionEventIdentification";
			definition = "Identification of a corporate action assigned by an official central body/entity within a given market.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Date/time at which the corporate action is legally announced by an
	 * official body, for example, publication by a governmental administration.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#OfficialAnnouncementPublicationDate
	 * CorporateActionDate1.OfficialAnnouncementPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#OfficialAnnouncementPublicationDate
	 * CorporateActionDate13.OfficialAnnouncementPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#OfficialAnnouncementPublicationDate
	 * CorporateActionDate14.OfficialAnnouncementPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#OfficialAnnouncementPublicationDate
	 * CorporateActionDate21.OfficialAnnouncementPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#OfficialAnnouncementPublicationDate
	 * CorporateActionDate22.OfficialAnnouncementPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#OfficialAnnouncementPublicationDate
	 * CorporateActionDate25.OfficialAnnouncementPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#OfficialAnnouncementPublicationDate
	 * CorporateActionDate27.OfficialAnnouncementPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#OfficialAnnouncementPublicationDate
	 * CorporateActionDate28.OfficialAnnouncementPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification1#OfficialAnnouncementPublicationDate
	 * CorporateActionNotification1.OfficialAnnouncementPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#OfficialAnnouncementPublicationDate
	 * CorporateActionDate44.OfficialAnnouncementPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#OfficialAnnouncementPublicationDate
	 * CorporateActionDate58.OfficialAnnouncementPublicationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration
	 * CorporateActionEventRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialAnnouncementPublicationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the corporate action is legally announced by an official body, for example, publication by a governmental administration."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OfficialAnnouncementPublicationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate1.OfficialAnnouncementPublicationDate, com.tools20022.repository.msg.CorporateActionDate13.OfficialAnnouncementPublicationDate,
					com.tools20022.repository.msg.CorporateActionDate14.OfficialAnnouncementPublicationDate, com.tools20022.repository.msg.CorporateActionDate21.OfficialAnnouncementPublicationDate,
					com.tools20022.repository.msg.CorporateActionDate22.OfficialAnnouncementPublicationDate, com.tools20022.repository.msg.CorporateActionDate25.OfficialAnnouncementPublicationDate,
					com.tools20022.repository.msg.CorporateActionDate27.OfficialAnnouncementPublicationDate, com.tools20022.repository.msg.CorporateActionDate28.OfficialAnnouncementPublicationDate,
					com.tools20022.repository.msg.CorporateActionNotification1.OfficialAnnouncementPublicationDate, com.tools20022.repository.msg.CorporateActionDate44.OfficialAnnouncementPublicationDate,
					com.tools20022.repository.msg.CorporateActionDate58.OfficialAnnouncementPublicationDate);
			elementContext_lazy = () -> CorporateActionEventRegistration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OfficialAnnouncementPublicationDate";
			definition = "Date/time at which the corporate action is legally announced by an official body, for example, publication by a governmental administration.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Corporate event for which a registration is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#CorporateActionEventRegistration
	 * CorporateActionEvent.CorporateActionEventRegistration}</li>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration
	 * CorporateActionEventRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Corporate event for which a registration is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CorporateActionEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEventRegistration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionEvent";
			definition = "Corporate event for which a registration is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.CorporateActionEventRegistration;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEventRegistration";
				definition = "Specifies the official date and identification of the event.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionEvent.CorporateActionEventRegistration);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionEventRegistration.CorporateActionEventIdentification,
						com.tools20022.repository.entity.CorporateActionEventRegistration.OfficialCorporateActionEventIdentification, com.tools20022.repository.entity.CorporateActionEventRegistration.OfficialAnnouncementPublicationDate,
						com.tools20022.repository.entity.CorporateActionEventRegistration.CorporateActionEvent);
				derivationComponent_lazy = () -> Arrays.asList(CorporateActionEventReference1Choice.mmObject(), CorporateActionEventReference1.mmObject(), CorporateActionEventReference2Choice.mmObject(),
						CorporateActionEventReference2.mmObject(), CorporateActionEventReference3.mmObject(), CorporateActionEventReference3Choice.mmObject(), CorporateActionEventReference4.mmObject(),
						CorporateActionEventReference4Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}