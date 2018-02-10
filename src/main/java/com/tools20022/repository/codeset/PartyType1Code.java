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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.PartyType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of party involved in the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyType1Code#ExecutingFirm
 * PartyType1Code.ExecutingFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyType1Code#BrokerOfCredit
 * PartyType1Code.BrokerOfCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyType1Code#CorrespondentClearingFirm
 * PartyType1Code.CorrespondentClearingFirm}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyType1Code#ContraFirm
 * PartyType1Code.ContraFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyType1Code#ContraClearingFirm
 * PartyType1Code.ContraClearingFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyType1Code#UnderlyingContraFirm
 * PartyType1Code.UnderlyingContraFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyType1Code#GiveUpClearingFirm
 * PartyType1Code.GiveUpClearingFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyType1Code#OrderOriginationFirm
 * PartyType1Code.OrderOriginationFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyType1Code#SponsoringFirm
 * PartyType1Code.SponsoringFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyType1Code#Clearingfirm
 * PartyType1Code.Clearingfirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyType1Code#IntroducingFirm
 * PartyType1Code.IntroducingFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyType1Code#EnteringFirm
 * PartyType1Code.EnteringFirm}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyType1Code#Client
 * PartyType1Code.Client}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyType1Code#StepInBroker
 * PartyType1Code.StepInBroker}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyType1Code#AffirmingParty
 * PartyType1Code.AffirmingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyType1Code#ETCServiceProvider1
 * PartyType1Code.ETCServiceProvider1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyType1Code#ETCServiceProvider2
 * PartyType1Code.ETCServiceProvider2}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyType1Code#Investor
 * PartyType1Code.Investor}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode PartyTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"EXEC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartyType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of party involved in the transaction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PartyType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType1Code
	 * PartyType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutingFirm"</li>
	 * </ul>
	 */
	public static final PartyType1Code ExecutingFirm = new PartyType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutingFirm";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyType1Code.mmObject();
			codeName = PartyTypeCode.ExecutingFirm.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType1Code
	 * PartyType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BrokerOfCredit"</li>
	 * </ul>
	 */
	public static final PartyType1Code BrokerOfCredit = new PartyType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BrokerOfCredit";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyType1Code.mmObject();
			codeName = PartyTypeCode.BrokerOfCredit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType1Code
	 * PartyType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorrespondentClearingFirm"</li>
	 * </ul>
	 */
	public static final PartyType1Code CorrespondentClearingFirm = new PartyType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorrespondentClearingFirm";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyType1Code.mmObject();
			codeName = PartyTypeCode.CorrespondentClearingFirm.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType1Code
	 * PartyType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContraFirm"</li>
	 * </ul>
	 */
	public static final PartyType1Code ContraFirm = new PartyType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContraFirm";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyType1Code.mmObject();
			codeName = PartyTypeCode.ContraFirm.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType1Code
	 * PartyType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContraClearingFirm"</li>
	 * </ul>
	 */
	public static final PartyType1Code ContraClearingFirm = new PartyType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContraClearingFirm";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyType1Code.mmObject();
			codeName = PartyTypeCode.ContraClearingFirm.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType1Code
	 * PartyType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingContraFirm"</li>
	 * </ul>
	 */
	public static final PartyType1Code UnderlyingContraFirm = new PartyType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingContraFirm";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyType1Code.mmObject();
			codeName = PartyTypeCode.UnderlyingContraFirm.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType1Code
	 * PartyType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GiveUpClearingFirm"</li>
	 * </ul>
	 */
	public static final PartyType1Code GiveUpClearingFirm = new PartyType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GiveUpClearingFirm";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyType1Code.mmObject();
			codeName = PartyTypeCode.GiveUpClearingFirm.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType1Code
	 * PartyType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderOriginationFirm"</li>
	 * </ul>
	 */
	public static final PartyType1Code OrderOriginationFirm = new PartyType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginationFirm";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyType1Code.mmObject();
			codeName = PartyTypeCode.OrderOriginationFirm.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType1Code
	 * PartyType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SponsoringFirm"</li>
	 * </ul>
	 */
	public static final PartyType1Code SponsoringFirm = new PartyType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SponsoringFirm";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyType1Code.mmObject();
			codeName = PartyTypeCode.SponsoringFirm.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType1Code
	 * PartyType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Clearingfirm"</li>
	 * </ul>
	 */
	public static final PartyType1Code Clearingfirm = new PartyType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Clearingfirm";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyType1Code.mmObject();
			codeName = PartyTypeCode.Clearingfirm.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType1Code
	 * PartyType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntroducingFirm"</li>
	 * </ul>
	 */
	public static final PartyType1Code IntroducingFirm = new PartyType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntroducingFirm";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyType1Code.mmObject();
			codeName = PartyTypeCode.IntroducingFirm.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType1Code
	 * PartyType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EnteringFirm"</li>
	 * </ul>
	 */
	public static final PartyType1Code EnteringFirm = new PartyType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EnteringFirm";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyType1Code.mmObject();
			codeName = PartyTypeCode.EnteringFirm.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType1Code
	 * PartyType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Client"</li>
	 * </ul>
	 */
	public static final PartyType1Code Client = new PartyType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Client";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyType1Code.mmObject();
			codeName = PartyTypeCode.Client.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType1Code
	 * PartyType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StepInBroker"</li>
	 * </ul>
	 */
	public static final PartyType1Code StepInBroker = new PartyType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StepInBroker";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyType1Code.mmObject();
			codeName = PartyTypeCode.StepInBroker.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType1Code
	 * PartyType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AffirmingParty"</li>
	 * </ul>
	 */
	public static final PartyType1Code AffirmingParty = new PartyType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffirmingParty";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyType1Code.mmObject();
			codeName = PartyTypeCode.AffirmingParty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType1Code
	 * PartyType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ETCServiceProvider1"</li>
	 * </ul>
	 */
	public static final PartyType1Code ETCServiceProvider1 = new PartyType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ETCServiceProvider1";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyType1Code.mmObject();
			codeName = PartyTypeCode.ETCServiceProvider1.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType1Code
	 * PartyType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ETCServiceProvider2"</li>
	 * </ul>
	 */
	public static final PartyType1Code ETCServiceProvider2 = new PartyType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ETCServiceProvider2";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyType1Code.mmObject();
			codeName = PartyTypeCode.ETCServiceProvider2.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType1Code
	 * PartyType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Investor"</li>
	 * </ul>
	 */
	public static final PartyType1Code Investor = new PartyType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Investor";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyType1Code.mmObject();
			codeName = PartyTypeCode.Investor.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PartyType1Code> codesByName = new LinkedHashMap<>();

	protected PartyType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("EXEC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyType1Code";
				definition = "Specifies the type of party involved in the transaction.";
				trace_lazy = () -> PartyTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PartyType1Code.ExecutingFirm, com.tools20022.repository.codeset.PartyType1Code.BrokerOfCredit,
						com.tools20022.repository.codeset.PartyType1Code.CorrespondentClearingFirm, com.tools20022.repository.codeset.PartyType1Code.ContraFirm, com.tools20022.repository.codeset.PartyType1Code.ContraClearingFirm,
						com.tools20022.repository.codeset.PartyType1Code.UnderlyingContraFirm, com.tools20022.repository.codeset.PartyType1Code.GiveUpClearingFirm, com.tools20022.repository.codeset.PartyType1Code.OrderOriginationFirm,
						com.tools20022.repository.codeset.PartyType1Code.SponsoringFirm, com.tools20022.repository.codeset.PartyType1Code.Clearingfirm, com.tools20022.repository.codeset.PartyType1Code.IntroducingFirm,
						com.tools20022.repository.codeset.PartyType1Code.EnteringFirm, com.tools20022.repository.codeset.PartyType1Code.Client, com.tools20022.repository.codeset.PartyType1Code.StepInBroker,
						com.tools20022.repository.codeset.PartyType1Code.AffirmingParty, com.tools20022.repository.codeset.PartyType1Code.ETCServiceProvider1, com.tools20022.repository.codeset.PartyType1Code.ETCServiceProvider2,
						com.tools20022.repository.codeset.PartyType1Code.Investor);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ExecutingFirm.getCodeName().get(), ExecutingFirm);
		codesByName.put(BrokerOfCredit.getCodeName().get(), BrokerOfCredit);
		codesByName.put(CorrespondentClearingFirm.getCodeName().get(), CorrespondentClearingFirm);
		codesByName.put(ContraFirm.getCodeName().get(), ContraFirm);
		codesByName.put(ContraClearingFirm.getCodeName().get(), ContraClearingFirm);
		codesByName.put(UnderlyingContraFirm.getCodeName().get(), UnderlyingContraFirm);
		codesByName.put(GiveUpClearingFirm.getCodeName().get(), GiveUpClearingFirm);
		codesByName.put(OrderOriginationFirm.getCodeName().get(), OrderOriginationFirm);
		codesByName.put(SponsoringFirm.getCodeName().get(), SponsoringFirm);
		codesByName.put(Clearingfirm.getCodeName().get(), Clearingfirm);
		codesByName.put(IntroducingFirm.getCodeName().get(), IntroducingFirm);
		codesByName.put(EnteringFirm.getCodeName().get(), EnteringFirm);
		codesByName.put(Client.getCodeName().get(), Client);
		codesByName.put(StepInBroker.getCodeName().get(), StepInBroker);
		codesByName.put(AffirmingParty.getCodeName().get(), AffirmingParty);
		codesByName.put(ETCServiceProvider1.getCodeName().get(), ETCServiceProvider1);
		codesByName.put(ETCServiceProvider2.getCodeName().get(), ETCServiceProvider2);
		codesByName.put(Investor.getCodeName().get(), Investor);
	}

	public static PartyType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PartyType1Code[] values() {
		PartyType1Code[] values = new PartyType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PartyType1Code> {
		@Override
		public PartyType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PartyType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}