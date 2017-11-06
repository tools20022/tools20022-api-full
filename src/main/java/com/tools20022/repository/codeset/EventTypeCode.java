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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies the type of event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.EventTypeCode#mmPut
 * EventTypeCode.mmPut}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EventTypeCode#mmCall
 * EventTypeCode.mmCall}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EventTypeCode#mmTender
 * EventTypeCode.mmTender}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EventTypeCode#mmActivation
 * EventTypeCode.mmActivation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventTypeCode#mmInactivation
 * EventTypeCode.mmInactivation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventTypeCode#mmSinkingFundCall
 * EventTypeCode.mmSinkingFundCall}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.EventType1Code
 * EventType1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"PUT1"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EventTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the type of event."</li>
 * </ul>
 */
public class EventTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * In fixed income this is the put provision on the bond allowing the
	 * investor the right to
	 * "redeem the bond at a specified price prior to maturity".
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventTypeCode
	 * EventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PUT1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Put"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In fixed income this is the put provision on the bond allowing the investor the right to \"redeem the bond at a specified price prior to maturity\"."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPut = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Put";
			definition = "In fixed income this is the put provision on the bond allowing the investor the right to \"redeem the bond at a specified price prior to maturity\".";
			owner_lazy = () -> EventTypeCode.mmObject();
			codeName = "PUT1";
		}
	};
	/**
	 * In fixed income this is the call provision on the bond allowing the bond
	 * issuer
	 * "the right to redeem [the bond] prior to its maturity date, under certain conditions."
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventTypeCode
	 * EventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CALL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Call"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In fixed income this is the call provision on the bond allowing the bond issuer \"the right to redeem [the bond] prior to its maturity date, under certain conditions.\""
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCall = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Call";
			definition = "In fixed income this is the call provision on the bond allowing the bond issuer \"the right to redeem [the bond] prior to its maturity date, under certain conditions.\"";
			owner_lazy = () -> EventTypeCode.mmObject();
			codeName = "CALL";
		}
	};
	/**
	 * Synonymous with Put but is the preferred term for certain asset classes
	 * in some markets.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventTypeCode
	 * EventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TEND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tender"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Synonymous with Put but is the preferred term for certain asset classes in some markets."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTender = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tender";
			definition = "Synonymous with Put but is the preferred term for certain asset classes in some markets.";
			owner_lazy = () -> EventTypeCode.mmObject();
			codeName = "TEND";
		}
	};
	/**
	 * Date when the security is activated for trading and clearing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventTypeCode
	 * EventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACTI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Activation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date when the security is activated for trading and clearing."</li>
	 * </ul>
	 */
	public static final MMCode mmActivation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Activation";
			definition = "Date when the security is activated for trading and clearing.";
			owner_lazy = () -> EventTypeCode.mmObject();
			codeName = "ACTI";
		}
	};
	/**
	 * Date when the security is no longer available for trading and clearing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventTypeCode
	 * EventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Inactivation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date when the security is no longer available for trading and clearing."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInactivation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Inactivation";
			definition = "Date when the security is no longer available for trading and clearing.";
			owner_lazy = () -> EventTypeCode.mmObject();
			codeName = "INAC";
		}
	};
	/**
	 * A provision allowing a bond issuer the opportunity to buy outstanding
	 * bonds from bondholders for a set rate, using money (a sinking fund) from
	 * the issuer's earnings saved specifically for security buybacks. Because
	 * it adds doubt for investors over whether the bond will continue to pay
	 * until its maturity date, a sinking fund call is seen as an additional
	 * risk for investors.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventTypeCode
	 * EventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFCA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SinkingFundCall"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A provision allowing a bond issuer the opportunity to buy outstanding bonds from bondholders for a set rate, using money (a sinking fund) from the issuer's earnings saved specifically for security buybacks. Because it adds doubt for investors over whether the bond will continue to pay until its maturity date, a sinking fund call is seen as an additional risk for investors."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSinkingFundCall = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SinkingFundCall";
			definition = "A provision allowing a bond issuer the opportunity to buy outstanding bonds from bondholders for a set rate, using money (a sinking fund) from the issuer's earnings saved specifically for security buybacks. Because it adds doubt for investors over whether the bond will continue to pay until its maturity date, a sinking fund call is seen as an additional risk for investors.";
			owner_lazy = () -> EventTypeCode.mmObject();
			codeName = "SFCA";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("PUT1");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "EventTypeCode";
				definition = "Identifies the type of event.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EventTypeCode.mmPut, com.tools20022.repository.codeset.EventTypeCode.mmCall, com.tools20022.repository.codeset.EventTypeCode.mmTender,
						com.tools20022.repository.codeset.EventTypeCode.mmActivation, com.tools20022.repository.codeset.EventTypeCode.mmInactivation, com.tools20022.repository.codeset.EventTypeCode.mmSinkingFundCall);
				derivation_lazy = () -> Arrays.asList(EventType1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}