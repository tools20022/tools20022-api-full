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
import com.tools20022.repository.codeset.SettlementDate2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates the date of settlement in coded form.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDate2Code#Regular
 * SettlementDate2Code.Regular}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SettlementDate2Code#Cash
 * SettlementDate2Code.Cash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDate2Code#NextDay
 * SettlementDate2Code.NextDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDate2Code#TPlusOne
 * SettlementDate2Code.TPlusOne}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDate2Code#TPlusTwo
 * SettlementDate2Code.TPlusTwo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDate2Code#TPlusThree
 * SettlementDate2Code.TPlusThree}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDate2Code#TPlusFour
 * SettlementDate2Code.TPlusFour}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDate2Code#TPlusFive
 * SettlementDate2Code.TPlusFive}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDate2Code#SellersOption
 * SettlementDate2Code.SellersOption}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SettlementDate2Code#Future
 * SettlementDate2Code.Future}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDate2Code#AsSoonAsPossible
 * SettlementDate2Code.AsSoonAsPossible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDate2Code#AtEndOfContract
 * SettlementDate2Code.AtEndOfContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDate2Code#WhenAndIfIssued
 * SettlementDate2Code.WhenAndIfIssued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDate2Code#WhenDistributed
 * SettlementDate2Code.WhenDistributed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDate2Code#WhenIssuedOrDistributed
 * SettlementDate2Code.WhenIssuedOrDistributed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDate2Code#ToBeAnnouncedTrade
 * SettlementDate2Code.ToBeAnnouncedTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDate2Code#EndOfMonth
 * SettlementDate2Code.EndOfMonth}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode
 * SettlementDateCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"REGU"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementDate2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates the date of settlement in coded form."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SettlementDate2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDate2Code
	 * SettlementDate2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Regular"</li>
	 * </ul>
	 */
	public static final SettlementDate2Code Regular = new SettlementDate2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Regular";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDate2Code.mmObject();
			codeName = SettlementDateCode.Regular.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDate2Code
	 * SettlementDate2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cash"</li>
	 * </ul>
	 */
	public static final SettlementDate2Code Cash = new SettlementDate2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cash";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDate2Code.mmObject();
			codeName = SettlementDateCode.Cash.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDate2Code
	 * SettlementDate2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextDay"</li>
	 * </ul>
	 */
	public static final SettlementDate2Code NextDay = new SettlementDate2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextDay";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDate2Code.mmObject();
			codeName = SettlementDateCode.NextDay.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDate2Code
	 * SettlementDate2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TPlusOne"</li>
	 * </ul>
	 */
	public static final SettlementDate2Code TPlusOne = new SettlementDate2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TPlusOne";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDate2Code.mmObject();
			codeName = SettlementDateCode.TPlusOne.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDate2Code
	 * SettlementDate2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TPlusTwo"</li>
	 * </ul>
	 */
	public static final SettlementDate2Code TPlusTwo = new SettlementDate2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TPlusTwo";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDate2Code.mmObject();
			codeName = SettlementDateCode.TPlusTwo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDate2Code
	 * SettlementDate2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TPlusThree"</li>
	 * </ul>
	 */
	public static final SettlementDate2Code TPlusThree = new SettlementDate2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TPlusThree";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDate2Code.mmObject();
			codeName = SettlementDateCode.TPlusThree.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDate2Code
	 * SettlementDate2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TPlusFour"</li>
	 * </ul>
	 */
	public static final SettlementDate2Code TPlusFour = new SettlementDate2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TPlusFour";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDate2Code.mmObject();
			codeName = SettlementDateCode.TPlusFour.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDate2Code
	 * SettlementDate2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TPlusFive"</li>
	 * </ul>
	 */
	public static final SettlementDate2Code TPlusFive = new SettlementDate2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TPlusFive";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDate2Code.mmObject();
			codeName = SettlementDateCode.TPlusFive.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDate2Code
	 * SettlementDate2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellersOption"</li>
	 * </ul>
	 */
	public static final SettlementDate2Code SellersOption = new SettlementDate2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellersOption";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDate2Code.mmObject();
			codeName = SettlementDateCode.SellersOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDate2Code
	 * SettlementDate2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Future"</li>
	 * </ul>
	 */
	public static final SettlementDate2Code Future = new SettlementDate2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Future";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDate2Code.mmObject();
			codeName = SettlementDateCode.Future.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDate2Code
	 * SettlementDate2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AsSoonAsPossible"</li>
	 * </ul>
	 */
	public static final SettlementDate2Code AsSoonAsPossible = new SettlementDate2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AsSoonAsPossible";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDate2Code.mmObject();
			codeName = SettlementDateCode.AsSoonAsPossible.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDate2Code
	 * SettlementDate2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AtEndOfContract"</li>
	 * </ul>
	 */
	public static final SettlementDate2Code AtEndOfContract = new SettlementDate2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AtEndOfContract";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDate2Code.mmObject();
			codeName = SettlementDateCode.AtEndOfContract.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDate2Code
	 * SettlementDate2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WhenAndIfIssued"</li>
	 * </ul>
	 */
	public static final SettlementDate2Code WhenAndIfIssued = new SettlementDate2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WhenAndIfIssued";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDate2Code.mmObject();
			codeName = SettlementDateCode.WhenAndIfIssued.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDate2Code
	 * SettlementDate2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WhenDistributed"</li>
	 * </ul>
	 */
	public static final SettlementDate2Code WhenDistributed = new SettlementDate2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WhenDistributed";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDate2Code.mmObject();
			codeName = SettlementDateCode.WhenDistributed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDate2Code
	 * SettlementDate2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WhenIssuedOrDistributed"</li>
	 * </ul>
	 */
	public static final SettlementDate2Code WhenIssuedOrDistributed = new SettlementDate2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WhenIssuedOrDistributed";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDate2Code.mmObject();
			codeName = SettlementDateCode.WhenIssuedOrDistributed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDate2Code
	 * SettlementDate2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToBeAnnouncedTrade"</li>
	 * </ul>
	 */
	public static final SettlementDate2Code ToBeAnnouncedTrade = new SettlementDate2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ToBeAnnouncedTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDate2Code.mmObject();
			codeName = SettlementDateCode.ToBeAnnouncedTrade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDate2Code
	 * SettlementDate2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfMonth"</li>
	 * </ul>
	 */
	public static final SettlementDate2Code EndOfMonth = new SettlementDate2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfMonth";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDate2Code.mmObject();
			codeName = SettlementDateCode.EndOfMonth.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SettlementDate2Code> codesByName = new LinkedHashMap<>();

	protected SettlementDate2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("REGU");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementDate2Code";
				definition = "Indicates the date of settlement in coded form.";
				trace_lazy = () -> SettlementDateCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementDate2Code.Regular, com.tools20022.repository.codeset.SettlementDate2Code.Cash, com.tools20022.repository.codeset.SettlementDate2Code.NextDay,
						com.tools20022.repository.codeset.SettlementDate2Code.TPlusOne, com.tools20022.repository.codeset.SettlementDate2Code.TPlusTwo, com.tools20022.repository.codeset.SettlementDate2Code.TPlusThree,
						com.tools20022.repository.codeset.SettlementDate2Code.TPlusFour, com.tools20022.repository.codeset.SettlementDate2Code.TPlusFive, com.tools20022.repository.codeset.SettlementDate2Code.SellersOption,
						com.tools20022.repository.codeset.SettlementDate2Code.Future, com.tools20022.repository.codeset.SettlementDate2Code.AsSoonAsPossible, com.tools20022.repository.codeset.SettlementDate2Code.AtEndOfContract,
						com.tools20022.repository.codeset.SettlementDate2Code.WhenAndIfIssued, com.tools20022.repository.codeset.SettlementDate2Code.WhenDistributed,
						com.tools20022.repository.codeset.SettlementDate2Code.WhenIssuedOrDistributed, com.tools20022.repository.codeset.SettlementDate2Code.ToBeAnnouncedTrade,
						com.tools20022.repository.codeset.SettlementDate2Code.EndOfMonth);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Regular.getCodeName().get(), Regular);
		codesByName.put(Cash.getCodeName().get(), Cash);
		codesByName.put(NextDay.getCodeName().get(), NextDay);
		codesByName.put(TPlusOne.getCodeName().get(), TPlusOne);
		codesByName.put(TPlusTwo.getCodeName().get(), TPlusTwo);
		codesByName.put(TPlusThree.getCodeName().get(), TPlusThree);
		codesByName.put(TPlusFour.getCodeName().get(), TPlusFour);
		codesByName.put(TPlusFive.getCodeName().get(), TPlusFive);
		codesByName.put(SellersOption.getCodeName().get(), SellersOption);
		codesByName.put(Future.getCodeName().get(), Future);
		codesByName.put(AsSoonAsPossible.getCodeName().get(), AsSoonAsPossible);
		codesByName.put(AtEndOfContract.getCodeName().get(), AtEndOfContract);
		codesByName.put(WhenAndIfIssued.getCodeName().get(), WhenAndIfIssued);
		codesByName.put(WhenDistributed.getCodeName().get(), WhenDistributed);
		codesByName.put(WhenIssuedOrDistributed.getCodeName().get(), WhenIssuedOrDistributed);
		codesByName.put(ToBeAnnouncedTrade.getCodeName().get(), ToBeAnnouncedTrade);
		codesByName.put(EndOfMonth.getCodeName().get(), EndOfMonth);
	}

	public static SettlementDate2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SettlementDate2Code[] values() {
		SettlementDate2Code[] values = new SettlementDate2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SettlementDate2Code> {
		@Override
		public SettlementDate2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SettlementDate2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}