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
import com.tools20022.repository.codeset.PartyTypeCode;
import com.tools20022.repository.codeset.TypeOfIdentificationCode;
import com.tools20022.repository.datatype.LEIIdentifier;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Unique and unambiguous way to identify a party
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PartyIdentificationInformation"
 * src="doc-files/PartyIdentificationInformation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#OtherIdentification
 * PartyIdentificationInformation.OtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#IdentifiedParty
 * PartyIdentificationInformation.IdentifiedParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#TaxIdentificationNumber
 * PartyIdentificationInformation.TaxIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#NationalRegistrationNumber
 * PartyIdentificationInformation.NationalRegistrationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#TypeOfIdentification
 * PartyIdentificationInformation.TypeOfIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#Declaration
 * PartyIdentificationInformation.Declaration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#PartyType
 * PartyIdentificationInformation.PartyType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#PartyName
 * PartyIdentificationInformation.PartyName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#ValidityPeriod
 * PartyIdentificationInformation.ValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#IdentifiedMarket
 * PartyIdentificationInformation.IdentifiedMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#LEI
 * PartyIdentificationInformation.LEI}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#RelatedPartyIdentification
 * GenericIdentification.RelatedPartyIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#Identification
 * Party.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyName#PartyIdentification
 * PartyName.PartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedIdentification
 * DateTimePeriod.RelatedIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Market#Identification
 * Market.Identification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification1Choice#NameAndAddress
 * PartyIdentification1Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice#NameAndAddress
 * PartyIdentification2Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification5Choice#NameAndAddress
 * PartyIdentification5Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification8#Identification
 * PartyIdentification8.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification32#Identification
 * PartyIdentification32.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification43#Identification
 * PartyIdentification43.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount2#PartyIdentification
 * PartyIdentificationAndAccount2.PartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount5#PartyIdentification
 * PartyIdentificationAndAccount5.PartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount4#PartyIdentification
 * PartyIdentificationAndAccount4.PartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification21#PartyIdentification
 * PartyIdentification21.PartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification12Choice#NameAndAddress
 * PartyIdentification12Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification36#Identification
 * PartyIdentification36.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification10Choice#NameAndAddress
 * PartyIdentification10Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount16#Identification
 * PartyIdentificationAndAccount16.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification14Choice#NameAndAddress
 * PartyIdentification14Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification44Choice#NameAndAddress
 * PartyIdentification44Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification46#Identification
 * PartyIdentification46.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification45Choice#NameAndAddress
 * PartyIdentification45Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount44#Identification
 * PartyIdentificationAndAccount44.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification37Choice#NameAndAddress
 * PartyIdentification37Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification1#TypeOfIdentification
 * AlternatePartyIdentification1.TypeOfIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification2#IdentificationType
 * AlternatePartyIdentification2.IdentificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount1#Identification
 * PartyIdentificationAndAccount1.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount1#AlternateIdentification
 * PartyIdentificationAndAccount1.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification29#PartyIdentification
 * PartyIdentification29.PartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification29#AlternateIdentification
 * PartyIdentification29.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification2#Identification
 * PartyIdentification2.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification2#AlternateIdentification
 * PartyIdentification2.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification43Choice#NameAndAddress
 * PartyIdentification43Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount42#Identification
 * PartyIdentificationAndAccount42.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount42#AlternateIdentification
 * PartyIdentificationAndAccount42.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification48#Identification
 * PartyIdentification48.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification48#AlternateIdentification
 * PartyIdentification48.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount11#Identification
 * PartyIdentificationAndAccount11.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount11#AlternateIdentification
 * PartyIdentificationAndAccount11.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification3Choice#NameAndAddress
 * PartyIdentification3Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount12#Identification
 * PartyIdentificationAndAccount12.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount12#AlternateIdentification
 * PartyIdentificationAndAccount12.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount20#Identification
 * PartyIdentificationAndAccount20.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount20#AlternateIdentification
 * PartyIdentificationAndAccount20.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification30Choice#NameAndAddress
 * PartyIdentification30Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount15#Identification
 * PartyIdentificationAndAccount15.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount15#AlternateIdentification
 * PartyIdentificationAndAccount15.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount39#Identification
 * PartyIdentificationAndAccount39.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount39#AlternateIdentification
 * PartyIdentificationAndAccount39.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification38Choice#NameAndAddress
 * PartyIdentification38Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount50#Identification
 * PartyIdentificationAndAccount50.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount50#AlternateIdentification
 * PartyIdentificationAndAccount50.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount19#Identification
 * PartyIdentificationAndAccount19.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount19#AlternateIdentification
 * PartyIdentificationAndAccount19.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount21#Identification
 * PartyIdentificationAndAccount21.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount21#AlternateIdentification
 * PartyIdentificationAndAccount21.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount40#Identification
 * PartyIdentificationAndAccount40.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount40#AlternateIdentification
 * PartyIdentificationAndAccount40.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount41#Identification
 * PartyIdentificationAndAccount41.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount41#AlternateIdentification
 * PartyIdentificationAndAccount41.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount43#Identification
 * PartyIdentificationAndAccount43.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification58Choice#NameAndAddress
 * PartyIdentification58Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification53#Identification
 * PartyIdentification53.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification62Choice#NameAndAddress
 * PartyIdentification62Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount68#Identification
 * PartyIdentificationAndAccount68.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification60Choice#NameAndAddress
 * PartyIdentification60Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification65Choice#NameAndAddress
 * PartyIdentification65Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount75#Identification
 * PartyIdentificationAndAccount75.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification3#IdentificationType
 * AlternatePartyIdentification3.IdentificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount63#Identification
 * PartyIdentificationAndAccount63.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount63#AlternateIdentification
 * PartyIdentificationAndAccount63.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification52#Identification
 * PartyIdentification52.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification52#AlternateIdentification
 * PartyIdentification52.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount64#Identification
 * PartyIdentificationAndAccount64.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount64#AlternateIdentification
 * PartyIdentificationAndAccount64.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification61Choice#NameAndAddress
 * PartyIdentification61Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount60#Identification
 * PartyIdentificationAndAccount60.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount60#AlternateIdentification
 * PartyIdentificationAndAccount60.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount66#Identification
 * PartyIdentificationAndAccount66.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount66#AlternateIdentification
 * PartyIdentificationAndAccount66.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification16Choice#NameAndAddress
 * PartyIdentification16Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification46Choice#NameAndAddress
 * PartyIdentification46Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification56Choice#NameAndAddress
 * PartyIdentification56Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification33#AlternateIdentification
 * PartyIdentification33.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification34#AlternateIdentification
 * PartyIdentification34.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification48Choice#NameAndAddress
 * PartyIdentification48Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification50#AlternateIdentification
 * PartyIdentification50.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification52Choice#NameAndAddress
 * PartyIdentification52Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification51#AlternateIdentification
 * PartyIdentification51.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification56#AlternateIdentification
 * PartyIdentification56.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification57#AlternateIdentification
 * PartyIdentification57.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification35#Identification
 * PartyIdentification35.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification35#AlternateIdentification
 * PartyIdentification35.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount14#Identification
 * PartyIdentificationAndAccount14.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount14#AlternateIdentification
 * PartyIdentificationAndAccount14.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount17#Identification
 * PartyIdentificationAndAccount17.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount17#AlternateIdentification
 * PartyIdentificationAndAccount17.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount18#Identification
 * PartyIdentificationAndAccount18.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount18#AlternateIdentification
 * PartyIdentificationAndAccount18.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification17Choice#NameAndAddress
 * PartyIdentification17Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification37#Identification
 * PartyIdentification37.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification37#AlternateIdentification
 * PartyIdentification37.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount22#Identification
 * PartyIdentificationAndAccount22.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount22#AlternateIdentification
 * PartyIdentificationAndAccount22.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount23#Identification
 * PartyIdentificationAndAccount23.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount23#AlternateIdentification
 * PartyIdentificationAndAccount23.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification31Choice#NameAndAddress
 * PartyIdentification31Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount24#Identification
 * PartyIdentificationAndAccount24.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount24#AlternateIdentification
 * PartyIdentificationAndAccount24.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification39Choice#NameAndAddress
 * PartyIdentification39Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification47#Identification
 * PartyIdentification47.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification47#AlternateIdentification
 * PartyIdentification47.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification40Choice#NameAndAddress
 * PartyIdentification40Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount51#Identification
 * PartyIdentificationAndAccount51.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount51#AlternateIdentification
 * PartyIdentificationAndAccount51.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount52#Identification
 * PartyIdentificationAndAccount52.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount52#AlternateIdentification
 * PartyIdentificationAndAccount52.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification42Choice#NameAndAddress
 * PartyIdentification42Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount54#Identification
 * PartyIdentificationAndAccount54.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount54#AlternateIdentification
 * PartyIdentificationAndAccount54.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification53Choice#NameAndAddress
 * PartyIdentification53Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification49#Identification
 * PartyIdentification49.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification49#AlternateIdentification
 * PartyIdentification49.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification54Choice#NameAndAddress
 * PartyIdentification54Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount56#Identification
 * PartyIdentificationAndAccount56.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount56#AlternateIdentification
 * PartyIdentificationAndAccount56.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount57#Identification
 * PartyIdentificationAndAccount57.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount57#AlternateIdentification
 * PartyIdentificationAndAccount57.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification55Choice#NameAndAddress
 * PartyIdentification55Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount58#Identification
 * PartyIdentificationAndAccount58.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount58#AlternateIdentification
 * PartyIdentificationAndAccount58.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification47Choice#NameAndAddress
 * PartyIdentification47Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification57Choice#NameAndAddress
 * PartyIdentification57Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification49Choice#NameAndAddress
 * PartyIdentification49Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification59Choice#NameAndAddress
 * PartyIdentification59Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification15#Identification
 * PartyIdentification15.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount26#Identification
 * PartyIdentificationAndAccount26.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount26#AlternateIdentification
 * PartyIdentificationAndAccount26.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification4#Identification
 * PartyIdentification4.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification4#AlternateIdentification
 * PartyIdentification4.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount29#Identification
 * PartyIdentificationAndAccount29.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount29#AlternateIdentification
 * PartyIdentificationAndAccount29.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount27#Identification
 * PartyIdentificationAndAccount27.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount27#AlternateIdentification
 * PartyIdentificationAndAccount27.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount28#Identification
 * PartyIdentificationAndAccount28.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount28#AlternateIdentification
 * PartyIdentificationAndAccount28.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount30#Identification
 * PartyIdentificationAndAccount30.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount30#AlternateIdentification
 * PartyIdentificationAndAccount30.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount35#Identification
 * PartyIdentificationAndAccount35.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount35#AlternateIdentification
 * PartyIdentificationAndAccount35.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount38#Identification
 * PartyIdentificationAndAccount38.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount38#AlternateIdentification
 * PartyIdentificationAndAccount38.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount36#Identification
 * PartyIdentificationAndAccount36.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount36#AlternateIdentification
 * PartyIdentificationAndAccount36.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount37#Identification
 * PartyIdentificationAndAccount37.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount37#AlternateIdentification
 * PartyIdentificationAndAccount37.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount49#Identification
 * PartyIdentificationAndAccount49.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount49#AlternateIdentification
 * PartyIdentificationAndAccount49.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount59#Identification
 * PartyIdentificationAndAccount59.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount59#AlternateIdentification
 * PartyIdentificationAndAccount59.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount61#Identification
 * PartyIdentificationAndAccount61.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount61#AlternateIdentification
 * PartyIdentificationAndAccount61.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount62#Identification
 * PartyIdentificationAndAccount62.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount62#AlternateIdentification
 * PartyIdentificationAndAccount62.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount25#Identification
 * PartyIdentificationAndAccount25.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount65#Identification
 * PartyIdentificationAndAccount65.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount65#AlternateIdentification
 * PartyIdentificationAndAccount65.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification63Choice#NameAndAddress
 * PartyIdentification63Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount67#Identification
 * PartyIdentificationAndAccount67.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount67#AlternateIdentification
 * PartyIdentificationAndAccount67.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification38#Identification
 * PartyIdentification38.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification15Choice#NameAndAddress
 * PartyIdentification15Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount9#Identification
 * PartyIdentificationAndAccount9.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount9#AlternateIdentification
 * PartyIdentificationAndAccount9.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification32Choice#NameAndAddress
 * PartyIdentification32Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification5#IdentificationType
 * AlternatePartyIdentification5.IdentificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount79#Identification
 * PartyIdentificationAndAccount79.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount79#AdditionalInformation
 * PartyIdentificationAndAccount79.AdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount79#AlternateIdentification
 * PartyIdentificationAndAccount79.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification70Choice#NameAndAddress
 * PartyIdentification70Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification6#TypeOfIdentification
 * AlternatePartyIdentification6.TypeOfIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount87#Identification
 * PartyIdentificationAndAccount87.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount87#AdditionalInformation
 * PartyIdentificationAndAccount87.AdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount87#AlternateIdentification
 * PartyIdentificationAndAccount87.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount83#Identification
 * PartyIdentificationAndAccount83.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount83#AdditionalInformation
 * PartyIdentificationAndAccount83.AdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount83#AlternateIdentification
 * PartyIdentificationAndAccount83.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount77#Identification
 * PartyIdentificationAndAccount77.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount77#AlternateIdentification
 * PartyIdentificationAndAccount77.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount77#AdditionalInformation
 * PartyIdentificationAndAccount77.AdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount78#Identification
 * PartyIdentificationAndAccount78.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount78#AlternateIdentification
 * PartyIdentificationAndAccount78.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount78#AdditionalInformation
 * PartyIdentificationAndAccount78.AdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification23#NameAndAddress
 * PartyIdentification23.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification6Choice#NameAndAddress
 * PartyIdentification6Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount10#Identification
 * PartyIdentificationAndAccount10.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount10#AlternateIdentification
 * PartyIdentificationAndAccount10.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount8#Identification
 * PartyIdentificationAndAccount8.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount8#AlternateIdentification
 * PartyIdentificationAndAccount8.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification54#NameAndAddress
 * PartyIdentification54.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification68Choice#NameAndAddress
 * PartyIdentification68Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification55#Identification
 * PartyIdentification55.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification55#AlternateIdentification
 * PartyIdentification55.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification55#AdditionalInformation
 * PartyIdentification55.AdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount34#Identification
 * PartyIdentificationAndAccount34.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount34#AdditionalInformation
 * PartyIdentificationAndAccount34.AdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount34#AlternateIdentification
 * PartyIdentificationAndAccount34.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount80#Identification
 * PartyIdentificationAndAccount80.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount80#AlternateIdentification
 * PartyIdentificationAndAccount80.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount80#AdditionalInformation
 * PartyIdentificationAndAccount80.AdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification41#Identification
 * PartyIdentification41.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification40#Identification
 * PartyIdentification40.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyModification1#PartyIdentification
 * PartyModification1.PartyIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryParty1#Party
 * ProprietaryParty1.Party}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryParty2#Party
 * ProprietaryParty2.Party}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryParty3#Party
 * ProprietaryParty3.Party}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party7Choice#Party
 * Party7Choice.Party}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party12Choice#Party
 * Party12Choice.Party}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification42#Identification
 * PartyIdentification42.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification7Choice#NameAndAddress
 * PartyIdentification7Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification8Choice#NameAndAddress
 * PartyIdentification8Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification19Choice#NameAndAddress
 * PartyIdentification19Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification73Choice#NameAndAddress
 * PartyIdentification73Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification73Choice#PartyIdentification
 * PartyIdentification73Choice.PartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification60#NameAndAddress
 * PartyIdentification60.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount3#PartyIdentification
 * PartyIdentificationAndAccount3.PartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification1#Identification
 * PartyIdentification1.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification9Choice#NameAndAddress
 * PartyIdentification9Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IssuerInformation1#Identification
 * IssuerInformation1.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification39#Identification
 * PartyIdentification39.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount53#Identification
 * PartyIdentificationAndAccount53.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount53#AlternateIdentification
 * PartyIdentificationAndAccount53.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount55#Identification
 * PartyIdentificationAndAccount55.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount55#AlternateIdentification
 * PartyIdentificationAndAccount55.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount45#Identification
 * PartyIdentificationAndAccount45.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount45#AlternateIdentification
 * PartyIdentificationAndAccount45.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount48#Identification
 * PartyIdentificationAndAccount48.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount48#AlternateIdentification
 * PartyIdentificationAndAccount48.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount46#Identification
 * PartyIdentificationAndAccount46.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount46#AlternateIdentification
 * PartyIdentificationAndAccount46.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount47#Identification
 * PartyIdentificationAndAccount47.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount47#AlternateIdentification
 * PartyIdentificationAndAccount47.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount6#PartyIdentification
 * PartyIdentificationAndAccount6.PartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndContactInformation1#PartyIdentification
 * PartyIdentificationAndContactInformation1.PartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification45#Identification
 * PartyIdentification45.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification29Choice#NameAndAddress
 * PartyIdentification29Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification33Choice#NameAndAddress
 * PartyIdentification33Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount69#Identification
 * PartyIdentificationAndAccount69.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount69#AlternateIdentification
 * PartyIdentificationAndAccount69.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount70#Identification
 * PartyIdentificationAndAccount70.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount70#AlternateIdentification
 * PartyIdentificationAndAccount70.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount71#Identification
 * PartyIdentificationAndAccount71.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount71#AlternateIdentification
 * PartyIdentificationAndAccount71.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount72#Identification
 * PartyIdentificationAndAccount72.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount72#AlternateIdentification
 * PartyIdentificationAndAccount72.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount73#Identification
 * PartyIdentificationAndAccount73.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount73#AlternateIdentification
 * PartyIdentificationAndAccount73.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount74#Identification
 * PartyIdentificationAndAccount74.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount74#AlternateIdentification
 * PartyIdentificationAndAccount74.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification66Choice#NameAndAddress
 * PartyIdentification66Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount76#Identification
 * PartyIdentificationAndAccount76.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification67Choice#NameAndAddress
 * PartyIdentification67Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification4#IdentificationType
 * AlternatePartyIdentification4.IdentificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount31#Identification
 * PartyIdentificationAndAccount31.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount31#AlternateIdentification
 * PartyIdentificationAndAccount31.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification34Choice#NameAndAddress
 * PartyIdentification34Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount32#PartyIdentification
 * PartyIdentificationAndAccount32.PartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification58#Identification
 * PartyIdentification58.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification14#Identification
 * PartyIdentification14.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification11#Identification
 * PartyIdentification11.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification17#Identification
 * PartyIdentification17.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification19#Identification
 * PartyIdentification19.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification30#Identification
 * PartyIdentification30.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification18#Identification
 * PartyIdentification18.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification20#Identification
 * PartyIdentification20.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification31#Identification
 * PartyIdentification31.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification16#Identification
 * PartyIdentification16.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification26Choice#NameAndAddress
 * PartyIdentification26Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount13#PartyIdentification
 * PartyIdentificationAndAccount13.PartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount7#PartyIdentification
 * PartyIdentificationAndAccount7.PartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice#NameAndAddress
 * PartyIdentification71Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification25Choice#Identification
 * PartyIdentification25Choice.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification25Choice#NameAndAddress
 * PartyIdentification25Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount95#PartyIdentification
 * PartyIdentificationAndAccount95.PartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount97#PartyIdentification
 * PartyIdentificationAndAccount97.PartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification62#NameAndAddress
 * PartyIdentification62.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount96#PartyIdentification
 * PartyIdentificationAndAccount96.PartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification63#PartyIdentification
 * PartyIdentification63.PartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification64#NameAndAddress
 * PartyIdentification64.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification75Choice#NameAndAddress
 * PartyIdentification75Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount5#AccountServicer
 * SafekeepingAccount5.AccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification83Choice#NameAndAddress
 * PartyIdentification83Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount100#Identification
 * PartyIdentificationAndAccount100.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount100#AlternateIdentification
 * PartyIdentificationAndAccount100.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount100#AdditionalInformation
 * PartyIdentificationAndAccount100.AdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount101#Identification
 * PartyIdentificationAndAccount101.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount101#AlternateIdentification
 * PartyIdentificationAndAccount101.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IssuerInformation2#Identification
 * IssuerInformation2.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification71#Identification
 * PartyIdentification71.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount102#PartyIdentification
 * PartyIdentificationAndAccount102.PartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification89Choice#NameAndAddress
 * PartyIdentification89Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification87Choice#NameAndAddress
 * PartyIdentification87Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification88Choice#NameAndAddress
 * PartyIdentification88Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount104#Identification
 * PartyIdentificationAndAccount104.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount104#AlternateIdentification
 * PartyIdentificationAndAccount104.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QualifiedPartyIdentification1#ShortIdentification
 * QualifiedPartyIdentification1.ShortIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment5#SendingInstitution
 * CardTransactionEnvironment5.SendingInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment5#ReceivingInstitution
 * CardTransactionEnvironment5.ReceivingInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment5#SettlementInstitution
 * CardTransactionEnvironment5.SettlementInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification90Choice#NameAndAddress
 * PartyIdentification90Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount106#Identification
 * PartyIdentificationAndAccount106.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount106#AlternateIdentification
 * PartyIdentificationAndAccount106.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification75#Identification
 * PartyIdentification75.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification75#AlternateIdentification
 * PartyIdentification75.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount112#Identification
 * PartyIdentificationAndAccount112.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount112#AlternateIdentification
 * PartyIdentificationAndAccount112.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification7#IdentificationType
 * AlternatePartyIdentification7.IdentificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount111#Identification
 * PartyIdentificationAndAccount111.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount111#AlternateIdentification
 * PartyIdentificationAndAccount111.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount117#Identification
 * PartyIdentificationAndAccount117.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount107#Identification
 * PartyIdentificationAndAccount107.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount107#AlternateIdentification
 * PartyIdentificationAndAccount107.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification76#Identification
 * PartyIdentification76.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification77#Identification
 * PartyIdentification77.Identification}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party28Choice#Party
 * Party28Choice.Party}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification93Choice#NameAndAddress
 * PartyIdentification93Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification91#Identification
 * PartyIdentification91.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification93#AlternateIdentification
 * PartyIdentification93.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount122#Identification
 * PartyIdentificationAndAccount122.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount122#AlternateIdentification
 * PartyIdentificationAndAccount122.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification92#Identification
 * PartyIdentification92.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification92#AlternateIdentification
 * PartyIdentification92.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification94Choice#NameAndAddress
 * PartyIdentification94Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount120#Identification
 * PartyIdentificationAndAccount120.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount120#AlternateIdentification
 * PartyIdentificationAndAccount120.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount121#Identification
 * PartyIdentificationAndAccount121.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount121#AlternateIdentification
 * PartyIdentificationAndAccount121.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification94#Identification
 * PartyIdentification94.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification97Choice#NameAndAddress
 * PartyIdentification97Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification97#PartyIdentification
 * PartyIdentification97.PartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount124#PartyIdentification
 * PartyIdentificationAndAccount124.PartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification95#Identification
 * PartyIdentification95.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount123#PartyIdentification
 * PartyIdentificationAndAccount123.PartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification96Choice#NameAndAddress
 * PartyIdentification96Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification96#Identification
 * PartyIdentification96.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification99Choice#NameAndAddress
 * PartyIdentification99Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification98#Identification
 * PartyIdentification98.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification100#Identification
 * PartyIdentification100.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PlaceOfClearingIdentification1#Identification
 * PlaceOfClearingIdentification1.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PlaceOfTradeIdentification1#MarketTypeAndIdentification
 * PlaceOfTradeIdentification1.MarketTypeAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafeKeepingPlace1#SafekeepingPlaceFormat
 * SafeKeepingPlace1.SafekeepingPlaceFormat}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification99#Identification
 * PartyIdentification99.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Pledgee1#PledgeeTypeAndIdentification
 * Pledgee1.PledgeeTypeAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification100Choice#NameAndAddress
 * PartyIdentification100Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount127#Identification
 * PartyIdentificationAndAccount127.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount127#AlternateIdentification
 * PartyIdentificationAndAccount127.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount127#AdditionalInformation
 * PartyIdentificationAndAccount127.AdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification102Choice#NameAndAddress
 * PartyIdentification102Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount126#PartyIdentification
 * PartyIdentificationAndAccount126.PartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification101Choice#NameAndAddress
 * PartyIdentification101Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification8#IdentificationType
 * AlternatePartyIdentification8.IdentificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification104Choice#NameAndAddress
 * PartyIdentification104Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification101#AlternateIdentification
 * PartyIdentification101.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification111Choice#NameAndAddress
 * PartyIdentification111Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification102#Identification
 * PartyIdentification102.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification102#AlternateIdentification
 * PartyIdentification102.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount129#Identification
 * PartyIdentificationAndAccount129.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount129#AlternateIdentification
 * PartyIdentificationAndAccount129.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount130#Identification
 * PartyIdentificationAndAccount130.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount130#AlternateIdentification
 * PartyIdentificationAndAccount130.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification9#IdentificationType
 * AlternatePartyIdentification9.IdentificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification113Choice#NameAndAddress
 * PartyIdentification113Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount128#Identification
 * PartyIdentificationAndAccount128.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount128#AlternateIdentification
 * PartyIdentificationAndAccount128.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification108#Identification
 * PartyIdentification108.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount133#Identification
 * PartyIdentificationAndAccount133.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount133#AlternateIdentification
 * PartyIdentificationAndAccount133.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification103#Identification
 * PartyIdentification103.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification103#AlternateIdentification
 * PartyIdentification103.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount131#Identification
 * PartyIdentificationAndAccount131.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount131#AlternateIdentification
 * PartyIdentificationAndAccount131.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount146#Identification
 * PartyIdentificationAndAccount146.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount136#Identification
 * PartyIdentificationAndAccount136.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount136#AlternateIdentification
 * PartyIdentificationAndAccount136.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount134#Identification
 * PartyIdentificationAndAccount134.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount134#AlternateIdentification
 * PartyIdentificationAndAccount134.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification109#Identification
 * PartyIdentification109.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification111#Identification
 * PartyIdentification111.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification110#Identification
 * PartyIdentification110.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification115Choice#NameAndAddress
 * PartyIdentification115Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafeKeepingPlace2#SafekeepingPlaceFormat
 * SafeKeepingPlace2.SafekeepingPlaceFormat}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PlaceOfTradeIdentification2#MarketTypeAndIdentification
 * PlaceOfTradeIdentification2.MarketTypeAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Pledgee2#PledgeeTypeAndIdentification
 * Pledgee2.PledgeeTypeAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification112#Identification
 * PartyIdentification112.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount7#AccountServicer
 * SafekeepingAccount7.AccountServicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification113#Party
 * PartyIdentification113.Party}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount147#PartyIdentification
 * PartyIdentificationAndAccount147.PartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification119#Identification
 * PartyIdentification119.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification120#Identification
 * PartyIdentification120.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification120#AlternateIdentification
 * PartyIdentification120.AlternateIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.OrganisationIdentification
 * OrganisationIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PersonIdentification
 * PersonIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress2
 * NameAndAddress2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification1Choice
 * PartyIdentification1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress5
 * NameAndAddress5}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification2Choice
 * PartyIdentification2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification4Choice
 * PartyIdentification4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress1
 * NameAndAddress1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress4
 * NameAndAddress4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification5Choice
 * PartyIdentification5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party2Choice Party2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification8
 * PartyIdentification8}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party6Choice Party6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification32
 * PartyIdentification32}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party11Choice Party11Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification43
 * PartyIdentification43}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification
 * PartyIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress7
 * NameAndAddress7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount2
 * PartyIdentificationAndAccount2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount5
 * PartyIdentificationAndAccount5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount4
 * PartyIdentificationAndAccount4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification21
 * PartyIdentification21}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification13Choice
 * PartyIdentification13Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification36Choice
 * PartyIdentification36Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification51Choice
 * PartyIdentification51Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification12Choice
 * PartyIdentification12Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification36
 * PartyIdentification36}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification10Choice
 * PartyIdentification10Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount16
 * PartyIdentificationAndAccount16}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification14Choice
 * PartyIdentification14Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification44Choice
 * PartyIdentification44Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification46
 * PartyIdentification46}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification45Choice
 * PartyIdentification45Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount44
 * PartyIdentificationAndAccount44}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification37Choice
 * PartyIdentification37Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.IdentificationType2Choice
 * IdentificationType2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AlternatePartyIdentification1
 * AlternatePartyIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.IdentificationType4Choice
 * IdentificationType4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AlternatePartyIdentification2
 * AlternatePartyIdentification2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyTextInformation1
 * PartyTextInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount1
 * PartyIdentificationAndAccount1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification29
 * PartyIdentification29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification2
 * PartyIdentification2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification43Choice
 * PartyIdentification43Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount42
 * PartyIdentificationAndAccount42}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification48
 * PartyIdentification48}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount11
 * PartyIdentificationAndAccount11}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification3Choice
 * PartyIdentification3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount12
 * PartyIdentificationAndAccount12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyTextInformation2
 * PartyTextInformation2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount20
 * PartyIdentificationAndAccount20}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification30Choice
 * PartyIdentification30Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount15
 * PartyIdentificationAndAccount15}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount39
 * PartyIdentificationAndAccount39}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification38Choice
 * PartyIdentification38Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount50
 * PartyIdentificationAndAccount50}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount19
 * PartyIdentificationAndAccount19}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount21
 * PartyIdentificationAndAccount21}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount40
 * PartyIdentificationAndAccount40}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount41
 * PartyIdentificationAndAccount41}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount43
 * PartyIdentificationAndAccount43}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress12
 * NameAndAddress12}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification58Choice
 * PartyIdentification58Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification53
 * PartyIdentification53}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification62Choice
 * PartyIdentification62Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount68
 * PartyIdentificationAndAccount68}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification60Choice
 * PartyIdentification60Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification65Choice
 * PartyIdentification65Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount75
 * PartyIdentificationAndAccount75}</li>
 * <li>{@linkplain com.tools20022.repository.choice.IdentificationType5Choice
 * IdentificationType5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AlternatePartyIdentification3
 * AlternatePartyIdentification3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyTextInformation3
 * PartyTextInformation3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount63
 * PartyIdentificationAndAccount63}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification52
 * PartyIdentification52}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyTextInformation4
 * PartyTextInformation4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount64
 * PartyIdentificationAndAccount64}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification61Choice
 * PartyIdentification61Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount60
 * PartyIdentificationAndAccount60}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount66
 * PartyIdentificationAndAccount66}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification18Choice
 * PartyIdentification18Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification16Choice
 * PartyIdentification16Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification46Choice
 * PartyIdentification46Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification56Choice
 * PartyIdentification56Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification33
 * PartyIdentification33}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification34
 * PartyIdentification34}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification48Choice
 * PartyIdentification48Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification50
 * PartyIdentification50}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification52Choice
 * PartyIdentification52Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification51
 * PartyIdentification51}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification56
 * PartyIdentification56}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification57
 * PartyIdentification57}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification41Choice
 * PartyIdentification41Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification50Choice
 * PartyIdentification50Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification35
 * PartyIdentification35}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount14
 * PartyIdentificationAndAccount14}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount17
 * PartyIdentificationAndAccount17}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount18
 * PartyIdentificationAndAccount18}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification17Choice
 * PartyIdentification17Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification37
 * PartyIdentification37}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount22
 * PartyIdentificationAndAccount22}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount23
 * PartyIdentificationAndAccount23}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification31Choice
 * PartyIdentification31Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount24
 * PartyIdentificationAndAccount24}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification39Choice
 * PartyIdentification39Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification47
 * PartyIdentification47}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification40Choice
 * PartyIdentification40Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount51
 * PartyIdentificationAndAccount51}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount52
 * PartyIdentificationAndAccount52}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification42Choice
 * PartyIdentification42Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount54
 * PartyIdentificationAndAccount54}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification53Choice
 * PartyIdentification53Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification49
 * PartyIdentification49}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification54Choice
 * PartyIdentification54Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount56
 * PartyIdentificationAndAccount56}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount57
 * PartyIdentificationAndAccount57}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification55Choice
 * PartyIdentification55Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount58
 * PartyIdentificationAndAccount58}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification47Choice
 * PartyIdentification47Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification57Choice
 * PartyIdentification57Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentificationSD3
 * PartyIdentificationSD3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification3
 * PartyIdentification3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification49Choice
 * PartyIdentification49Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification59Choice
 * PartyIdentification59Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification15
 * PartyIdentification15}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount26
 * PartyIdentificationAndAccount26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification4
 * PartyIdentification4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount29
 * PartyIdentificationAndAccount29}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount27
 * PartyIdentificationAndAccount27}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount28
 * PartyIdentificationAndAccount28}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount30
 * PartyIdentificationAndAccount30}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount35
 * PartyIdentificationAndAccount35}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount38
 * PartyIdentificationAndAccount38}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount36
 * PartyIdentificationAndAccount36}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount37
 * PartyIdentificationAndAccount37}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount49
 * PartyIdentificationAndAccount49}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount59
 * PartyIdentificationAndAccount59}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount61
 * PartyIdentificationAndAccount61}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount62
 * PartyIdentificationAndAccount62}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification64Choice
 * PartyIdentification64Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount25
 * PartyIdentificationAndAccount25}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount65
 * PartyIdentificationAndAccount65}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification63Choice
 * PartyIdentification63Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount67
 * PartyIdentificationAndAccount67}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification38
 * PartyIdentification38}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification15Choice
 * PartyIdentification15Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount9
 * PartyIdentificationAndAccount9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress13
 * NameAndAddress13}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification32Choice
 * PartyIdentification32Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.IdentificationType40Choice
 * IdentificationType40Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AlternatePartyIdentification5
 * AlternatePartyIdentification5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount79
 * PartyIdentificationAndAccount79}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification70Choice
 * PartyIdentification70Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.IdentificationType41Choice
 * IdentificationType41Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AlternatePartyIdentification6
 * AlternatePartyIdentification6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount87
 * PartyIdentificationAndAccount87}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount83
 * PartyIdentificationAndAccount83}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount77
 * PartyIdentificationAndAccount77}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount78
 * PartyIdentificationAndAccount78}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification23Choice
 * PartyIdentification23Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification35Choice
 * PartyIdentification35Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyTextInformation5
 * PartyTextInformation5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification23
 * PartyIdentification23}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyRole1Choice
 * PartyRole1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification6Choice
 * PartyIdentification6Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount10
 * PartyIdentificationAndAccount10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount8
 * PartyIdentificationAndAccount8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification54
 * PartyIdentification54}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification68Choice
 * PartyIdentification68Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification55
 * PartyIdentification55}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount34
 * PartyIdentificationAndAccount34}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount80
 * PartyIdentificationAndAccount80}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party8Choice Party8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification41
 * PartyIdentification41}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification40
 * PartyIdentification40}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyModification1
 * PartyModification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryParty1
 * ProprietaryParty1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress3
 * NameAndAddress3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryParty2
 * ProprietaryParty2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress10
 * NameAndAddress10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryParty3
 * ProprietaryParty3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party7Choice Party7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party12Choice Party12Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.choice.Party10Choice Party10Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification42
 * PartyIdentification42}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party9Choice Party9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyType1Choice
 * PartyType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification7Choice
 * PartyIdentification7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress8
 * NameAndAddress8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification22
 * PartyIdentification22}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification8Choice
 * PartyIdentification8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification44
 * PartyIdentification44}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification19Choice
 * PartyIdentification19Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification59
 * PartyIdentification59}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification73Choice
 * PartyIdentification73Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification60
 * PartyIdentification60}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount3
 * PartyIdentificationAndAccount3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party1Choice Party1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification1
 * PartyIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification9Choice
 * PartyIdentification9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IssuerInformation1
 * IssuerInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification39
 * PartyIdentification39}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress9
 * NameAndAddress9}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification24Choice
 * PartyIdentification24Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification11Choice
 * PartyIdentification11Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount53
 * PartyIdentificationAndAccount53}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount55
 * PartyIdentificationAndAccount55}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount45
 * PartyIdentificationAndAccount45}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount48
 * PartyIdentificationAndAccount48}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount46
 * PartyIdentificationAndAccount46}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount47
 * PartyIdentificationAndAccount47}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification25
 * PartyIdentification25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount6
 * PartyIdentificationAndAccount6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndContactInformation1
 * PartyIdentificationAndContactInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification45
 * PartyIdentification45}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification9
 * PartyIdentification9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress6
 * NameAndAddress6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification26
 * PartyIdentification26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification27
 * PartyIdentification27}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification29Choice
 * PartyIdentification29Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification28
 * PartyIdentification28}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification33Choice
 * PartyIdentification33Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount69
 * PartyIdentificationAndAccount69}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount70
 * PartyIdentificationAndAccount70}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount71
 * PartyIdentificationAndAccount71}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount72
 * PartyIdentificationAndAccount72}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount73
 * PartyIdentificationAndAccount73}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount74
 * PartyIdentificationAndAccount74}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification66Choice
 * PartyIdentification66Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount76
 * PartyIdentificationAndAccount76}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification67Choice
 * PartyIdentification67Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.IdentificationType6Choice
 * IdentificationType6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AlternatePartyIdentification4
 * AlternatePartyIdentification4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount31
 * PartyIdentificationAndAccount31}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification34Choice
 * PartyIdentification34Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount32
 * PartyIdentificationAndAccount32}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party13Choice Party13Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification58
 * PartyIdentification58}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyOrganisation1Choice
 * PartyOrganisation1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification14
 * PartyIdentification14}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyPrivate1 PartyPrivate1}
 * </li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification11
 * PartyIdentification11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification17
 * PartyIdentification17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification12
 * PartyIdentification12}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party5Choice Party5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification19
 * PartyIdentification19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification30
 * PartyIdentification30}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification18
 * PartyIdentification18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification20
 * PartyIdentification20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification31
 * PartyIdentification31}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification13
 * PartyIdentification13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification16
 * PartyIdentification16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress11
 * NameAndAddress11}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification26Choice
 * PartyIdentification26Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount13
 * PartyIdentificationAndAccount13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification5
 * PartyIdentification5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount7
 * PartyIdentificationAndAccount7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification24
 * PartyIdentification24}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification72Choice
 * PartyIdentification72Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
 * PartyIdentification71Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TechnicalIdentification1Choice
 * TechnicalIdentification1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification25Choice
 * PartyIdentification25Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyRole2Choice
 * PartyRole2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount95
 * PartyIdentificationAndAccount95}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount97
 * PartyIdentificationAndAccount97}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification62
 * PartyIdentification62}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount96
 * PartyIdentificationAndAccount96}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification63
 * PartyIdentification63}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification64
 * PartyIdentification64}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification75Choice
 * PartyIdentification75Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification83Choice
 * PartyIdentification83Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount100
 * PartyIdentificationAndAccount100}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount101
 * PartyIdentificationAndAccount101}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyRole4Choice
 * PartyRole4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IssuerInformation2
 * IssuerInformation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification71
 * PartyIdentification71}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount102
 * PartyIdentificationAndAccount102}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification89Choice
 * PartyIdentification89Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification87Choice
 * PartyIdentification87Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification88Choice
 * PartyIdentification88Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount104
 * PartyIdentificationAndAccount104}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QualifiedPartyIdentification1
 * QualifiedPartyIdentification1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CounterpartyIdentification1Choice
 * CounterpartyIdentification1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransactionEnvironment5
 * CardTransactionEnvironment5}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification90Choice
 * PartyIdentification90Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification92Choice
 * PartyIdentification92Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount106
 * PartyIdentificationAndAccount106}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification75
 * PartyIdentification75}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount112
 * PartyIdentificationAndAccount112}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AlternatePartyIdentification7
 * AlternatePartyIdentification7}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount111
 * PartyIdentificationAndAccount111}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount117
 * PartyIdentificationAndAccount117}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount107
 * PartyIdentificationAndAccount107}</li>
 * <li>{@linkplain com.tools20022.repository.choice.IdentificationType42Choice
 * IdentificationType42Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification76
 * PartyIdentification76}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PersonOrOrganisation1Choice
 * PersonOrOrganisation1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PersonOrOrganisation2Choice
 * PersonOrOrganisation2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification77
 * PartyIdentification77}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party28Choice Party28Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification93Choice
 * PartyIdentification93Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification91
 * PartyIdentification91}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification93
 * PartyIdentification93}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount122
 * PartyIdentificationAndAccount122}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification92
 * PartyIdentification92}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification94Choice
 * PartyIdentification94Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount120
 * PartyIdentificationAndAccount120}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount121
 * PartyIdentificationAndAccount121}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party29Choice Party29Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification94
 * PartyIdentification94}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification97Choice
 * PartyIdentification97Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification97
 * PartyIdentification97}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount124
 * PartyIdentificationAndAccount124}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyRole5Choice
 * PartyRole5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification95
 * PartyIdentification95}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount123
 * PartyIdentificationAndAccount123}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification96Choice
 * PartyIdentification96Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification96
 * PartyIdentification96}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification99Choice
 * PartyIdentification99Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress15
 * NameAndAddress15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification98
 * PartyIdentification98}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification100
 * PartyIdentification100}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlaceOfClearingIdentification1
 * PlaceOfClearingIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlaceOfTradeIdentification1
 * PlaceOfTradeIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SafeKeepingPlace1
 * SafeKeepingPlace1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification99
 * PartyIdentification99}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Pledgee1 Pledgee1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification100Choice
 * PartyIdentification100Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount127
 * PartyIdentificationAndAccount127}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification102Choice
 * PartyIdentification102Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount126
 * PartyIdentificationAndAccount126}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification101Choice
 * PartyIdentification101Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AlternatePartyIdentification8
 * AlternatePartyIdentification8}</li>
 * <li>{@linkplain com.tools20022.repository.choice.IdentificationType43Choice
 * IdentificationType43Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification104Choice
 * PartyIdentification104Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification101
 * PartyIdentification101}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification111Choice
 * PartyIdentification111Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification102
 * PartyIdentification102}</li>
 * <li>{@linkplain com.tools20022.repository.choice.IdentificationType44Choice
 * IdentificationType44Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount129
 * PartyIdentificationAndAccount129}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount130
 * PartyIdentificationAndAccount130}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AlternatePartyIdentification9
 * AlternatePartyIdentification9}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification103Choice
 * PartyIdentification103Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification113Choice
 * PartyIdentification113Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount128
 * PartyIdentificationAndAccount128}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification108
 * PartyIdentification108}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount133
 * PartyIdentificationAndAccount133}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification103
 * PartyIdentification103}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount131
 * PartyIdentificationAndAccount131}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount146
 * PartyIdentificationAndAccount146}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount136
 * PartyIdentificationAndAccount136}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount134
 * PartyIdentificationAndAccount134}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification109
 * PartyIdentification109}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification111
 * PartyIdentification111}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification110
 * PartyIdentification110}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification115Choice
 * PartyIdentification115Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SafeKeepingPlace2
 * SafeKeepingPlace2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification114Choice
 * PartyIdentification114Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlaceOfTradeIdentification2
 * PlaceOfTradeIdentification2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Pledgee2 Pledgee2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification95Choice
 * PartyIdentification95Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CounterpartyIdentification2Choice
 * CounterpartyIdentification2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification112
 * PartyIdentification112}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification113
 * PartyIdentification113}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount147
 * PartyIdentificationAndAccount147}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification119
 * PartyIdentification119}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification120
 * PartyIdentification120}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CounterpartyIdentification3Choice
 * CounterpartyIdentification3Choice}</li>
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
 * "PartyIdentificationInformation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Unique and unambiguous way to identify a party"</li>
 * </ul>
 */
