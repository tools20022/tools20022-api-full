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
import com.tools20022.repository.codeset.AuthorityExchangeReasonCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason for the exchange with the national competent authority.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode#CompetentAuthorityForInstrument
 * AuthorityExchangeReasonCode.CompetentAuthorityForInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode#CompetentAuthorityForHeadquarter
 * AuthorityExchangeReasonCode.CompetentAuthorityForHeadquarter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode#AdHocRequest
 * AuthorityExchangeReasonCode.AdHocRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode#Other
 * AuthorityExchangeReasonCode.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode#CompetentAuthorityForDirectUnderlying
 * AuthorityExchangeReasonCode.CompetentAuthorityForDirectUnderlying}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode#CompetentAuthorityForBasketConstituent
 * AuthorityExchangeReasonCode.CompetentAuthorityForBasketConstituent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode#CompetentAuthorityForBuyerBranch
 * AuthorityExchangeReasonCode.CompetentAuthorityForBuyerBranch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode#CompetentAuthorityForSellerBranch
 * AuthorityExchangeReasonCode.CompetentAuthorityForSellerBranch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode#CompetentAuthorityForMembershipBranch
 * AuthorityExchangeReasonCode.CompetentAuthorityForMembershipBranch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode#CompetentAuthorityForDecisionMakingBranch
 * AuthorityExchangeReasonCode.CompetentAuthorityForDecisionMakingBranch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode#CompetentAuthorityForExecutingBranch
 * AuthorityExchangeReasonCode.CompetentAuthorityForExecutingBranch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode#CompetentAuthorityForTradingVenue
 * AuthorityExchangeReasonCode.CompetentAuthorityForTradingVenue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode#CompetentAuthorityForIndex
 * AuthorityExchangeReasonCode.CompetentAuthorityForIndex}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReason1Code
 * AuthorityExchangeReason1Code}</li>
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
 * "AuthorityExchangeReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason for the exchange with the national competent authority."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AuthorityExchangeReasonCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Competent Authority for Instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode
	 * AuthorityExchangeReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAFI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompetentAuthorityForInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Competent Authority for Instrument."</li>
	 * </ul>
	 */
	public static final AuthorityExchangeReasonCode CompetentAuthorityForInstrument = new AuthorityExchangeReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompetentAuthorityForInstrument";
			definition = "Competent Authority for Instrument.";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthorityExchangeReasonCode.mmObject();
			codeName = "CAFI";
		}
	};
	/**
	 * Competent Authority for Headquarter.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode
	 * AuthorityExchangeReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAFH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompetentAuthorityForHeadquarter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Competent Authority for Headquarter."</li>
	 * </ul>
	 */
	public static final AuthorityExchangeReasonCode CompetentAuthorityForHeadquarter = new AuthorityExchangeReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompetentAuthorityForHeadquarter";
			definition = "Competent Authority for Headquarter.";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthorityExchangeReasonCode.mmObject();
			codeName = "CAFH";
		}
	};
	/**
	 * Ad Hoc Request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode
	 * AuthorityExchangeReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdHocRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ad Hoc Request."</li>
	 * </ul>
	 */
	public static final AuthorityExchangeReasonCode AdHocRequest = new AuthorityExchangeReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdHocRequest";
			definition = "Ad Hoc Request.";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthorityExchangeReasonCode.mmObject();
			codeName = "ADHR";
		}
	};
	/**
	 * Where reason code is not previously defined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode
	 * AuthorityExchangeReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Where reason code is not previously defined."</li>
	 * </ul>
	 */
	public static final AuthorityExchangeReasonCode Other = new AuthorityExchangeReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Where reason code is not previously defined.";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthorityExchangeReasonCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Competent Authority for Direct Underlying.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode
	 * AuthorityExchangeReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CADU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompetentAuthorityForDirectUnderlying"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Competent Authority for Direct Underlying."</li>
	 * </ul>
	 */
	public static final AuthorityExchangeReasonCode CompetentAuthorityForDirectUnderlying = new AuthorityExchangeReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompetentAuthorityForDirectUnderlying";
			definition = "Competent Authority for Direct Underlying.";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthorityExchangeReasonCode.mmObject();
			codeName = "CADU";
		}
	};
	/**
	 * Competent Authority for Basket Constituent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode
	 * AuthorityExchangeReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CABC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompetentAuthorityForBasketConstituent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Competent Authority for Basket Constituent."</li>
	 * </ul>
	 */
	public static final AuthorityExchangeReasonCode CompetentAuthorityForBasketConstituent = new AuthorityExchangeReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompetentAuthorityForBasketConstituent";
			definition = "Competent Authority for Basket Constituent.";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthorityExchangeReasonCode.mmObject();
			codeName = "CABC";
		}
	};
	/**
	 * Competent Authority for Buyer Branch.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode
	 * AuthorityExchangeReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CABB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompetentAuthorityForBuyerBranch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Competent Authority for Buyer Branch."</li>
	 * </ul>
	 */
	public static final AuthorityExchangeReasonCode CompetentAuthorityForBuyerBranch = new AuthorityExchangeReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompetentAuthorityForBuyerBranch";
			definition = "Competent Authority for Buyer Branch.";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthorityExchangeReasonCode.mmObject();
			codeName = "CABB";
		}
	};
	/**
	 * Competent Authority for Seller Branch.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode
	 * AuthorityExchangeReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CASB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompetentAuthorityForSellerBranch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Competent Authority for Seller Branch."</li>
	 * </ul>
	 */
	public static final AuthorityExchangeReasonCode CompetentAuthorityForSellerBranch = new AuthorityExchangeReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompetentAuthorityForSellerBranch";
			definition = "Competent Authority for Seller Branch.";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthorityExchangeReasonCode.mmObject();
			codeName = "CASB";
		}
	};
	/**
	 * Competent Authority for Membership Branch.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode
	 * AuthorityExchangeReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAMB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompetentAuthorityForMembershipBranch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Competent Authority for Membership Branch."</li>
	 * </ul>
	 */
	public static final AuthorityExchangeReasonCode CompetentAuthorityForMembershipBranch = new AuthorityExchangeReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompetentAuthorityForMembershipBranch";
			definition = "Competent Authority for Membership Branch.";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthorityExchangeReasonCode.mmObject();
			codeName = "CAMB";
		}
	};
	/**
	 * Competent Authority for Decision Making Branch.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode
	 * AuthorityExchangeReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CADB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompetentAuthorityForDecisionMakingBranch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Competent Authority for Decision Making Branch."</li>
	 * </ul>
	 */
	public static final AuthorityExchangeReasonCode CompetentAuthorityForDecisionMakingBranch = new AuthorityExchangeReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompetentAuthorityForDecisionMakingBranch";
			definition = "Competent Authority for Decision Making Branch.";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthorityExchangeReasonCode.mmObject();
			codeName = "CADB";
		}
	};
	/**
	 * Competent Authority for Executing Branch.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode
	 * AuthorityExchangeReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAEB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompetentAuthorityForExecutingBranch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Competent Authority for Executing Branch."</li>
	 * </ul>
	 */
	public static final AuthorityExchangeReasonCode CompetentAuthorityForExecutingBranch = new AuthorityExchangeReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompetentAuthorityForExecutingBranch";
			definition = "Competent Authority for Executing Branch.";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthorityExchangeReasonCode.mmObject();
			codeName = "CAEB";
		}
	};
	/**
	 * Competent Authority for Trading Venue.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode
	 * AuthorityExchangeReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CATV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompetentAuthorityForTradingVenue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Competent Authority for Trading Venue."</li>
	 * </ul>
	 */
	public static final AuthorityExchangeReasonCode CompetentAuthorityForTradingVenue = new AuthorityExchangeReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompetentAuthorityForTradingVenue";
			definition = "Competent Authority for Trading Venue.";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthorityExchangeReasonCode.mmObject();
			codeName = "CATV";
		}
	};
	/**
	 * Competent Authority for Index.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode
	 * AuthorityExchangeReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAIX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompetentAuthorityForIndex"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Competent Authority for Index."</li>
	 * </ul>
	 */
	public static final AuthorityExchangeReasonCode CompetentAuthorityForIndex = new AuthorityExchangeReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompetentAuthorityForIndex";
			definition = "Competent Authority for Index.";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthorityExchangeReasonCode.mmObject();
			codeName = "CAIX";
		}
	};
	final static private LinkedHashMap<String, AuthorityExchangeReasonCode> codesByName = new LinkedHashMap<>();

	protected AuthorityExchangeReasonCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AuthorityExchangeReasonCode";
				definition = "Specifies the reason for the exchange with the national competent authority.";
				derivation_lazy = () -> Arrays.asList(AuthorityExchangeReason1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AuthorityExchangeReasonCode.CompetentAuthorityForInstrument, com.tools20022.repository.codeset.AuthorityExchangeReasonCode.CompetentAuthorityForHeadquarter,
						com.tools20022.repository.codeset.AuthorityExchangeReasonCode.AdHocRequest, com.tools20022.repository.codeset.AuthorityExchangeReasonCode.Other,
						com.tools20022.repository.codeset.AuthorityExchangeReasonCode.CompetentAuthorityForDirectUnderlying, com.tools20022.repository.codeset.AuthorityExchangeReasonCode.CompetentAuthorityForBasketConstituent,
						com.tools20022.repository.codeset.AuthorityExchangeReasonCode.CompetentAuthorityForBuyerBranch, com.tools20022.repository.codeset.AuthorityExchangeReasonCode.CompetentAuthorityForSellerBranch,
						com.tools20022.repository.codeset.AuthorityExchangeReasonCode.CompetentAuthorityForMembershipBranch, com.tools20022.repository.codeset.AuthorityExchangeReasonCode.CompetentAuthorityForDecisionMakingBranch,
						com.tools20022.repository.codeset.AuthorityExchangeReasonCode.CompetentAuthorityForExecutingBranch, com.tools20022.repository.codeset.AuthorityExchangeReasonCode.CompetentAuthorityForTradingVenue,
						com.tools20022.repository.codeset.AuthorityExchangeReasonCode.CompetentAuthorityForIndex);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CompetentAuthorityForInstrument.getCodeName().get(), CompetentAuthorityForInstrument);
		codesByName.put(CompetentAuthorityForHeadquarter.getCodeName().get(), CompetentAuthorityForHeadquarter);
		codesByName.put(AdHocRequest.getCodeName().get(), AdHocRequest);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(CompetentAuthorityForDirectUnderlying.getCodeName().get(), CompetentAuthorityForDirectUnderlying);
		codesByName.put(CompetentAuthorityForBasketConstituent.getCodeName().get(), CompetentAuthorityForBasketConstituent);
		codesByName.put(CompetentAuthorityForBuyerBranch.getCodeName().get(), CompetentAuthorityForBuyerBranch);
		codesByName.put(CompetentAuthorityForSellerBranch.getCodeName().get(), CompetentAuthorityForSellerBranch);
		codesByName.put(CompetentAuthorityForMembershipBranch.getCodeName().get(), CompetentAuthorityForMembershipBranch);
		codesByName.put(CompetentAuthorityForDecisionMakingBranch.getCodeName().get(), CompetentAuthorityForDecisionMakingBranch);
		codesByName.put(CompetentAuthorityForExecutingBranch.getCodeName().get(), CompetentAuthorityForExecutingBranch);
		codesByName.put(CompetentAuthorityForTradingVenue.getCodeName().get(), CompetentAuthorityForTradingVenue);
		codesByName.put(CompetentAuthorityForIndex.getCodeName().get(), CompetentAuthorityForIndex);
	}

	public static AuthorityExchangeReasonCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AuthorityExchangeReasonCode[] values() {
		AuthorityExchangeReasonCode[] values = new AuthorityExchangeReasonCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AuthorityExchangeReasonCode> {
		@Override
		public AuthorityExchangeReasonCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AuthorityExchangeReasonCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}