public class PartyIdentificationInformation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifier issued to a party for which no specific identifier has been
	 * defined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#RelatedPartyIdentification
	 * GenericIdentification.RelatedPartyIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification1Choice#ProprietaryIdentification
	 * PartyIdentification1Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice#ProprietaryIdentification
	 * PartyIdentification2Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification4Choice#ProprietaryIdentification
	 * PartyIdentification4Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson5#OtherIdentification
	 * IndividualPerson5.OtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson10#OtherIdentification
	 * IndividualPerson10.OtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification3Choice#ProprietaryIdentification
	 * FinancialInstitutionIdentification3Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson20#OtherIdentification
	 * IndividualPerson20.OtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount26#AccountOwnerOtherIdentification
	 * CashAccount26.AccountOwnerOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IndividualPersonIdentificationChoice#IdentificationNumber
	 * IndividualPersonIdentificationChoice.IdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification5Choice#ProprietaryIdentification
	 * PartyIdentification5Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson6#ModifiedOtherIdentification
	 * IndividualPerson6.ModifiedOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson11#ModifiedOtherIdentification
	 * IndividualPerson11.ModifiedOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MemberIdentification2Choice#Other
	 * MemberIdentification2Choice.Other}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification2#ProprietaryIdentification
	 * OrganisationIdentification2.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification3#OtherIdentification
	 * PersonIdentification3.OtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification4#Other
	 * OrganisationIdentification4.Other}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification5#Other
	 * PersonIdentification5.Other}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ContactDetails2#Other
	 * ContactDetails2.Other}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification8#Other
	 * OrganisationIdentification8.Other}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification3#ProprietaryIdentification
	 * FinancialInstitutionIdentification3.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification5Choice#ProprietaryIdentification
	 * FinancialInstitutionIdentification5Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification13Choice#ProprietaryIdentification
	 * PartyIdentification13Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification36Choice#ProprietaryIdentification
	 * PartyIdentification36Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification7#Other
	 * OrganisationIdentification7.Other}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification51Choice#ProprietaryIdentification
	 * PartyIdentification51Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification9#Other
	 * OrganisationIdentification9.Other}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification10Choice#ProprietaryIdentification
	 * PartyIdentification10Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification14Choice#ProprietaryIdentification
	 * PartyIdentification14Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification45Choice#ProprietaryIdentification
	 * PartyIdentification45Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification37Choice#ProprietaryIdentification
	 * PartyIdentification37Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat3Choice#Proprietary
	 * SafekeepingPlaceFormat3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification43Choice#ProprietaryIdentification
	 * PartyIdentification43Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification3Choice#ProprietaryIdentification
	 * PartyIdentification3Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification30Choice#ProprietaryIdentification
	 * PartyIdentification30Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification38Choice#ProprietaryIdentification
	 * PartyIdentification38Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification62Choice#ProprietaryIdentification
	 * PartyIdentification62Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification60Choice#ProprietaryIdentification
	 * PartyIdentification60Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification65Choice#ProprietaryIdentification
	 * PartyIdentification65Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat4Choice#Proprietary
	 * SafekeepingPlaceFormat4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification61Choice#ProprietaryIdentification
	 * PartyIdentification61Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat2Choice#Proprietary
	 * SafekeepingPlaceFormat2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification18Choice#ProprietaryIdentification
	 * PartyIdentification18Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat5Choice#Proprietary
	 * SafekeepingPlaceFormat5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification16Choice#ProprietaryIdentification
	 * PartyIdentification16Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification46Choice#ProprietaryIdentification
	 * PartyIdentification46Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification56Choice#ProprietaryIdentification
	 * PartyIdentification56Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification48Choice#ProprietaryIdentification
	 * PartyIdentification48Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification52Choice#ProprietaryIdentification
	 * PartyIdentification52Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification41Choice#ProprietaryIdentification
	 * PartyIdentification41Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification50Choice#ProprietaryIdentification
	 * PartyIdentification50Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification31Choice#ProprietaryIdentification
	 * PartyIdentification31Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification40Choice#ProprietaryIdentification
	 * PartyIdentification40Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification42Choice#ProprietaryIdentification
	 * PartyIdentification42Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification54Choice#ProprietaryIdentification
	 * PartyIdentification54Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification55Choice#ProprietaryIdentification
	 * PartyIdentification55Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification47Choice#ProprietaryIdentification
	 * PartyIdentification47Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification57Choice#ProprietaryIdentification
	 * PartyIdentification57Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormatChoice#IdentificationAsDSS
	 * SafekeepingPlaceFormatChoice.IdentificationAsDSS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification49Choice#ProprietaryIdentification
	 * PartyIdentification49Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification59Choice#ProprietaryIdentification
	 * PartyIdentification59Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification64Choice#ProprietaryIdentification
	 * PartyIdentification64Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification63Choice#ProprietaryIdentification
	 * PartyIdentification63Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification15Choice#ProprietaryIdentification
	 * PartyIdentification15Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification32Choice#ProprietaryIdentification
	 * PartyIdentification32Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification70Choice#ProprietaryIdentification
	 * PartyIdentification70Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification23Choice#ProprietaryIdentification
	 * PartyIdentification23Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification35Choice#ProprietaryIdentification
	 * PartyIdentification35Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification23#ProprietaryIdentification
	 * PartyIdentification23.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification6Choice#ProprietaryIdentification
	 * PartyIdentification6Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification54#ProprietaryIdentification
	 * PartyIdentification54.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification6#Other
	 * OrganisationIdentification6.Other}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification22#AlternativeIdentifier
	 * PartyIdentification22.AlternativeIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification44#AlternativeIdentifier
	 * PartyIdentification44.AlternativeIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters1#AcquirerIdentification
	 * AcquirerProtocolParameters1.AcquirerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#AcquirerIdentification
	 * AcquirerProtocolParameters3.AcquirerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment8#MerchantIdentification
	 * CardPaymentEnvironment8.MerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment17#MerchantIdentification
	 * CardPaymentEnvironment17.MerchantIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Acquirer1#Identification
	 * Acquirer1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult1#AuthorisationEntity
	 * AuthorisationResult1.AuthorisationEntity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Acquirer2#Identification
	 * Acquirer2.Identification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Acquirer3#Identification
	 * Acquirer3.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation8#Identification
	 * Organisation8.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation9#Identification
	 * Organisation9.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult2#AuthorisationEntity
	 * AuthorisationResult2.AuthorisationEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult3#AuthorisationEntity
	 * AuthorisationResult3.AuthorisationEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment3#MerchantIdentification
	 * CardPaymentEnvironment3.MerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment11#MerchantIdentification
	 * CardPaymentEnvironment11.MerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment16#MerchantIdentification
	 * CardPaymentEnvironment16.MerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment7#MerchantIdentification
	 * CardPaymentEnvironment7.MerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment15#MerchantIdentification
	 * CardPaymentEnvironment15.MerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment19#MerchantIdentification
	 * CardPaymentEnvironment19.MerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson2#OtherIdentification
	 * IndividualPerson2.OtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson12#OtherIdentification
	 * IndividualPerson12.OtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson9#OtherIdentification
	 * IndividualPerson9.OtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NonFinancialInstitutionIdentification1#ProprietaryIdentification
	 * NonFinancialInstitutionIdentification1.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification2#OtherIdentification
	 * PersonIdentification2.OtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification1#ProprietaryIdentification
	 * FinancialInstitutionIdentification1.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification9Choice#ProprietaryIdentification
	 * PartyIdentification9Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PersonIdentificationType1Choice#OtherIdentification
	 * PersonIdentificationType1Choice.OtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1#AdditionalIdentification
	 * BeneficialOwner1.AdditionalIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification11Choice#ProprietaryIdentification
	 * PartyIdentification11Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification25#ProprietaryIdentification
	 * PartyIdentification25.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification6#ProprietaryIdentification
	 * FinancialInstitutionIdentification6.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification26#ProprietaryIdentification
	 * PartyIdentification26.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification27#ProprietaryIdentification
	 * PartyIdentification27.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification28#ProprietaryIdentification
	 * PartyIdentification28.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification33Choice#ProprietaryIdentification
	 * PartyIdentification33Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification66Choice#ProprietaryIdentification
	 * PartyIdentification66Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification67Choice#ProprietaryIdentification
	 * PartyIdentification67Choice.ProprietaryIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ContactDetails3#Other
	 * ContactDetails3.Other}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationType1Choice#Proprietary
	 * IdentificationType1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson15#OtherIdentification
	 * IndividualPerson15.OtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification4#OtherIdentification
	 * PersonIdentification4.OtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification5#ProprietaryIdentification
	 * FinancialInstitutionIdentification5.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification26Choice#ProprietaryIdentification
	 * PartyIdentification26Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification6Choice#ProprietaryIdentification
	 * FinancialInstitutionIdentification6Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification24#ProprietaryIdentification
	 * PartyIdentification24.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification72Choice#ProprietaryIdentification
	 * PartyIdentification72Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice#ProprietaryIdentification
	 * PartyIdentification71Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat1Choice#Proprietary
	 * SafekeepingPlaceFormat1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#ModifiedOtherIdentification
	 * IndividualPerson21.ModifiedOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson22#OtherIdentification
	 * IndividualPerson22.OtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification62#ProprietaryIdentification
	 * PartyIdentification62.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification64#ProprietaryIdentification
	 * PartyIdentification64.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment31#MerchantIdentification
	 * CardPaymentEnvironment31.MerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment29#MerchantIdentification
	 * CardPaymentEnvironment29.MerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#AcquirerIdentification
	 * AcquirerProtocolParameters6.AcquirerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment25#MerchantIdentification
	 * CardPaymentEnvironment25.MerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification7#Other
	 * PersonIdentification7.Other}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment30#MerchantIdentification
	 * CardPaymentEnvironment30.MerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment28#MerchantIdentification
	 * CardPaymentEnvironment28.MerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment21#MerchantIdentification
	 * CardPaymentEnvironment21.MerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#OtherIdentification
	 * IndividualPerson23.OtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#ModifiedOtherIdentification
	 * IndividualPerson24.ModifiedOtherIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OwnerType1#Proprietary
	 * OwnerType1.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner2#AdditionalIdentification
	 * BeneficialOwner2.AdditionalIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PledgeeFormat1Choice#Proprietary
	 * PledgeeFormat1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification83Choice#ProprietaryIdentification
	 * PartyIdentification83Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat7Choice#Proprietary
	 * SafekeepingPlaceFormat7Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification89Choice#ProprietaryIdentification
	 * PartyIdentification89Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification87Choice#ProprietaryIdentification
	 * PartyIdentification87Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification88Choice#ProprietaryIdentification
	 * PartyIdentification88Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PledgeeFormat2Choice#Proprietary
	 * PledgeeFormat2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment37#MerchantIdentification
	 * CardPaymentEnvironment37.MerchantIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Acquirer4#Identification
	 * Acquirer4.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment33#MerchantIdentification
	 * CardPaymentEnvironment33.MerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters7#AcquirerIdentification
	 * AcquirerProtocolParameters7.AcquirerIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Acquirer5#Identification
	 * Acquirer5.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment43#MerchantIdentification
	 * CardPaymentEnvironment43.MerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult4#AuthorisationEntity
	 * AuthorisationResult4.AuthorisationEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment41#MerchantIdentification
	 * CardPaymentEnvironment41.MerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment42#MerchantIdentification
	 * CardPaymentEnvironment42.MerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult5#AuthorisationEntity
	 * AuthorisationResult5.AuthorisationEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment44#MerchantIdentification
	 * CardPaymentEnvironment44.MerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult6#AuthorisationEntity
	 * AuthorisationResult6.AuthorisationEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment38#MerchantIdentification
	 * CardPaymentEnvironment38.MerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult8#AuthorisationEntity
	 * AuthorisationResult8.AuthorisationEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult7#AuthorisationEntity
	 * AuthorisationResult7.AuthorisationEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CounterpartyIdentification1Choice#Other
	 * CounterpartyIdentification1Choice.Other}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult9#AuthorisationEntity
	 * AuthorisationResult9.AuthorisationEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification90Choice#ProprietaryIdentification
	 * PartyIdentification90Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification92Choice#ProprietaryIdentification
	 * PartyIdentification92Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat8Choice#Proprietary
	 * SafekeepingPlaceFormat8Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification10#Other
	 * PersonIdentification10.Other}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PersonOrOrganisation1Choice#Internal
	 * PersonOrOrganisation1Choice.Internal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat10Choice#Proprietary
	 * SafekeepingPlaceFormat10Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification93Choice#ProprietaryIdentification
	 * PartyIdentification93Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PledgeeFormat3Choice#Proprietary
	 * PledgeeFormat3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification94Choice#ProprietaryIdentification
	 * PartyIdentification94Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification97Choice#ProprietaryIdentification
	 * PartyIdentification97Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IndividualPersonIdentification1Choice#IdentificationNumber
	 * IndividualPersonIdentification1Choice.IdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification7Choice#ProprietaryIdentification
	 * FinancialInstitutionIdentification7Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#OtherIdentification
	 * InvestmentAccountOwnershipInformation12.OtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#OtherIdentification
	 * InvestmentAccountOwnershipInformation13.OtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount33#AccountOwnerOtherIdentification
	 * CashAccount33.AccountOwnerOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IndividualPersonIdentification2Choice#IdentificationNumber
	 * IndividualPersonIdentification2Choice.IdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification96Choice#ProprietaryIdentification
	 * PartyIdentification96Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification100Choice#ProprietaryIdentification
	 * PartyIdentification100Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification101Choice#ProprietaryIdentification
	 * PartyIdentification101Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification104Choice#ProprietaryIdentification
	 * PartyIdentification104Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat11Choice#Proprietary
	 * SafekeepingPlaceFormat11Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification103Choice#ProprietaryIdentification
	 * PartyIdentification103Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification113Choice#ProprietaryIdentification
	 * PartyIdentification113Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat17Choice#Proprietary
	 * SafekeepingPlaceFormat17Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification115Choice#ProprietaryIdentification
	 * PartyIdentification115Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification114Choice#ProprietaryIdentification
	 * PartyIdentification114Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PledgeeFormat4Choice#Proprietary
	 * PledgeeFormat4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat26Choice#Proprietary
	 * SafekeepingPlaceFormat26Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification95Choice#ProprietaryIdentification
	 * PartyIdentification95Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CounterpartyIdentification2Choice#Other
	 * CounterpartyIdentification2Choice.Other}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment46#MerchantIdentification
	 * CardPaymentEnvironment46.MerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment50#MerchantIdentification
	 * CardPaymentEnvironment50.MerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult12#AuthorisationEntity
	 * AuthorisationResult12.AuthorisationEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult11#AuthorisationEntity
	 * AuthorisationResult11.AuthorisationEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult10#AuthorisationEntity
	 * AuthorisationResult10.AuthorisationEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment56#MerchantIdentification
	 * CardPaymentEnvironment56.MerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment55#MerchantIdentification
	 * CardPaymentEnvironment55.MerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#AcquirerIdentification
	 * AcquirerProtocolParameters9.AcquirerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification11#Other
	 * PersonIdentification11.Other}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation25#Identification
	 * Organisation25.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult13#AuthorisationEntity
	 * AuthorisationResult13.AuthorisationEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification12#Other
	 * PersonIdentification12.Other}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson32#OtherIdentification
	 * IndividualPerson32.OtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification8Choice#ProprietaryIdentification
	 * FinancialInstitutionIdentification8Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson31#OtherIdentification
	 * IndividualPerson31.OtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#OtherIdentification
	 * InvestmentAccountOwnershipInformation15.OtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#OtherIdentification
	 * InvestmentAccountOwnershipInformation14.OtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IndividualPersonIdentification3Choice#IdentificationNumber
	 * IndividualPersonIdentification3Choice.IdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat27Choice#Proprietary
	 * SafekeepingPlaceFormat27Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CounterpartyIdentification3Choice#SectorAndLocation
	 * CounterpartyIdentification3Choice.SectorAndLocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CounterpartyIdentification3Choice#NameAndLocation
	 * CounterpartyIdentification3Choice.NameAndLocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment64#MerchantIdentification
	 * CardPaymentEnvironment64.MerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment65#MerchantIdentification
	 * CardPaymentEnvironment65.MerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment67#MerchantIdentification
	 * CardPaymentEnvironment67.MerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment63#MerchantIdentification
	 * CardPaymentEnvironment63.MerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#AcquirerIdentification
	 * AcquirerProtocolParameters10.AcquirerIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier issued to a party for which no specific identifier has been defined."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd OtherIdentification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PartyIdentification1Choice.ProprietaryIdentification, com.tools20022.repository.choice.PartyIdentification2Choice.ProprietaryIdentification,
					com.tools20022.repository.choice.PartyIdentification4Choice.ProprietaryIdentification, com.tools20022.repository.msg.IndividualPerson5.OtherIdentification,
					com.tools20022.repository.msg.IndividualPerson10.OtherIdentification, com.tools20022.repository.choice.FinancialInstitutionIdentification3Choice.ProprietaryIdentification,
					com.tools20022.repository.msg.IndividualPerson20.OtherIdentification, com.tools20022.repository.msg.CashAccount26.AccountOwnerOtherIdentification,
					com.tools20022.repository.choice.IndividualPersonIdentificationChoice.IdentificationNumber, com.tools20022.repository.choice.PartyIdentification5Choice.ProprietaryIdentification,
					com.tools20022.repository.msg.IndividualPerson6.ModifiedOtherIdentification, com.tools20022.repository.msg.IndividualPerson11.ModifiedOtherIdentification,
					com.tools20022.repository.choice.MemberIdentification2Choice.Other, com.tools20022.repository.msg.OrganisationIdentification2.ProprietaryIdentification,
					com.tools20022.repository.msg.PersonIdentification3.OtherIdentification, com.tools20022.repository.msg.OrganisationIdentification4.Other, com.tools20022.repository.msg.PersonIdentification5.Other,
					com.tools20022.repository.msg.ContactDetails2.Other, com.tools20022.repository.msg.OrganisationIdentification8.Other, com.tools20022.repository.msg.FinancialInstitutionIdentification3.ProprietaryIdentification,
					com.tools20022.repository.choice.FinancialInstitutionIdentification5Choice.ProprietaryIdentification, com.tools20022.repository.choice.PartyIdentification13Choice.ProprietaryIdentification,
					com.tools20022.repository.choice.PartyIdentification36Choice.ProprietaryIdentification, com.tools20022.repository.msg.OrganisationIdentification7.Other,
					com.tools20022.repository.choice.PartyIdentification51Choice.ProprietaryIdentification, com.tools20022.repository.msg.OrganisationIdentification9.Other,
					com.tools20022.repository.choice.PartyIdentification10Choice.ProprietaryIdentification, com.tools20022.repository.choice.PartyIdentification14Choice.ProprietaryIdentification,
					com.tools20022.repository.choice.PartyIdentification45Choice.ProprietaryIdentification, com.tools20022.repository.choice.PartyIdentification37Choice.ProprietaryIdentification,
					com.tools20022.repository.choice.SafekeepingPlaceFormat3Choice.Proprietary, com.tools20022.repository.choice.PartyIdentification43Choice.ProprietaryIdentification,
					com.tools20022.repository.choice.PartyIdentification3Choice.ProprietaryIdentification, com.tools20022.repository.choice.PartyIdentification30Choice.ProprietaryIdentification,
					com.tools20022.repository.choice.PartyIdentification38Choice.ProprietaryIdentification, com.tools20022.repository.choice.PartyIdentification62Choice.ProprietaryIdentification,
					com.tools20022.repository.choice.PartyIdentification60Choice.ProprietaryIdentification, com.tools20022.repository.choice.PartyIdentification65Choice.ProprietaryIdentification,
					com.tools20022.repository.choice.SafekeepingPlaceFormat4Choice.Proprietary, com.tools20022.repository.choice.PartyIdentification61Choice.ProprietaryIdentification,
					com.tools20022.repository.choice.SafekeepingPlaceFormat2Choice.Proprietary, com.tools20022.repository.choice.PartyIdentification18Choice.ProprietaryIdentification,
					com.tools20022.repository.choice.SafekeepingPlaceFormat5Choice.Proprietary, com.tools20022.repository.choice.PartyIdentification16Choice.ProprietaryIdentification,
					com.tools20022.repository.choice.PartyIdentification46Choice.ProprietaryIdentification, com.tools20022.repository.choice.PartyIdentification56Choice.ProprietaryIdentification,
					com.tools20022.repository.choice.PartyIdentification48Choice.ProprietaryIdentification, com.tools20022.repository.choice.PartyIdentification52Choice.ProprietaryIdentification,
					com.tools20022.repository.choice.PartyIdentification41Choice.ProprietaryIdentification, com.tools20022.repository.choice.PartyIdentification50Choice.ProprietaryIdentification,
					com.tools20022.repository.choice.PartyIdentification31Choice.ProprietaryIdentification, com.tools20022.repository.choice.PartyIdentification40Choice.ProprietaryIdentification,
					com.tools20022.repository.choice.PartyIdentification42Choice.ProprietaryIdentification, com.tools20022.repository.choice.PartyIdentification54Choice.ProprietaryIdentification,
					com.tools20022.repository.choice.PartyIdentification55Choice.ProprietaryIdentification, com.tools20022.repository.choice.PartyIdentification47Choice.ProprietaryIdentification,
					com.tools20022.repository.choice.PartyIdentification57Choice.ProprietaryIdentification, com.tools20022.repository.choice.SafekeepingPlaceFormatChoice.IdentificationAsDSS,
					com.tools20022.repository.choice.PartyIdentification49Choice.ProprietaryIdentification, com.tools20022.repository.choice.PartyIdentification59Choice.ProprietaryIdentification,
					com.tools20022.repository.choice.PartyIdentification64Choice.ProprietaryIdentification, com.tools20022.repository.choice.PartyIdentification63Choice.ProprietaryIdentification,
					com.tools20022.repository.choice.PartyIdentification15Choice.ProprietaryIdentification, com.tools20022.repository.choice.PartyIdentification32Choice.ProprietaryIdentification,
					com.tools20022.repository.choice.PartyIdentification70Choice.ProprietaryIdentification, com.tools20022.repository.choice.PartyIdentification23Choice.ProprietaryIdentification,
					com.tools20022.repository.choice.PartyIdentification35Choice.ProprietaryIdentification, com.tools20022.repository.msg.PartyIdentification23.ProprietaryIdentification,
					com.tools20022.repository.msg.PartyIdentification6Choice.ProprietaryIdentification, com.tools20022.repository.msg.PartyIdentification54.ProprietaryIdentification,
					com.tools20022.repository.msg.OrganisationIdentification6.Other, com.tools20022.repository.msg.PartyIdentification22.AlternativeIdentifier, com.tools20022.repository.msg.PartyIdentification44.AlternativeIdentifier,
					com.tools20022.repository.msg.AcquirerProtocolParameters1.AcquirerIdentification, com.tools20022.repository.msg.AcquirerProtocolParameters3.AcquirerIdentification,
					com.tools20022.repository.msg.CardPaymentEnvironment8.MerchantIdentification, com.tools20022.repository.msg.CardPaymentEnvironment17.MerchantIdentification, com.tools20022.repository.msg.Acquirer1.Identification,
					com.tools20022.repository.msg.AuthorisationResult1.AuthorisationEntity, com.tools20022.repository.msg.Acquirer2.Identification, com.tools20022.repository.msg.Acquirer3.Identification,
					com.tools20022.repository.msg.Organisation8.Identification, com.tools20022.repository.msg.Organisation9.Identification, com.tools20022.repository.msg.AuthorisationResult2.AuthorisationEntity,
					com.tools20022.repository.msg.AuthorisationResult3.AuthorisationEntity, com.tools20022.repository.msg.CardPaymentEnvironment3.MerchantIdentification,
					com.tools20022.repository.msg.CardPaymentEnvironment11.MerchantIdentification, com.tools20022.repository.msg.CardPaymentEnvironment16.MerchantIdentification,
					com.tools20022.repository.msg.CardPaymentEnvironment7.MerchantIdentification, com.tools20022.repository.msg.CardPaymentEnvironment15.MerchantIdentification,
					com.tools20022.repository.msg.CardPaymentEnvironment19.MerchantIdentification, com.tools20022.repository.msg.IndividualPerson2.OtherIdentification, com.tools20022.repository.msg.IndividualPerson12.OtherIdentification,
					com.tools20022.repository.msg.IndividualPerson9.OtherIdentification, com.tools20022.repository.msg.NonFinancialInstitutionIdentification1.ProprietaryIdentification,
					com.tools20022.repository.msg.PersonIdentification2.OtherIdentification, com.tools20022.repository.msg.FinancialInstitutionIdentification1.ProprietaryIdentification,
					com.tools20022.repository.choice.PartyIdentification9Choice.ProprietaryIdentification, com.tools20022.repository.choice.PersonIdentificationType1Choice.OtherIdentification,
					com.tools20022.repository.msg.BeneficialOwner1.AdditionalIdentification, com.tools20022.repository.choice.PartyIdentification11Choice.ProprietaryIdentification,
					com.tools20022.repository.msg.PartyIdentification25.ProprietaryIdentification, com.tools20022.repository.msg.FinancialInstitutionIdentification6.ProprietaryIdentification,
					com.tools20022.repository.msg.PartyIdentification26.ProprietaryIdentification, com.tools20022.repository.msg.PartyIdentification27.ProprietaryIdentification,
					com.tools20022.repository.msg.PartyIdentification28.ProprietaryIdentification, com.tools20022.repository.choice.PartyIdentification33Choice.ProprietaryIdentification,
					com.tools20022.repository.choice.PartyIdentification66Choice.ProprietaryIdentification, com.tools20022.repository.choice.PartyIdentification67Choice.ProprietaryIdentification,
					com.tools20022.repository.msg.ContactDetails3.Other, com.tools20022.repository.choice.IdentificationType1Choice.Proprietary, com.tools20022.repository.msg.IndividualPerson15.OtherIdentification,
					com.tools20022.repository.msg.PersonIdentification4.OtherIdentification, com.tools20022.repository.msg.FinancialInstitutionIdentification5.ProprietaryIdentification,
					com.tools20022.repository.choice.PartyIdentification26Choice.ProprietaryIdentification, com.tools20022.repository.choice.FinancialInstitutionIdentification6Choice.ProprietaryIdentification,
					com.tools20022.repository.msg.PartyIdentification24.ProprietaryIdentification, com.tools20022.repository.choice.PartyIdentification72Choice.ProprietaryIdentification,
					com.tools20022.repository.choice.PartyIdentification71Choice.ProprietaryIdentification, com.tools20022.repository.choice.SafekeepingPlaceFormat1Choice.Proprietary,
					com.tools20022.repository.msg.IndividualPerson21.ModifiedOtherIdentification, com.tools20022.repository.msg.IndividualPerson22.OtherIdentification,
					com.tools20022.repository.msg.PartyIdentification62.ProprietaryIdentification, com.tools20022.repository.msg.PartyIdentification64.ProprietaryIdentification,
					com.tools20022.repository.msg.CardPaymentEnvironment31.MerchantIdentification, com.tools20022.repository.msg.CardPaymentEnvironment29.MerchantIdentification,
					com.tools20022.repository.msg.AcquirerProtocolParameters6.AcquirerIdentification, com.tools20022.repository.msg.CardPaymentEnvironment25.MerchantIdentification, com.tools20022.repository.msg.PersonIdentification7.Other,
					com.tools20022.repository.msg.CardPaymentEnvironment30.MerchantIdentification, com.tools20022.repository.msg.CardPaymentEnvironment28.MerchantIdentification,
					com.tools20022.repository.msg.CardPaymentEnvironment21.MerchantIdentification, com.tools20022.repository.msg.IndividualPerson23.OtherIdentification,
					com.tools20022.repository.msg.IndividualPerson24.ModifiedOtherIdentification, com.tools20022.repository.msg.OwnerType1.Proprietary, com.tools20022.repository.msg.BeneficialOwner2.AdditionalIdentification,
					com.tools20022.repository.choice.PledgeeFormat1Choice.Proprietary, com.tools20022.repository.choice.PartyIdentification83Choice.ProprietaryIdentification,
					com.tools20022.repository.choice.SafekeepingPlaceFormat7Choice.Proprietary, com.tools20022.repository.choice.PartyIdentification89Choice.ProprietaryIdentification,
					com.tools20022.repository.choice.PartyIdentification87Choice.ProprietaryIdentification, com.tools20022.repository.choice.PartyIdentification88Choice.ProprietaryIdentification,
					com.tools20022.repository.choice.PledgeeFormat2Choice.Proprietary, com.tools20022.repository.msg.CardPaymentEnvironment37.MerchantIdentification, com.tools20022.repository.msg.Acquirer4.Identification,
					com.tools20022.repository.msg.CardPaymentEnvironment33.MerchantIdentification, com.tools20022.repository.msg.AcquirerProtocolParameters7.AcquirerIdentification, com.tools20022.repository.msg.Acquirer5.Identification,
					com.tools20022.repository.msg.CardPaymentEnvironment43.MerchantIdentification, com.tools20022.repository.msg.AuthorisationResult4.AuthorisationEntity,
					com.tools20022.repository.msg.CardPaymentEnvironment41.MerchantIdentification, com.tools20022.repository.msg.CardPaymentEnvironment42.MerchantIdentification,
					com.tools20022.repository.msg.AuthorisationResult5.AuthorisationEntity, com.tools20022.repository.msg.CardPaymentEnvironment44.MerchantIdentification,
					com.tools20022.repository.msg.AuthorisationResult6.AuthorisationEntity, com.tools20022.repository.msg.CardPaymentEnvironment38.MerchantIdentification,
					com.tools20022.repository.msg.AuthorisationResult8.AuthorisationEntity, com.tools20022.repository.msg.AuthorisationResult7.AuthorisationEntity, com.tools20022.repository.choice.CounterpartyIdentification1Choice.Other,
					com.tools20022.repository.msg.AuthorisationResult9.AuthorisationEntity, com.tools20022.repository.choice.PartyIdentification90Choice.ProprietaryIdentification,
					com.tools20022.repository.choice.PartyIdentification92Choice.ProprietaryIdentification, com.tools20022.repository.choice.SafekeepingPlaceFormat8Choice.Proprietary,
					com.tools20022.repository.msg.PersonIdentification10.Other, com.tools20022.repository.choice.PersonOrOrganisation1Choice.Internal, com.tools20022.repository.choice.SafekeepingPlaceFormat10Choice.Proprietary,
					com.tools20022.repository.choice.PartyIdentification93Choice.ProprietaryIdentification, com.tools20022.repository.choice.PledgeeFormat3Choice.Proprietary,
					com.tools20022.repository.choice.PartyIdentification94Choice.ProprietaryIdentification, com.tools20022.repository.choice.PartyIdentification97Choice.ProprietaryIdentification,
					com.tools20022.repository.choice.IndividualPersonIdentification1Choice.IdentificationNumber, com.tools20022.repository.choice.FinancialInstitutionIdentification7Choice.ProprietaryIdentification,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.OtherIdentification, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13.OtherIdentification,
					com.tools20022.repository.msg.CashAccount33.AccountOwnerOtherIdentification, com.tools20022.repository.choice.IndividualPersonIdentification2Choice.IdentificationNumber,
					com.tools20022.repository.choice.PartyIdentification96Choice.ProprietaryIdentification, com.tools20022.repository.choice.PartyIdentification100Choice.ProprietaryIdentification,
					com.tools20022.repository.choice.PartyIdentification101Choice.ProprietaryIdentification, com.tools20022.repository.choice.PartyIdentification104Choice.ProprietaryIdentification,
					com.tools20022.repository.choice.SafekeepingPlaceFormat11Choice.Proprietary, com.tools20022.repository.choice.PartyIdentification103Choice.ProprietaryIdentification,
					com.tools20022.repository.choice.PartyIdentification113Choice.ProprietaryIdentification, com.tools20022.repository.choice.SafekeepingPlaceFormat17Choice.Proprietary,
					com.tools20022.repository.choice.PartyIdentification115Choice.ProprietaryIdentification, com.tools20022.repository.choice.PartyIdentification114Choice.ProprietaryIdentification,
					com.tools20022.repository.choice.PledgeeFormat4Choice.Proprietary, com.tools20022.repository.choice.SafekeepingPlaceFormat26Choice.Proprietary,
					com.tools20022.repository.choice.PartyIdentification95Choice.ProprietaryIdentification, com.tools20022.repository.choice.CounterpartyIdentification2Choice.Other,
					com.tools20022.repository.msg.CardPaymentEnvironment46.MerchantIdentification, com.tools20022.repository.msg.CardPaymentEnvironment50.MerchantIdentification,
					com.tools20022.repository.msg.AuthorisationResult12.AuthorisationEntity, com.tools20022.repository.msg.AuthorisationResult11.AuthorisationEntity, com.tools20022.repository.msg.AuthorisationResult10.AuthorisationEntity,
					com.tools20022.repository.msg.CardPaymentEnvironment56.MerchantIdentification, com.tools20022.repository.msg.CardPaymentEnvironment55.MerchantIdentification,
					com.tools20022.repository.msg.AcquirerProtocolParameters9.AcquirerIdentification, com.tools20022.repository.msg.PersonIdentification11.Other, com.tools20022.repository.msg.Organisation25.Identification,
					com.tools20022.repository.msg.AuthorisationResult13.AuthorisationEntity, com.tools20022.repository.msg.PersonIdentification12.Other, com.tools20022.repository.msg.IndividualPerson32.OtherIdentification,
					com.tools20022.repository.choice.FinancialInstitutionIdentification8Choice.ProprietaryIdentification, com.tools20022.repository.msg.IndividualPerson31.OtherIdentification,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.OtherIdentification, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.OtherIdentification,
					com.tools20022.repository.choice.IndividualPersonIdentification3Choice.IdentificationNumber, com.tools20022.repository.choice.SafekeepingPlaceFormat27Choice.Proprietary,
					com.tools20022.repository.choice.CounterpartyIdentification3Choice.SectorAndLocation, com.tools20022.repository.choice.CounterpartyIdentification3Choice.NameAndLocation,
					com.tools20022.repository.msg.CardPaymentEnvironment64.MerchantIdentification, com.tools20022.repository.msg.CardPaymentEnvironment65.MerchantIdentification,
					com.tools20022.repository.msg.CardPaymentEnvironment67.MerchantIdentification, com.tools20022.repository.msg.CardPaymentEnvironment63.MerchantIdentification,
					com.tools20022.repository.msg.AcquirerProtocolParameters10.AcquirerIdentification);
			elementContext_lazy = () -> PartyIdentificationInformation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OtherIdentification";
			definition = "Identifier issued to a party for which no specific identifier has been defined.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> GenericIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.RelatedPartyIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Party for which an identification is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Party#Identification
	 * Party.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Party Party}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QualifiedPartyIdentification1#Party
	 * QualifiedPartyIdentification1.Party}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentifiedParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party for which an identification is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IdentifiedParty = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.QualifiedPartyIdentification1.Party);
			elementContext_lazy = () -> PartyIdentificationInformation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IdentifiedParty";
			definition = "Party for which an identification is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Party.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Number assigned by a tax authority to an entity.
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
	 * {@linkplain com.tools20022.repository.msg.Organisation2#TaxIdentificationNumber
	 * Organisation2.TaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate3#DebtorTaxIdentificationNumber
	 * DirectDebitMandate3.DebtorTaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate4#DebtorTaxIdentificationNumber
	 * DirectDebitMandate4.DebtorTaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation13#TaxIdentificationNumber
	 * Organisation13.TaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation4#TaxIdentificationNumber
	 * Organisation4.TaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification5Choice#TaxIdentificationNumber
	 * PartyIdentification5Choice.TaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation3#TaxIdentificationNumber
	 * Organisation3.TaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification2#TaxIdentificationNumber
	 * OrganisationIdentification2.TaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification3#TaxIdentificationNumber
	 * PersonIdentification3.TaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxInformation2#CreditorTaxIdentification
	 * TaxInformation2.CreditorTaxIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxInformation2#DebtorTaxIdentification
	 * TaxInformation2.DebtorTaxIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxParty1#TaxIdentification
	 * TaxParty1.TaxIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxParty1#RegistrationIdentification
	 * TaxParty1.RegistrationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxParty2#TaxIdentification
	 * TaxParty2.TaxIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxParty2#RegistrationIdentification
	 * TaxParty2.RegistrationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NonFinancialInstitutionIdentification1#TaxIdentificationNumber
	 * NonFinancialInstitutionIdentification1.TaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification2#TaxIdentificationNumber
	 * PersonIdentification2.TaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PersonIdentificationType1Choice#TaxIdentificationNumber
	 * PersonIdentificationType1Choice.TaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxParty3#TaxIdentification
	 * TaxParty3.TaxIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxParty3#RegistrationIdentification
	 * TaxParty3.RegistrationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingTaxRegion1#CustomerTaxIdentification
	 * BillingTaxRegion1.CustomerTaxIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification24#TaxIdentification
	 * PartyIdentification24.TaxIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation15#TaxIdentificationNumber
	 * Organisation15.TaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification7#TaxIdentificationNumber
	 * PersonIdentification7.TaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation16#TaxIdentification
	 * Organisation16.TaxIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation17#TaxIdentification
	 * Organisation17.TaxIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation21#TaxIdentificationNumber
	 * Organisation21.TaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate5#DebtorTaxIdentificationNumber
	 * DirectDebitMandate5.DebtorTaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification96Choice#TaxIdentificationNumber
	 * PartyIdentification96Choice.TaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification11#TaxIdentificationNumber
	 * PersonIdentification11.TaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate6#DebtorTaxIdentificationNumber
	 * DirectDebitMandate6.DebtorTaxIdentificationNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxIdentificationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number assigned by a tax authority to an entity."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TaxIdentificationNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Organisation2.TaxIdentificationNumber, com.tools20022.repository.msg.DirectDebitMandate3.DebtorTaxIdentificationNumber,
					com.tools20022.repository.msg.DirectDebitMandate4.DebtorTaxIdentificationNumber, com.tools20022.repository.msg.Organisation13.TaxIdentificationNumber, com.tools20022.repository.msg.Organisation4.TaxIdentificationNumber,
					com.tools20022.repository.choice.PartyIdentification5Choice.TaxIdentificationNumber, com.tools20022.repository.msg.Organisation3.TaxIdentificationNumber,
					com.tools20022.repository.msg.OrganisationIdentification2.TaxIdentificationNumber, com.tools20022.repository.msg.PersonIdentification3.TaxIdentificationNumber,
					com.tools20022.repository.msg.TaxInformation2.CreditorTaxIdentification, com.tools20022.repository.msg.TaxInformation2.DebtorTaxIdentification, com.tools20022.repository.msg.TaxParty1.TaxIdentification,
					com.tools20022.repository.msg.TaxParty1.RegistrationIdentification, com.tools20022.repository.msg.TaxParty2.TaxIdentification, com.tools20022.repository.msg.TaxParty2.RegistrationIdentification,
					com.tools20022.repository.msg.NonFinancialInstitutionIdentification1.TaxIdentificationNumber, com.tools20022.repository.msg.PersonIdentification2.TaxIdentificationNumber,
					com.tools20022.repository.choice.PersonIdentificationType1Choice.TaxIdentificationNumber, com.tools20022.repository.msg.TaxParty3.TaxIdentification, com.tools20022.repository.msg.TaxParty3.RegistrationIdentification,
					com.tools20022.repository.msg.BillingTaxRegion1.CustomerTaxIdentification, com.tools20022.repository.msg.PartyIdentification24.TaxIdentification, com.tools20022.repository.msg.Organisation15.TaxIdentificationNumber,
					com.tools20022.repository.msg.PersonIdentification7.TaxIdentificationNumber, com.tools20022.repository.msg.Organisation16.TaxIdentification, com.tools20022.repository.msg.Organisation17.TaxIdentification,
					com.tools20022.repository.msg.Organisation21.TaxIdentificationNumber, com.tools20022.repository.msg.DirectDebitMandate5.DebtorTaxIdentificationNumber,
					com.tools20022.repository.choice.PartyIdentification96Choice.TaxIdentificationNumber, com.tools20022.repository.msg.PersonIdentification11.TaxIdentificationNumber,
					com.tools20022.repository.msg.DirectDebitMandate6.DebtorTaxIdentificationNumber);
			elementContext_lazy = () -> PartyIdentificationInformation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxIdentificationNumber";
			definition = "Number assigned by a tax authority to an entity.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Number assigned by a national registration authority to an entity. In
	 * Singapore this is known as the NRIC.
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
	 * {@linkplain com.tools20022.repository.msg.Organisation2#NationalRegistrationNumber
	 * Organisation2.NationalRegistrationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate3#DebtorNationalRegistrationNumber
	 * DirectDebitMandate3.DebtorNationalRegistrationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate4#DebtorNationalRegistrationNumber
	 * DirectDebitMandate4.DebtorNationalRegistrationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation13#NationalRegistrationNumber
	 * Organisation13.NationalRegistrationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation4#NationalRegistrationNumber
	 * Organisation4.NationalRegistrationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification5Choice#NationalRegistrationNumber
	 * PartyIdentification5Choice.NationalRegistrationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation3#NationalRegistrationNumber
	 * Organisation3.NationalRegistrationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation15#NationalRegistrationNumber
	 * Organisation15.NationalRegistrationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation16#NationalRegistrationNumber
	 * Organisation16.NationalRegistrationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation17#NationalRegistrationNumber
	 * Organisation17.NationalRegistrationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation21#NationalRegistrationNumber
	 * Organisation21.NationalRegistrationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate5#DebtorNationalRegistrationNumber
	 * DirectDebitMandate5.DebtorNationalRegistrationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification96Choice#NationalRegistrationNumber
	 * PartyIdentification96Choice.NationalRegistrationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate6#DebtorNationalRegistrationNumber
	 * DirectDebitMandate6.DebtorNationalRegistrationNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NationalRegistrationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number assigned by a national registration authority to an entity. In Singapore this is known as the NRIC."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NationalRegistrationNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Organisation2.NationalRegistrationNumber, com.tools20022.repository.msg.DirectDebitMandate3.DebtorNationalRegistrationNumber,
					com.tools20022.repository.msg.DirectDebitMandate4.DebtorNationalRegistrationNumber, com.tools20022.repository.msg.Organisation13.NationalRegistrationNumber,
					com.tools20022.repository.msg.Organisation4.NationalRegistrationNumber, com.tools20022.repository.choice.PartyIdentification5Choice.NationalRegistrationNumber,
					com.tools20022.repository.msg.Organisation3.NationalRegistrationNumber, com.tools20022.repository.msg.Organisation15.NationalRegistrationNumber, com.tools20022.repository.msg.Organisation16.NationalRegistrationNumber,
					com.tools20022.repository.msg.Organisation17.NationalRegistrationNumber, com.tools20022.repository.msg.Organisation21.NationalRegistrationNumber,
					com.tools20022.repository.msg.DirectDebitMandate5.DebtorNationalRegistrationNumber, com.tools20022.repository.choice.PartyIdentification96Choice.NationalRegistrationNumber,
					com.tools20022.repository.msg.DirectDebitMandate6.DebtorNationalRegistrationNumber);
			elementContext_lazy = () -> PartyIdentificationInformation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NationalRegistrationNumber";
			definition = "Number assigned by a national registration authority to an entity. In Singapore this is known as the NRIC.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the type of alternate identification which can be used to
	 * identify a party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfIdentificationCode
	 * TypeOfIdentificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationType2Choice#Code
	 * IdentificationType2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationType2Choice#Proprietary
	 * IdentificationType2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationType4Choice#Code
	 * IdentificationType4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationType4Choice#Proprietary
	 * IdentificationType4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationType5Choice#Code
	 * IdentificationType5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationType5Choice#Proprietary
	 * IdentificationType5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationType40Choice#Code
	 * IdentificationType40Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationType40Choice#Proprietary
	 * IdentificationType40Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationType41Choice#Code
	 * IdentificationType41Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationType41Choice#Proprietary
	 * IdentificationType41Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationType6Choice#Code
	 * IdentificationType6Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationType6Choice#Proprietary
	 * IdentificationType6Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationType42Choice#Code
	 * IdentificationType42Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationType42Choice#Proprietary
	 * IdentificationType42Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationType43Choice#Code
	 * IdentificationType43Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationType43Choice#Proprietary
	 * IdentificationType43Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationType44Choice#Code
	 * IdentificationType44Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationType44Choice#Proprietary
	 * IdentificationType44Choice.Proprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of alternate identification which can be used to identify a party."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TypeOfIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.IdentificationType2Choice.Code, com.tools20022.repository.choice.IdentificationType2Choice.Proprietary,
					com.tools20022.repository.choice.IdentificationType4Choice.Code, com.tools20022.repository.choice.IdentificationType4Choice.Proprietary, com.tools20022.repository.choice.IdentificationType5Choice.Code,
					com.tools20022.repository.choice.IdentificationType5Choice.Proprietary, com.tools20022.repository.choice.IdentificationType40Choice.Code, com.tools20022.repository.choice.IdentificationType40Choice.Proprietary,
					com.tools20022.repository.choice.IdentificationType41Choice.Code, com.tools20022.repository.choice.IdentificationType41Choice.Proprietary, com.tools20022.repository.choice.IdentificationType6Choice.Code,
					com.tools20022.repository.choice.IdentificationType6Choice.Proprietary, com.tools20022.repository.choice.IdentificationType42Choice.Code, com.tools20022.repository.choice.IdentificationType42Choice.Proprietary,
					com.tools20022.repository.choice.IdentificationType43Choice.Code, com.tools20022.repository.choice.IdentificationType43Choice.Proprietary, com.tools20022.repository.choice.IdentificationType44Choice.Code,
					com.tools20022.repository.choice.IdentificationType44Choice.Proprietary);
			elementContext_lazy = () -> PartyIdentificationInformation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TypeOfIdentification";
			definition = "Specifies the type of alternate identification which can be used to identify a party.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TypeOfIdentificationCode.mmObject();
		}
	};
	/**
	 * Provides declaration details relative to the party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyTextInformation1#DeclarationDetails
	 * PartyTextInformation1.DeclarationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyTextInformation2#DeclarationDetails
	 * PartyTextInformation2.DeclarationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyTextInformation3#DeclarationDetails
	 * PartyTextInformation3.DeclarationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyTextInformation4#DeclarationDetails
	 * PartyTextInformation4.DeclarationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification33#DeclarationDetails
	 * PartyIdentification33.DeclarationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification34#DeclarationDetails
	 * PartyIdentification34.DeclarationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification50#DeclarationDetails
	 * PartyIdentification50.DeclarationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification51#DeclarationDetails
	 * PartyIdentification51.DeclarationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification56#DeclarationDetails
	 * PartyIdentification56.DeclarationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification57#DeclarationDetails
	 * PartyIdentification57.DeclarationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyTextInformation5#DeclarationDetails
	 * PartyTextInformation5.DeclarationDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Declaration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides declaration details relative to the party."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Declaration = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartyTextInformation1.DeclarationDetails, com.tools20022.repository.msg.PartyTextInformation2.DeclarationDetails,
					com.tools20022.repository.msg.PartyTextInformation3.DeclarationDetails, com.tools20022.repository.msg.PartyTextInformation4.DeclarationDetails, com.tools20022.repository.msg.PartyIdentification33.DeclarationDetails,
					com.tools20022.repository.msg.PartyIdentification34.DeclarationDetails, com.tools20022.repository.msg.PartyIdentification50.DeclarationDetails, com.tools20022.repository.msg.PartyIdentification51.DeclarationDetails,
					com.tools20022.repository.msg.PartyIdentification56.DeclarationDetails, com.tools20022.repository.msg.PartyIdentification57.DeclarationDetails, com.tools20022.repository.msg.PartyTextInformation5.DeclarationDetails);
			elementContext_lazy = () -> PartyIdentificationInformation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Declaration";
			definition = "Provides declaration details relative to the party.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Specifies the type of party in different business contexts.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.choice.PartyRole1Choice#Code
	 * PartyRole1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyRole1Choice#Proprietary
	 * PartyRole1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.PartyType1Choice#Code
	 * PartyType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyType1Choice#Proprietary
	 * PartyType1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlaceOfPresentation1#Place
	 * PlaceOfPresentation1.Place}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.PartyRole2Choice#Code
	 * PartyRole2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyRole2Choice#Proprietary
	 * PartyRole2Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.PartyRole4Choice#Code
	 * PartyRole4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyRole4Choice#Proprietary
	 * PartyRole4Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.PartyRole5Choice#Code
	 * PartyRole5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyRole5Choice#Proprietary
	 * PartyRole5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification92#Type
	 * MarketIdentification92.Type}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of party in different business contexts."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PartyType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PartyRole1Choice.Code, com.tools20022.repository.choice.PartyRole1Choice.Proprietary, com.tools20022.repository.choice.PartyType1Choice.Code,
					com.tools20022.repository.choice.PartyType1Choice.Proprietary, com.tools20022.repository.msg.PlaceOfPresentation1.Place, com.tools20022.repository.choice.PartyRole2Choice.Code,
					com.tools20022.repository.choice.PartyRole2Choice.Proprietary, com.tools20022.repository.choice.PartyRole4Choice.Code, com.tools20022.repository.choice.PartyRole4Choice.Proprietary,
					com.tools20022.repository.choice.PartyRole5Choice.Code, com.tools20022.repository.choice.PartyRole5Choice.Proprietary, com.tools20022.repository.msg.MarketIdentification92.Type);
			elementContext_lazy = () -> PartyIdentificationInformation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyType";
			definition = "Specifies the type of party in different business contexts.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PartyTypeCode.mmObject();
		}
	};
	/**
	 * Name by which a party is known and which is usually used to identify that
	 * party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PartyName#PartyIdentification
	 * PartyName.PartyIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PartyName PartyName}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxOrganisationIdentification1#Name
	 * TaxOrganisationIdentification1.Name}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name by which a party is known and which is usually used to identify that party."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PartyName = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxOrganisationIdentification1.Name);
			elementContext_lazy = () -> PartyIdentificationInformation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyName";
			definition = "Name by which a party is known and which is usually used to identify that party.";
			minOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.PartyName.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PartyName.PartyIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the period during which an identification is valid
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedIdentification
	 * DateTimePeriod.RelatedIdentification}</li>
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
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the period during which an identification is valid"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ValidityPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PartyIdentificationInformation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValidityPeriod";
			definition = "Specifies the period during which an identification is valid";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.RelatedIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Market for which an identification is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Market#Identification
	 * Market.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Market Market}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentifiedMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market for which an identification is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IdentifiedMarket = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PartyIdentificationInformation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentifiedMarket";
			definition = "Market for which an identification is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Market.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Market.Identification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Legal Entity Identifier is a code allocated to a party as described in
	 * ISO 17442 "Financial Services - Legal Entity Identifier (LEI)".
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.LEIIdentifier
	 * LEIIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fund2#LegalEntityIdentifier
	 * Fund2.LegalEntityIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fund1#LegalEntityIdentifier
	 * Fund1.LegalEntityIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fund3#LegalEntityIdentifier
	 * Fund3.LegalEntityIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fund4#LegalEntityIdentifier
	 * Fund4.LegalEntityIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CounterpartyIdentification1Choice#LEI
	 * CounterpartyIdentification1Choice.LEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount106#LEI
	 * PartyIdentificationAndAccount106.LEI}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification75#LEI
	 * PartyIdentification75.LEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount112#LEI
	 * PartyIdentificationAndAccount112.LEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount111#LEI
	 * PartyIdentificationAndAccount111.LEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount117#LEI
	 * PartyIdentificationAndAccount117.LEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount108#LEI
	 * PartyIdentificationAndAccount108.LEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount107#LEI
	 * PartyIdentificationAndAccount107.LEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount109#LEI
	 * PartyIdentificationAndAccount109.LEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PersonOrOrganisation1Choice#LEI
	 * PersonOrOrganisation1Choice.LEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PersonOrOrganisation2Choice#LEI
	 * PersonOrOrganisation2Choice.LEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionTransmission2#TransmittingBuyer
	 * SecuritiesTransactionTransmission2.TransmittingBuyer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionTransmission2#TransmittingSeller
	 * SecuritiesTransactionTransmission2.TransmittingSeller}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification91#LEI
	 * PartyIdentification91.LEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DerivativePartyIdentification1Choice#LEI
	 * DerivativePartyIdentification1Choice.LEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary36#LegalEntityIdentifier
	 * Intermediary36.LegalEntityIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification97Choice#LegalEntityIdentifier
	 * PartyIdentification97Choice.LegalEntityIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ThirdPartyRights1#LegalEntityIdentifier
	 * ThirdPartyRights1.LegalEntityIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation22#LegalEntityIdentifier
	 * Organisation22.LegalEntityIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation24#LegalEntityIdentifier
	 * Organisation24.LegalEntityIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary33#LegalEntityIdentifier
	 * Intermediary33.LegalEntityIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification95#LegalEntityIdentifier
	 * PartyIdentification95.LegalEntityIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification96#LegalEntityIdentifier
	 * PartyIdentification96.LegalEntityIdentifier}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification108#LEI
	 * PartyIdentification108.LEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount133#LEI
	 * PartyIdentificationAndAccount133.LEI}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification103#LEI
	 * PartyIdentification103.LEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount131#LEI
	 * PartyIdentificationAndAccount131.LEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount146#LEI
	 * PartyIdentificationAndAccount146.LEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount135#LEI
	 * PartyIdentificationAndAccount135.LEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount137#LEI
	 * PartyIdentificationAndAccount137.LEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount136#LEI
	 * PartyIdentificationAndAccount136.LEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount134#LEI
	 * PartyIdentificationAndAccount134.LEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CounterpartyIdentification2Choice#LEI
	 * CounterpartyIdentification2Choice.LEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#BranchIdentification
	 * UnsecuredMarketTransaction2.BranchIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction2#BranchIdentification
	 * ForeignExchangeSwapTransaction2.BranchIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2#BranchIdentification
	 * SecuredMarketTransaction2.BranchIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MoneyMarketTransactionStatus2#BranchIdentification
	 * MoneyMarketTransactionStatus2.BranchIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3#BranchIdentification
	 * UnsecuredMarketTransaction3.BranchIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction3#BranchIdentification
	 * OvernightIndexSwapTransaction3.BranchIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#BranchIdentification
	 * SecuredMarketTransaction3.BranchIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument53#LEI
	 * FinancialInstrument53.LEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification10#LEI
	 * FinancialInstitutionIdentification10.LEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation30#LegalEntityIdentifier
	 * Organisation30.LegalEntityIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation29#LegalEntityIdentifier
	 * Organisation29.LegalEntityIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesReferenceDataReport5#Issuer
	 * SecuritiesReferenceDataReport5.Issuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrument48Choice#LEI
	 * FinancialInstrument48Choice.LEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#BranchIdentification
	 * SecuredMarketTransaction4.BranchIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CounterpartyIdentification3Choice#LEI
	 * CounterpartyIdentification3Choice.LEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction3#BranchIdentification
	 * ForeignExchangeSwapTransaction3.BranchIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#BranchIdentification
	 * OvernightIndexSwapTransaction4.BranchIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#BranchIdentification
	 * UnsecuredMarketTransaction4.BranchIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LEI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Legal Entity Identifier is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\"."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute LEI = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Fund2.LegalEntityIdentifier, com.tools20022.repository.msg.Fund1.LegalEntityIdentifier, com.tools20022.repository.msg.Fund3.LegalEntityIdentifier,
					com.tools20022.repository.msg.Fund4.LegalEntityIdentifier, com.tools20022.repository.choice.CounterpartyIdentification1Choice.LEI, com.tools20022.repository.msg.PartyIdentificationAndAccount106.LEI,
					com.tools20022.repository.msg.PartyIdentification75.LEI, com.tools20022.repository.msg.PartyIdentificationAndAccount112.LEI, com.tools20022.repository.msg.PartyIdentificationAndAccount111.LEI,
					com.tools20022.repository.msg.PartyIdentificationAndAccount117.LEI, com.tools20022.repository.msg.PartyIdentificationAndAccount108.LEI, com.tools20022.repository.msg.PartyIdentificationAndAccount107.LEI,
					com.tools20022.repository.msg.PartyIdentificationAndAccount109.LEI, com.tools20022.repository.choice.PersonOrOrganisation1Choice.LEI, com.tools20022.repository.choice.PersonOrOrganisation2Choice.LEI,
					com.tools20022.repository.msg.SecuritiesTransactionTransmission2.TransmittingBuyer, com.tools20022.repository.msg.SecuritiesTransactionTransmission2.TransmittingSeller,
					com.tools20022.repository.msg.PartyIdentification91.LEI, com.tools20022.repository.choice.DerivativePartyIdentification1Choice.LEI, com.tools20022.repository.msg.Intermediary36.LegalEntityIdentifier,
					com.tools20022.repository.choice.PartyIdentification97Choice.LegalEntityIdentifier, com.tools20022.repository.msg.ThirdPartyRights1.LegalEntityIdentifier,
					com.tools20022.repository.msg.Organisation22.LegalEntityIdentifier, com.tools20022.repository.msg.Organisation24.LegalEntityIdentifier, com.tools20022.repository.msg.Intermediary33.LegalEntityIdentifier,
					com.tools20022.repository.msg.PartyIdentification95.LegalEntityIdentifier, com.tools20022.repository.msg.PartyIdentification96.LegalEntityIdentifier, com.tools20022.repository.msg.PartyIdentification108.LEI,
					com.tools20022.repository.msg.PartyIdentificationAndAccount133.LEI, com.tools20022.repository.msg.PartyIdentification103.LEI, com.tools20022.repository.msg.PartyIdentificationAndAccount131.LEI,
					com.tools20022.repository.msg.PartyIdentificationAndAccount146.LEI, com.tools20022.repository.msg.PartyIdentificationAndAccount135.LEI, com.tools20022.repository.msg.PartyIdentificationAndAccount137.LEI,
					com.tools20022.repository.msg.PartyIdentificationAndAccount136.LEI, com.tools20022.repository.msg.PartyIdentificationAndAccount134.LEI, com.tools20022.repository.choice.CounterpartyIdentification2Choice.LEI,
					com.tools20022.repository.msg.UnsecuredMarketTransaction2.BranchIdentification, com.tools20022.repository.msg.ForeignExchangeSwapTransaction2.BranchIdentification,
					com.tools20022.repository.msg.SecuredMarketTransaction2.BranchIdentification, com.tools20022.repository.msg.MoneyMarketTransactionStatus2.BranchIdentification,
					com.tools20022.repository.msg.UnsecuredMarketTransaction3.BranchIdentification, com.tools20022.repository.msg.OvernightIndexSwapTransaction3.BranchIdentification,
					com.tools20022.repository.msg.SecuredMarketTransaction3.BranchIdentification, com.tools20022.repository.msg.FinancialInstrument53.LEI, com.tools20022.repository.msg.FinancialInstitutionIdentification10.LEI,
					com.tools20022.repository.msg.Organisation30.LegalEntityIdentifier, com.tools20022.repository.msg.Organisation29.LegalEntityIdentifier, com.tools20022.repository.msg.SecuritiesReferenceDataReport5.Issuer,
					com.tools20022.repository.choice.FinancialInstrument48Choice.LEI, com.tools20022.repository.msg.SecuredMarketTransaction4.BranchIdentification, com.tools20022.repository.choice.CounterpartyIdentification3Choice.LEI,
					com.tools20022.repository.msg.ForeignExchangeSwapTransaction3.BranchIdentification, com.tools20022.repository.msg.OvernightIndexSwapTransaction4.BranchIdentification,
					com.tools20022.repository.msg.UnsecuredMarketTransaction4.BranchIdentification);
			elementContext_lazy = () -> PartyIdentificationInformation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LEI";
			definition = "Legal Entity Identifier is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\".";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> LEIIdentifier.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PartyIdentificationInformation";
				definition = "Unique and unambiguous way to identify a party";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.RelatedPartyIdentification, com.tools20022.repository.entity.Party.Identification,
						com.tools20022.repository.entity.PartyName.PartyIdentification, com.tools20022.repository.entity.DateTimePeriod.RelatedIdentification, com.tools20022.repository.entity.Market.Identification);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PartyIdentification1Choice.NameAndAddress, com.tools20022.repository.choice.PartyIdentification2Choice.NameAndAddress,
						com.tools20022.repository.choice.PartyIdentification5Choice.NameAndAddress, com.tools20022.repository.msg.PartyIdentification8.Identification, com.tools20022.repository.msg.PartyIdentification32.Identification,
						com.tools20022.repository.msg.PartyIdentification43.Identification, com.tools20022.repository.msg.PartyIdentificationAndAccount2.PartyIdentification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount5.PartyIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount4.PartyIdentification,
						com.tools20022.repository.msg.PartyIdentification21.PartyIdentification, com.tools20022.repository.choice.PartyIdentification12Choice.NameAndAddress,
						com.tools20022.repository.msg.PartyIdentification36.Identification, com.tools20022.repository.choice.PartyIdentification10Choice.NameAndAddress,
						com.tools20022.repository.msg.PartyIdentificationAndAccount16.Identification, com.tools20022.repository.choice.PartyIdentification14Choice.NameAndAddress,
						com.tools20022.repository.choice.PartyIdentification44Choice.NameAndAddress, com.tools20022.repository.msg.PartyIdentification46.Identification,
						com.tools20022.repository.choice.PartyIdentification45Choice.NameAndAddress, com.tools20022.repository.msg.PartyIdentificationAndAccount44.Identification,
						com.tools20022.repository.choice.PartyIdentification37Choice.NameAndAddress, com.tools20022.repository.msg.AlternatePartyIdentification1.TypeOfIdentification,
						com.tools20022.repository.msg.AlternatePartyIdentification2.IdentificationType, com.tools20022.repository.msg.PartyIdentificationAndAccount1.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount1.AlternateIdentification, com.tools20022.repository.msg.PartyIdentification29.PartyIdentification,
						com.tools20022.repository.msg.PartyIdentification29.AlternateIdentification, com.tools20022.repository.msg.PartyIdentification2.Identification,
						com.tools20022.repository.msg.PartyIdentification2.AlternateIdentification, com.tools20022.repository.choice.PartyIdentification43Choice.NameAndAddress,
						com.tools20022.repository.msg.PartyIdentificationAndAccount42.Identification, com.tools20022.repository.msg.PartyIdentificationAndAccount42.AlternateIdentification,
						com.tools20022.repository.msg.PartyIdentification48.Identification, com.tools20022.repository.msg.PartyIdentification48.AlternateIdentification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount11.Identification, com.tools20022.repository.msg.PartyIdentificationAndAccount11.AlternateIdentification,
						com.tools20022.repository.choice.PartyIdentification3Choice.NameAndAddress, com.tools20022.repository.msg.PartyIdentificationAndAccount12.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount12.AlternateIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount20.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount20.AlternateIdentification, com.tools20022.repository.choice.PartyIdentification30Choice.NameAndAddress,
						com.tools20022.repository.msg.PartyIdentificationAndAccount15.Identification, com.tools20022.repository.msg.PartyIdentificationAndAccount15.AlternateIdentification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount39.Identification, com.tools20022.repository.msg.PartyIdentificationAndAccount39.AlternateIdentification,
						com.tools20022.repository.choice.PartyIdentification38Choice.NameAndAddress, com.tools20022.repository.msg.PartyIdentificationAndAccount50.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount50.AlternateIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount19.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount19.AlternateIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount21.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount21.AlternateIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount40.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount40.AlternateIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount41.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount41.AlternateIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount43.Identification,
						com.tools20022.repository.choice.PartyIdentification58Choice.NameAndAddress, com.tools20022.repository.msg.PartyIdentification53.Identification,
						com.tools20022.repository.choice.PartyIdentification62Choice.NameAndAddress, com.tools20022.repository.msg.PartyIdentificationAndAccount68.Identification,
						com.tools20022.repository.choice.PartyIdentification60Choice.NameAndAddress, com.tools20022.repository.choice.PartyIdentification65Choice.NameAndAddress,
						com.tools20022.repository.msg.PartyIdentificationAndAccount75.Identification, com.tools20022.repository.msg.AlternatePartyIdentification3.IdentificationType,
						com.tools20022.repository.msg.PartyIdentificationAndAccount63.Identification, com.tools20022.repository.msg.PartyIdentificationAndAccount63.AlternateIdentification,
						com.tools20022.repository.msg.PartyIdentification52.Identification, com.tools20022.repository.msg.PartyIdentification52.AlternateIdentification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount64.Identification, com.tools20022.repository.msg.PartyIdentificationAndAccount64.AlternateIdentification,
						com.tools20022.repository.choice.PartyIdentification61Choice.NameAndAddress, com.tools20022.repository.msg.PartyIdentificationAndAccount60.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount60.AlternateIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount66.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount66.AlternateIdentification, com.tools20022.repository.choice.PartyIdentification16Choice.NameAndAddress,
						com.tools20022.repository.choice.PartyIdentification46Choice.NameAndAddress, com.tools20022.repository.choice.PartyIdentification56Choice.NameAndAddress,
						com.tools20022.repository.msg.PartyIdentification33.AlternateIdentification, com.tools20022.repository.msg.PartyIdentification34.AlternateIdentification,
						com.tools20022.repository.choice.PartyIdentification48Choice.NameAndAddress, com.tools20022.repository.msg.PartyIdentification50.AlternateIdentification,
						com.tools20022.repository.choice.PartyIdentification52Choice.NameAndAddress, com.tools20022.repository.msg.PartyIdentification51.AlternateIdentification,
						com.tools20022.repository.msg.PartyIdentification56.AlternateIdentification, com.tools20022.repository.msg.PartyIdentification57.AlternateIdentification,
						com.tools20022.repository.msg.PartyIdentification35.Identification, com.tools20022.repository.msg.PartyIdentification35.AlternateIdentification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount14.Identification, com.tools20022.repository.msg.PartyIdentificationAndAccount14.AlternateIdentification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount17.Identification, com.tools20022.repository.msg.PartyIdentificationAndAccount17.AlternateIdentification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount18.Identification, com.tools20022.repository.msg.PartyIdentificationAndAccount18.AlternateIdentification,
						com.tools20022.repository.choice.PartyIdentification17Choice.NameAndAddress, com.tools20022.repository.msg.PartyIdentification37.Identification,
						com.tools20022.repository.msg.PartyIdentification37.AlternateIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount22.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount22.AlternateIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount23.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount23.AlternateIdentification, com.tools20022.repository.choice.PartyIdentification31Choice.NameAndAddress,
						com.tools20022.repository.msg.PartyIdentificationAndAccount24.Identification, com.tools20022.repository.msg.PartyIdentificationAndAccount24.AlternateIdentification,
						com.tools20022.repository.choice.PartyIdentification39Choice.NameAndAddress, com.tools20022.repository.msg.PartyIdentification47.Identification,
						com.tools20022.repository.msg.PartyIdentification47.AlternateIdentification, com.tools20022.repository.choice.PartyIdentification40Choice.NameAndAddress,
						com.tools20022.repository.msg.PartyIdentificationAndAccount51.Identification, com.tools20022.repository.msg.PartyIdentificationAndAccount51.AlternateIdentification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount52.Identification, com.tools20022.repository.msg.PartyIdentificationAndAccount52.AlternateIdentification,
						com.tools20022.repository.choice.PartyIdentification42Choice.NameAndAddress, com.tools20022.repository.msg.PartyIdentificationAndAccount54.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount54.AlternateIdentification, com.tools20022.repository.choice.PartyIdentification53Choice.NameAndAddress,
						com.tools20022.repository.msg.PartyIdentification49.Identification, com.tools20022.repository.msg.PartyIdentification49.AlternateIdentification,
						com.tools20022.repository.choice.PartyIdentification54Choice.NameAndAddress, com.tools20022.repository.msg.PartyIdentificationAndAccount56.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount56.AlternateIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount57.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount57.AlternateIdentification, com.tools20022.repository.choice.PartyIdentification55Choice.NameAndAddress,
						com.tools20022.repository.msg.PartyIdentificationAndAccount58.Identification, com.tools20022.repository.msg.PartyIdentificationAndAccount58.AlternateIdentification,
						com.tools20022.repository.choice.PartyIdentification47Choice.NameAndAddress, com.tools20022.repository.choice.PartyIdentification57Choice.NameAndAddress,
						com.tools20022.repository.choice.PartyIdentification49Choice.NameAndAddress, com.tools20022.repository.choice.PartyIdentification59Choice.NameAndAddress,
						com.tools20022.repository.msg.PartyIdentification15.Identification, com.tools20022.repository.msg.PartyIdentificationAndAccount26.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount26.AlternateIdentification, com.tools20022.repository.msg.PartyIdentification4.Identification,
						com.tools20022.repository.msg.PartyIdentification4.AlternateIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount29.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount29.AlternateIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount27.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount27.AlternateIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount28.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount28.AlternateIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount30.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount30.AlternateIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount35.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount35.AlternateIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount38.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount38.AlternateIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount36.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount36.AlternateIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount37.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount37.AlternateIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount49.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount49.AlternateIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount59.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount59.AlternateIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount61.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount61.AlternateIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount62.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount62.AlternateIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount25.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount65.Identification, com.tools20022.repository.msg.PartyIdentificationAndAccount65.AlternateIdentification,
						com.tools20022.repository.choice.PartyIdentification63Choice.NameAndAddress, com.tools20022.repository.msg.PartyIdentificationAndAccount67.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount67.AlternateIdentification, com.tools20022.repository.msg.PartyIdentification38.Identification,
						com.tools20022.repository.choice.PartyIdentification15Choice.NameAndAddress, com.tools20022.repository.msg.PartyIdentificationAndAccount9.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount9.AlternateIdentification, com.tools20022.repository.choice.PartyIdentification32Choice.NameAndAddress,
						com.tools20022.repository.msg.AlternatePartyIdentification5.IdentificationType, com.tools20022.repository.msg.PartyIdentificationAndAccount79.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount79.AdditionalInformation, com.tools20022.repository.msg.PartyIdentificationAndAccount79.AlternateIdentification,
						com.tools20022.repository.choice.PartyIdentification70Choice.NameAndAddress, com.tools20022.repository.msg.AlternatePartyIdentification6.TypeOfIdentification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount87.Identification, com.tools20022.repository.msg.PartyIdentificationAndAccount87.AdditionalInformation,
						com.tools20022.repository.msg.PartyIdentificationAndAccount87.AlternateIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount83.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount83.AdditionalInformation, com.tools20022.repository.msg.PartyIdentificationAndAccount83.AlternateIdentification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount77.Identification, com.tools20022.repository.msg.PartyIdentificationAndAccount77.AlternateIdentification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount77.AdditionalInformation, com.tools20022.repository.msg.PartyIdentificationAndAccount78.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount78.AlternateIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount78.AdditionalInformation,
						com.tools20022.repository.msg.PartyIdentification23.NameAndAddress, com.tools20022.repository.msg.PartyIdentification6Choice.NameAndAddress,
						com.tools20022.repository.msg.PartyIdentificationAndAccount10.Identification, com.tools20022.repository.msg.PartyIdentificationAndAccount10.AlternateIdentification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount8.Identification, com.tools20022.repository.msg.PartyIdentificationAndAccount8.AlternateIdentification,
						com.tools20022.repository.msg.PartyIdentification54.NameAndAddress, com.tools20022.repository.choice.PartyIdentification68Choice.NameAndAddress, com.tools20022.repository.msg.PartyIdentification55.Identification,
						com.tools20022.repository.msg.PartyIdentification55.AlternateIdentification, com.tools20022.repository.msg.PartyIdentification55.AdditionalInformation,
						com.tools20022.repository.msg.PartyIdentificationAndAccount34.Identification, com.tools20022.repository.msg.PartyIdentificationAndAccount34.AdditionalInformation,
						com.tools20022.repository.msg.PartyIdentificationAndAccount34.AlternateIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount80.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount80.AlternateIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount80.AdditionalInformation,
						com.tools20022.repository.msg.PartyIdentification41.Identification, com.tools20022.repository.msg.PartyIdentification40.Identification, com.tools20022.repository.msg.PartyModification1.PartyIdentification,
						com.tools20022.repository.msg.ProprietaryParty1.Party, com.tools20022.repository.msg.ProprietaryParty2.Party, com.tools20022.repository.msg.ProprietaryParty3.Party,
						com.tools20022.repository.choice.Party7Choice.Party, com.tools20022.repository.choice.Party12Choice.Party, com.tools20022.repository.msg.PartyIdentification42.Identification,
						com.tools20022.repository.choice.PartyIdentification7Choice.NameAndAddress, com.tools20022.repository.choice.PartyIdentification8Choice.NameAndAddress,
						com.tools20022.repository.choice.PartyIdentification19Choice.NameAndAddress, com.tools20022.repository.choice.PartyIdentification73Choice.NameAndAddress,
						com.tools20022.repository.choice.PartyIdentification73Choice.PartyIdentification, com.tools20022.repository.msg.PartyIdentification60.NameAndAddress,
						com.tools20022.repository.msg.PartyIdentificationAndAccount3.PartyIdentification, com.tools20022.repository.msg.PartyIdentification1.Identification,
						com.tools20022.repository.choice.PartyIdentification9Choice.NameAndAddress, com.tools20022.repository.msg.IssuerInformation1.Identification, com.tools20022.repository.msg.PartyIdentification39.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount53.Identification, com.tools20022.repository.msg.PartyIdentificationAndAccount53.AlternateIdentification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount55.Identification, com.tools20022.repository.msg.PartyIdentificationAndAccount55.AlternateIdentification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount45.Identification, com.tools20022.repository.msg.PartyIdentificationAndAccount45.AlternateIdentification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount48.Identification, com.tools20022.repository.msg.PartyIdentificationAndAccount48.AlternateIdentification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount46.Identification, com.tools20022.repository.msg.PartyIdentificationAndAccount46.AlternateIdentification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount47.Identification, com.tools20022.repository.msg.PartyIdentificationAndAccount47.AlternateIdentification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount6.PartyIdentification, com.tools20022.repository.msg.PartyIdentificationAndContactInformation1.PartyIdentification,
						com.tools20022.repository.msg.PartyIdentification45.Identification, com.tools20022.repository.choice.PartyIdentification29Choice.NameAndAddress,
						com.tools20022.repository.choice.PartyIdentification33Choice.NameAndAddress, com.tools20022.repository.msg.PartyIdentificationAndAccount69.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount69.AlternateIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount70.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount70.AlternateIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount71.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount71.AlternateIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount72.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount72.AlternateIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount73.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount73.AlternateIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount74.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount74.AlternateIdentification, com.tools20022.repository.choice.PartyIdentification66Choice.NameAndAddress,
						com.tools20022.repository.msg.PartyIdentificationAndAccount76.Identification, com.tools20022.repository.choice.PartyIdentification67Choice.NameAndAddress,
						com.tools20022.repository.msg.AlternatePartyIdentification4.IdentificationType, com.tools20022.repository.msg.PartyIdentificationAndAccount31.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount31.AlternateIdentification, com.tools20022.repository.choice.PartyIdentification34Choice.NameAndAddress,
						com.tools20022.repository.msg.PartyIdentificationAndAccount32.PartyIdentification, com.tools20022.repository.msg.PartyIdentification58.Identification,
						com.tools20022.repository.msg.PartyIdentification14.Identification, com.tools20022.repository.msg.PartyIdentification11.Identification, com.tools20022.repository.msg.PartyIdentification17.Identification,
						com.tools20022.repository.msg.PartyIdentification19.Identification, com.tools20022.repository.msg.PartyIdentification30.Identification, com.tools20022.repository.msg.PartyIdentification18.Identification,
						com.tools20022.repository.msg.PartyIdentification20.Identification, com.tools20022.repository.msg.PartyIdentification31.Identification, com.tools20022.repository.msg.PartyIdentification16.Identification,
						com.tools20022.repository.choice.PartyIdentification26Choice.NameAndAddress, com.tools20022.repository.msg.PartyIdentificationAndAccount13.PartyIdentification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount7.PartyIdentification, com.tools20022.repository.choice.PartyIdentification71Choice.NameAndAddress,
						com.tools20022.repository.choice.PartyIdentification25Choice.Identification, com.tools20022.repository.choice.PartyIdentification25Choice.NameAndAddress,
						com.tools20022.repository.msg.PartyIdentificationAndAccount95.PartyIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount97.PartyIdentification,
						com.tools20022.repository.msg.PartyIdentification62.NameAndAddress, com.tools20022.repository.msg.PartyIdentificationAndAccount96.PartyIdentification,
						com.tools20022.repository.msg.PartyIdentification63.PartyIdentification, com.tools20022.repository.msg.PartyIdentification64.NameAndAddress,
						com.tools20022.repository.choice.PartyIdentification75Choice.NameAndAddress, com.tools20022.repository.msg.SafekeepingAccount5.AccountServicer,
						com.tools20022.repository.choice.PartyIdentification83Choice.NameAndAddress, com.tools20022.repository.msg.PartyIdentificationAndAccount100.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount100.AlternateIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount100.AdditionalInformation,
						com.tools20022.repository.msg.PartyIdentificationAndAccount101.Identification, com.tools20022.repository.msg.PartyIdentificationAndAccount101.AlternateIdentification,
						com.tools20022.repository.msg.IssuerInformation2.Identification, com.tools20022.repository.msg.PartyIdentification71.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount102.PartyIdentification, com.tools20022.repository.choice.PartyIdentification89Choice.NameAndAddress,
						com.tools20022.repository.choice.PartyIdentification87Choice.NameAndAddress, com.tools20022.repository.choice.PartyIdentification88Choice.NameAndAddress,
						com.tools20022.repository.msg.PartyIdentificationAndAccount104.Identification, com.tools20022.repository.msg.PartyIdentificationAndAccount104.AlternateIdentification,
						com.tools20022.repository.msg.QualifiedPartyIdentification1.ShortIdentification, com.tools20022.repository.msg.CardTransactionEnvironment5.SendingInstitution,
						com.tools20022.repository.msg.CardTransactionEnvironment5.ReceivingInstitution, com.tools20022.repository.msg.CardTransactionEnvironment5.SettlementInstitution,
						com.tools20022.repository.choice.PartyIdentification90Choice.NameAndAddress, com.tools20022.repository.msg.PartyIdentificationAndAccount106.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount106.AlternateIdentification, com.tools20022.repository.msg.PartyIdentification75.Identification,
						com.tools20022.repository.msg.PartyIdentification75.AlternateIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount112.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount112.AlternateIdentification, com.tools20022.repository.msg.AlternatePartyIdentification7.IdentificationType,
						com.tools20022.repository.msg.PartyIdentificationAndAccount111.Identification, com.tools20022.repository.msg.PartyIdentificationAndAccount111.AlternateIdentification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount117.Identification, com.tools20022.repository.msg.PartyIdentificationAndAccount107.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount107.AlternateIdentification, com.tools20022.repository.msg.PartyIdentification76.Identification,
						com.tools20022.repository.msg.PartyIdentification77.Identification, com.tools20022.repository.choice.Party28Choice.Party, com.tools20022.repository.choice.PartyIdentification93Choice.NameAndAddress,
						com.tools20022.repository.msg.PartyIdentification91.Identification, com.tools20022.repository.msg.PartyIdentification93.AlternateIdentification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount122.Identification, com.tools20022.repository.msg.PartyIdentificationAndAccount122.AlternateIdentification,
						com.tools20022.repository.msg.PartyIdentification92.Identification, com.tools20022.repository.msg.PartyIdentification92.AlternateIdentification,
						com.tools20022.repository.choice.PartyIdentification94Choice.NameAndAddress, com.tools20022.repository.msg.PartyIdentificationAndAccount120.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount120.AlternateIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount121.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount121.AlternateIdentification, com.tools20022.repository.msg.PartyIdentification94.Identification,
						com.tools20022.repository.choice.PartyIdentification97Choice.NameAndAddress, com.tools20022.repository.msg.PartyIdentification97.PartyIdentification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount124.PartyIdentification, com.tools20022.repository.msg.PartyIdentification95.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount123.PartyIdentification, com.tools20022.repository.choice.PartyIdentification96Choice.NameAndAddress,
						com.tools20022.repository.msg.PartyIdentification96.Identification, com.tools20022.repository.choice.PartyIdentification99Choice.NameAndAddress, com.tools20022.repository.msg.PartyIdentification98.Identification,
						com.tools20022.repository.msg.PartyIdentification100.Identification, com.tools20022.repository.msg.PlaceOfClearingIdentification1.Identification,
						com.tools20022.repository.msg.PlaceOfTradeIdentification1.MarketTypeAndIdentification, com.tools20022.repository.msg.SafeKeepingPlace1.SafekeepingPlaceFormat,
						com.tools20022.repository.msg.PartyIdentification99.Identification, com.tools20022.repository.msg.Pledgee1.PledgeeTypeAndIdentification, com.tools20022.repository.choice.PartyIdentification100Choice.NameAndAddress,
						com.tools20022.repository.msg.PartyIdentificationAndAccount127.Identification, com.tools20022.repository.msg.PartyIdentificationAndAccount127.AlternateIdentification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount127.AdditionalInformation, com.tools20022.repository.choice.PartyIdentification102Choice.NameAndAddress,
						com.tools20022.repository.msg.PartyIdentificationAndAccount126.PartyIdentification, com.tools20022.repository.choice.PartyIdentification101Choice.NameAndAddress,
						com.tools20022.repository.msg.AlternatePartyIdentification8.IdentificationType, com.tools20022.repository.choice.PartyIdentification104Choice.NameAndAddress,
						com.tools20022.repository.msg.PartyIdentification101.AlternateIdentification, com.tools20022.repository.choice.PartyIdentification111Choice.NameAndAddress,
						com.tools20022.repository.msg.PartyIdentification102.Identification, com.tools20022.repository.msg.PartyIdentification102.AlternateIdentification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount129.Identification, com.tools20022.repository.msg.PartyIdentificationAndAccount129.AlternateIdentification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount130.Identification, com.tools20022.repository.msg.PartyIdentificationAndAccount130.AlternateIdentification,
						com.tools20022.repository.msg.AlternatePartyIdentification9.IdentificationType, com.tools20022.repository.choice.PartyIdentification113Choice.NameAndAddress,
						com.tools20022.repository.msg.PartyIdentificationAndAccount128.Identification, com.tools20022.repository.msg.PartyIdentificationAndAccount128.AlternateIdentification,
						com.tools20022.repository.msg.PartyIdentification108.Identification, com.tools20022.repository.msg.PartyIdentificationAndAccount133.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount133.AlternateIdentification, com.tools20022.repository.msg.PartyIdentification103.Identification,
						com.tools20022.repository.msg.PartyIdentification103.AlternateIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount131.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount131.AlternateIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount146.Identification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount136.Identification, com.tools20022.repository.msg.PartyIdentificationAndAccount136.AlternateIdentification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount134.Identification, com.tools20022.repository.msg.PartyIdentificationAndAccount134.AlternateIdentification,
						com.tools20022.repository.msg.PartyIdentification109.Identification, com.tools20022.repository.msg.PartyIdentification111.Identification, com.tools20022.repository.msg.PartyIdentification110.Identification,
						com.tools20022.repository.choice.PartyIdentification115Choice.NameAndAddress, com.tools20022.repository.msg.SafeKeepingPlace2.SafekeepingPlaceFormat,
						com.tools20022.repository.msg.PlaceOfTradeIdentification2.MarketTypeAndIdentification, com.tools20022.repository.msg.Pledgee2.PledgeeTypeAndIdentification,
						com.tools20022.repository.msg.PartyIdentification112.Identification, com.tools20022.repository.msg.SafekeepingAccount7.AccountServicer, com.tools20022.repository.msg.PartyIdentification113.Party,
						com.tools20022.repository.msg.PartyIdentificationAndAccount147.PartyIdentification, com.tools20022.repository.msg.PartyIdentification119.Identification,
						com.tools20022.repository.msg.PartyIdentification120.Identification, com.tools20022.repository.msg.PartyIdentification120.AlternateIdentification);
				subType_lazy = () -> Arrays.asList(OrganisationIdentification.mmObject(), PersonIdentification.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PartyIdentificationInformation.OtherIdentification, com.tools20022.repository.entity.PartyIdentificationInformation.IdentifiedParty,
						com.tools20022.repository.entity.PartyIdentificationInformation.TaxIdentificationNumber, com.tools20022.repository.entity.PartyIdentificationInformation.NationalRegistrationNumber,
						com.tools20022.repository.entity.PartyIdentificationInformation.TypeOfIdentification, com.tools20022.repository.entity.PartyIdentificationInformation.Declaration,
						com.tools20022.repository.entity.PartyIdentificationInformation.PartyType, com.tools20022.repository.entity.PartyIdentificationInformation.PartyName,
						com.tools20022.repository.entity.PartyIdentificationInformation.ValidityPeriod, com.tools20022.repository.entity.PartyIdentificationInformation.IdentifiedMarket,
						com.tools20022.repository.entity.PartyIdentificationInformation.LEI);
				derivationComponent_lazy = () -> Arrays.asList(NameAndAddress2.mmObject(), PartyIdentification1Choice.mmObject(), NameAndAddress5.mmObject(), PartyIdentification2Choice.mmObject(), PartyIdentification4Choice.mmObject(),
						NameAndAddress1.mmObject(), NameAndAddress4.mmObject(), PartyIdentification5Choice.mmObject(), Party2Choice.mmObject(), PartyIdentification8.mmObject(), Party6Choice.mmObject(), PartyIdentification32.mmObject(),
						Party11Choice.mmObject(), PartyIdentification43.mmObject(), PartyIdentification.mmObject(), NameAndAddress7.mmObject(), PartyIdentificationAndAccount2.mmObject(), PartyIdentificationAndAccount5.mmObject(),
						PartyIdentificationAndAccount4.mmObject(), PartyIdentification21.mmObject(), PartyIdentification13Choice.mmObject(), PartyIdentification36Choice.mmObject(), PartyIdentification51Choice.mmObject(),
						PartyIdentification12Choice.mmObject(), PartyIdentification36.mmObject(), PartyIdentification10Choice.mmObject(), PartyIdentificationAndAccount16.mmObject(), PartyIdentification14Choice.mmObject(),
						PartyIdentification44Choice.mmObject(), PartyIdentification46.mmObject(), PartyIdentification45Choice.mmObject(), PartyIdentificationAndAccount44.mmObject(), PartyIdentification37Choice.mmObject(),
						IdentificationType2Choice.mmObject(), AlternatePartyIdentification1.mmObject(), IdentificationType4Choice.mmObject(), AlternatePartyIdentification2.mmObject(), PartyTextInformation1.mmObject(),
						PartyIdentificationAndAccount1.mmObject(), PartyIdentification29.mmObject(), PartyIdentification2.mmObject(), PartyIdentification43Choice.mmObject(), PartyIdentificationAndAccount42.mmObject(),
						PartyIdentification48.mmObject(), PartyIdentificationAndAccount11.mmObject(), PartyIdentification3Choice.mmObject(), PartyIdentificationAndAccount12.mmObject(), PartyTextInformation2.mmObject(),
						PartyIdentificationAndAccount20.mmObject(), PartyIdentification30Choice.mmObject(), PartyIdentificationAndAccount15.mmObject(), PartyIdentificationAndAccount39.mmObject(), PartyIdentification38Choice.mmObject(),
						PartyIdentificationAndAccount50.mmObject(), PartyIdentificationAndAccount19.mmObject(), PartyIdentificationAndAccount21.mmObject(), PartyIdentificationAndAccount40.mmObject(),
						PartyIdentificationAndAccount41.mmObject(), PartyIdentificationAndAccount43.mmObject(), NameAndAddress12.mmObject(), PartyIdentification58Choice.mmObject(), PartyIdentification53.mmObject(),
						PartyIdentification62Choice.mmObject(), PartyIdentificationAndAccount68.mmObject(), PartyIdentification60Choice.mmObject(), PartyIdentification65Choice.mmObject(), PartyIdentificationAndAccount75.mmObject(),
						IdentificationType5Choice.mmObject(), AlternatePartyIdentification3.mmObject(), PartyTextInformation3.mmObject(), PartyIdentificationAndAccount63.mmObject(), PartyIdentification52.mmObject(),
						PartyTextInformation4.mmObject(), PartyIdentificationAndAccount64.mmObject(), PartyIdentification61Choice.mmObject(), PartyIdentificationAndAccount60.mmObject(), PartyIdentificationAndAccount66.mmObject(),
						PartyIdentification18Choice.mmObject(), PartyIdentification16Choice.mmObject(), PartyIdentification46Choice.mmObject(), PartyIdentification56Choice.mmObject(), PartyIdentification33.mmObject(),
						PartyIdentification34.mmObject(), PartyIdentification48Choice.mmObject(), PartyIdentification50.mmObject(), PartyIdentification52Choice.mmObject(), PartyIdentification51.mmObject(), PartyIdentification56.mmObject(),
						PartyIdentification57.mmObject(), PartyIdentification41Choice.mmObject(), PartyIdentification50Choice.mmObject(), PartyIdentification35.mmObject(), PartyIdentificationAndAccount14.mmObject(),
						PartyIdentificationAndAccount17.mmObject(), PartyIdentificationAndAccount18.mmObject(), PartyIdentification17Choice.mmObject(), PartyIdentification37.mmObject(), PartyIdentificationAndAccount22.mmObject(),
						PartyIdentificationAndAccount23.mmObject(), PartyIdentification31Choice.mmObject(), PartyIdentificationAndAccount24.mmObject(), PartyIdentification39Choice.mmObject(), PartyIdentification47.mmObject(),
						PartyIdentification40Choice.mmObject(), PartyIdentificationAndAccount51.mmObject(), PartyIdentificationAndAccount52.mmObject(), PartyIdentification42Choice.mmObject(), PartyIdentificationAndAccount54.mmObject(),
						PartyIdentification53Choice.mmObject(), PartyIdentification49.mmObject(), PartyIdentification54Choice.mmObject(), PartyIdentificationAndAccount56.mmObject(), PartyIdentificationAndAccount57.mmObject(),
						PartyIdentification55Choice.mmObject(), PartyIdentificationAndAccount58.mmObject(), PartyIdentification47Choice.mmObject(), PartyIdentification57Choice.mmObject(), PartyIdentificationSD3.mmObject(),
						PartyIdentification3.mmObject(), PartyIdentification49Choice.mmObject(), PartyIdentification59Choice.mmObject(), PartyIdentification15.mmObject(), PartyIdentificationAndAccount26.mmObject(),
						PartyIdentification4.mmObject(), PartyIdentificationAndAccount29.mmObject(), PartyIdentificationAndAccount27.mmObject(), PartyIdentificationAndAccount28.mmObject(), PartyIdentificationAndAccount30.mmObject(),
						PartyIdentificationAndAccount35.mmObject(), PartyIdentificationAndAccount38.mmObject(), PartyIdentificationAndAccount36.mmObject(), PartyIdentificationAndAccount37.mmObject(),
						PartyIdentificationAndAccount49.mmObject(), PartyIdentificationAndAccount59.mmObject(), PartyIdentificationAndAccount61.mmObject(), PartyIdentificationAndAccount62.mmObject(), PartyIdentification64Choice.mmObject(),
						PartyIdentificationAndAccount25.mmObject(), PartyIdentificationAndAccount65.mmObject(), PartyIdentification63Choice.mmObject(), PartyIdentificationAndAccount67.mmObject(), PartyIdentification38.mmObject(),
						PartyIdentification15Choice.mmObject(), PartyIdentificationAndAccount9.mmObject(), NameAndAddress13.mmObject(), PartyIdentification32Choice.mmObject(), IdentificationType40Choice.mmObject(),
						AlternatePartyIdentification5.mmObject(), PartyIdentificationAndAccount79.mmObject(), PartyIdentification70Choice.mmObject(), IdentificationType41Choice.mmObject(), AlternatePartyIdentification6.mmObject(),
						PartyIdentificationAndAccount87.mmObject(), PartyIdentificationAndAccount83.mmObject(), PartyIdentificationAndAccount77.mmObject(), PartyIdentificationAndAccount78.mmObject(), PartyIdentification23Choice.mmObject(),
						PartyIdentification35Choice.mmObject(), PartyTextInformation5.mmObject(), PartyIdentification23.mmObject(), PartyRole1Choice.mmObject(), PartyIdentification6Choice.mmObject(),
						PartyIdentificationAndAccount10.mmObject(), PartyIdentificationAndAccount8.mmObject(), PartyIdentification54.mmObject(), PartyIdentification68Choice.mmObject(), PartyIdentification55.mmObject(),
						PartyIdentificationAndAccount34.mmObject(), PartyIdentificationAndAccount80.mmObject(), Party8Choice.mmObject(), PartyIdentification41.mmObject(), PartyIdentification40.mmObject(), PartyModification1.mmObject(),
						ProprietaryParty1.mmObject(), NameAndAddress3.mmObject(), ProprietaryParty2.mmObject(), NameAndAddress10.mmObject(), ProprietaryParty3.mmObject(), Party7Choice.mmObject(), Party12Choice.mmObject(),
						Party10Choice.mmObject(), PartyIdentification42.mmObject(), Party9Choice.mmObject(), PartyType1Choice.mmObject(), PartyIdentification7Choice.mmObject(), NameAndAddress8.mmObject(), PartyIdentification22.mmObject(),
						PartyIdentification8Choice.mmObject(), PartyIdentification44.mmObject(), PartyIdentification19Choice.mmObject(), PartyIdentification59.mmObject(), PartyIdentification73Choice.mmObject(),
						PartyIdentification60.mmObject(), PartyIdentificationAndAccount3.mmObject(), Party1Choice.mmObject(), PartyIdentification1.mmObject(), PartyIdentification9Choice.mmObject(), IssuerInformation1.mmObject(),
						PartyIdentification39.mmObject(), NameAndAddress9.mmObject(), PartyIdentification24Choice.mmObject(), PartyIdentification11Choice.mmObject(), PartyIdentificationAndAccount53.mmObject(),
						PartyIdentificationAndAccount55.mmObject(), PartyIdentificationAndAccount45.mmObject(), PartyIdentificationAndAccount48.mmObject(), PartyIdentificationAndAccount46.mmObject(),
						PartyIdentificationAndAccount47.mmObject(), PartyIdentification25.mmObject(), PartyIdentificationAndAccount6.mmObject(), PartyIdentificationAndContactInformation1.mmObject(), PartyIdentification45.mmObject(),
						PartyIdentification9.mmObject(), NameAndAddress6.mmObject(), PartyIdentification26.mmObject(), PartyIdentification27.mmObject(), PartyIdentification29Choice.mmObject(), PartyIdentification28.mmObject(),
						PartyIdentification33Choice.mmObject(), PartyIdentificationAndAccount69.mmObject(), PartyIdentificationAndAccount70.mmObject(), PartyIdentificationAndAccount71.mmObject(), PartyIdentificationAndAccount72.mmObject(),
						PartyIdentificationAndAccount73.mmObject(), PartyIdentificationAndAccount74.mmObject(), PartyIdentification66Choice.mmObject(), PartyIdentificationAndAccount76.mmObject(), PartyIdentification67Choice.mmObject(),
						IdentificationType6Choice.mmObject(), AlternatePartyIdentification4.mmObject(), PartyIdentificationAndAccount31.mmObject(), PartyIdentification34Choice.mmObject(), PartyIdentificationAndAccount32.mmObject(),
						Party13Choice.mmObject(), PartyIdentification58.mmObject(), PartyOrganisation1Choice.mmObject(), PartyIdentification14.mmObject(), PartyPrivate1.mmObject(), PartyIdentification11.mmObject(),
						PartyIdentification17.mmObject(), PartyIdentification12.mmObject(), Party5Choice.mmObject(), PartyIdentification19.mmObject(), PartyIdentification30.mmObject(), PartyIdentification18.mmObject(),
						PartyIdentification20.mmObject(), PartyIdentification31.mmObject(), PartyIdentification13.mmObject(), PartyIdentification16.mmObject(), NameAndAddress11.mmObject(), PartyIdentification26Choice.mmObject(),
						PartyIdentificationAndAccount13.mmObject(), PartyIdentification5.mmObject(), PartyIdentificationAndAccount7.mmObject(), PartyIdentification24.mmObject(), PartyIdentification72Choice.mmObject(),
						PartyIdentification71Choice.mmObject(), TechnicalIdentification1Choice.mmObject(), PartyIdentification25Choice.mmObject(), PartyRole2Choice.mmObject(), PartyIdentificationAndAccount95.mmObject(),
						PartyIdentificationAndAccount97.mmObject(), PartyIdentification62.mmObject(), PartyIdentificationAndAccount96.mmObject(), PartyIdentification63.mmObject(), PartyIdentification64.mmObject(),
						PartyIdentification75Choice.mmObject(), PartyIdentification83Choice.mmObject(), PartyIdentificationAndAccount100.mmObject(), PartyIdentificationAndAccount101.mmObject(), PartyRole4Choice.mmObject(),
						IssuerInformation2.mmObject(), PartyIdentification71.mmObject(), PartyIdentificationAndAccount102.mmObject(), PartyIdentification89Choice.mmObject(), PartyIdentification87Choice.mmObject(),
						PartyIdentification88Choice.mmObject(), PartyIdentificationAndAccount104.mmObject(), QualifiedPartyIdentification1.mmObject(), CounterpartyIdentification1Choice.mmObject(), CardTransactionEnvironment5.mmObject(),
						PartyIdentification90Choice.mmObject(), PartyIdentification92Choice.mmObject(), PartyIdentificationAndAccount106.mmObject(), PartyIdentification75.mmObject(), PartyIdentificationAndAccount112.mmObject(),
						AlternatePartyIdentification7.mmObject(), PartyIdentificationAndAccount111.mmObject(), PartyIdentificationAndAccount117.mmObject(), PartyIdentificationAndAccount107.mmObject(), IdentificationType42Choice.mmObject(),
						PartyIdentification76.mmObject(), PersonOrOrganisation1Choice.mmObject(), PersonOrOrganisation2Choice.mmObject(), PartyIdentification77.mmObject(), Party28Choice.mmObject(), PartyIdentification93Choice.mmObject(),
						PartyIdentification91.mmObject(), PartyIdentification93.mmObject(), PartyIdentificationAndAccount122.mmObject(), PartyIdentification92.mmObject(), PartyIdentification94Choice.mmObject(),
						PartyIdentificationAndAccount120.mmObject(), PartyIdentificationAndAccount121.mmObject(), Party29Choice.mmObject(), PartyIdentification94.mmObject(), PartyIdentification97Choice.mmObject(),
						PartyIdentification97.mmObject(), PartyIdentificationAndAccount124.mmObject(), PartyRole5Choice.mmObject(), PartyIdentification95.mmObject(), PartyIdentificationAndAccount123.mmObject(),
						PartyIdentification96Choice.mmObject(), PartyIdentification96.mmObject(), PartyIdentification99Choice.mmObject(), NameAndAddress15.mmObject(), PartyIdentification98.mmObject(), PartyIdentification100.mmObject(),
						PlaceOfClearingIdentification1.mmObject(), PlaceOfTradeIdentification1.mmObject(), SafeKeepingPlace1.mmObject(), PartyIdentification99.mmObject(), Pledgee1.mmObject(), PartyIdentification100Choice.mmObject(),
						PartyIdentificationAndAccount127.mmObject(), PartyIdentification102Choice.mmObject(), PartyIdentificationAndAccount126.mmObject(), PartyIdentification101Choice.mmObject(), AlternatePartyIdentification8.mmObject(),
						IdentificationType43Choice.mmObject(), PartyIdentification104Choice.mmObject(), PartyIdentification101.mmObject(), PartyIdentification111Choice.mmObject(), PartyIdentification102.mmObject(),
						IdentificationType44Choice.mmObject(), PartyIdentificationAndAccount129.mmObject(), PartyIdentificationAndAccount130.mmObject(), AlternatePartyIdentification9.mmObject(), PartyIdentification103Choice.mmObject(),
						PartyIdentification113Choice.mmObject(), PartyIdentificationAndAccount128.mmObject(), PartyIdentification108.mmObject(), PartyIdentificationAndAccount133.mmObject(), PartyIdentification103.mmObject(),
						PartyIdentificationAndAccount131.mmObject(), PartyIdentificationAndAccount146.mmObject(), PartyIdentificationAndAccount136.mmObject(), PartyIdentificationAndAccount134.mmObject(), PartyIdentification109.mmObject(),
						PartyIdentification111.mmObject(), PartyIdentification110.mmObject(), PartyIdentification115Choice.mmObject(), SafeKeepingPlace2.mmObject(), PartyIdentification114Choice.mmObject(),
						PlaceOfTradeIdentification2.mmObject(), Pledgee2.mmObject(), PartyIdentification95Choice.mmObject(), CounterpartyIdentification2Choice.mmObject(), PartyIdentification112.mmObject(),
						PartyIdentification113.mmObject(), PartyIdentificationAndAccount147.mmObject(), PartyIdentification119.mmObject(), PartyIdentification120.mmObject(), CounterpartyIdentification3Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}